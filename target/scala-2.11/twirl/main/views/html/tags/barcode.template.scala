
package views.html.tags

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object barcode_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class barcode extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ean: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.13*/("""
"""),format.raw/*2.1*/("""<img class="barcode" alt=""""),_display_(/*2.28*/ean),format.raw/*2.31*/("""" src=""""),_display_(/*2.39*/routes/*2.45*/.Barcodes.barcode(ean)),format.raw/*2.67*/("""">"""))
      }
    }
  }

  def render(ean:Long): play.twirl.api.HtmlFormat.Appendable = apply(ean)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (ean) => apply(ean)

  def ref: this.type = this

}


}

/**/
object barcode extends barcode_Scope0.barcode
              /*
                  -- GENERATED --
                  DATE: Fri Mar 07 11:20:34 BRT 2025
                  SOURCE: C:/Users/Sergio/Desktop/scala/products/app/views/tags/barcode.scala.html
                  HASH: 158c6972953cbd6fd697d13359e940a6b2505a38
                  MATRIX: 534->1|640->12|668->14|721->41|744->44|778->52|792->58|834->80
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|26->2|26->2
                  -- GENERATED --
              */
          