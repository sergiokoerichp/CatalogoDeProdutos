package controllers

import play.api.mvc._
import java.lang.IllegalArgumentException

object Barcodes extends Controller {
  val ImageResolution = 144

  def barcode(ean: Long) = Action {
    try {
      val imageData = ean13BarCode(ean, ImageResolution)
      Ok(imageData).as("image/png")
    } catch {
      case e: IllegalArgumentException => BadRequest("Couldn't generate bar code: " + e.getMessage)
    }
  }

  private def ean13BarCode(ean: Long, resolution: Int): Array[Byte] = {
    import org.krysalis.barcode4j.impl.upcean.EAN13Bean
    import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider
    import java.awt.image.BufferedImage
    import java.io.ByteArrayOutputStream

    val barcode = new EAN13Bean()
    barcode.setModuleWidth(0.2)  // Largura do módulo
    barcode.setBarHeight(15)
    barcode.setFontSize(2.0)
    barcode.doQuietZone(true)

    val baos = new ByteArrayOutputStream()
    val canvas = new BitmapCanvasProvider(
      baos, "image/x-png", resolution, BufferedImage.TYPE_BYTE_BINARY, false, 0
    )

    // Gera o código de barras
    barcode.generateBarcode(canvas, f"$ean%013d")
    canvas.finish()

    baos.toByteArray
  }
}
