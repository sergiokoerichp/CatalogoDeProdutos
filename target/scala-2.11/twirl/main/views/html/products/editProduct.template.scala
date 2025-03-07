
package views.html.products

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editProduct_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[models.Product],play.api.i18n.Messages,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product])(implicit messages: play.api.i18n.Messages, flash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.107*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(Messages("products.form"))/*5.33*/{_display_(Seq[Any](format.raw/*5.34*/("""
    """),format.raw/*6.5*/("""<h2>"""),_display_(/*6.10*/Messages("products.form")),format.raw/*6.35*/("""</h2>

    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.Products.save())/*8.50*/{_display_(Seq[Any](format.raw/*8.51*/("""
        """),format.raw/*9.9*/("""<fieldset>
            <legend>
                """),_display_(/*11.18*/Messages("products.details", productForm("name").value.getOrElse(Messages("products.new")))),format.raw/*11.109*/("""
            """),format.raw/*12.13*/("""</legend>
            """),_display_(/*13.14*/helper/*13.20*/.inputText(productForm("ean"))),format.raw/*13.50*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(productForm("name"))),format.raw/*14.51*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(productForm("description"))),format.raw/*15.58*/("""
        """),format.raw/*16.9*/("""</fieldset>
        <p><input type="submit" class="btn primary"
            value='"""),_display_(/*18.21*/Messages("products.new.submit")),format.raw/*18.52*/("""'></p>
    """)))}),format.raw/*19.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],messages:play.api.i18n.Messages,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(productForm)(messages,flash)

  def f:((Form[models.Product]) => (play.api.i18n.Messages,play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => (messages,flash) => apply(productForm)(messages,flash)

  def ref: this.type = this

}


}

/**/
object editProduct extends editProduct_Scope0.editProduct
              /*
                  -- GENERATED --
                  DATE: Fri Mar 07 12:53:32 BRT 2025
                  SOURCE: C:/Users/Sergio/Desktop/scala/products/app/views/products/editProduct.scala.html
                  HASH: 3d3cf765f658449a2ce2ab23848b1f0b775e5c8d
                  MATRIX: 604->1|820->106|850->128|878->131|917->162|955->163|987->169|1018->174|1063->199|1102->213|1116->219|1162->257|1200->258|1236->268|1314->319|1427->410|1469->424|1520->448|1535->454|1586->484|1628->499|1643->505|1695->536|1737->551|1752->557|1811->595|1848->605|1961->691|2013->722|2056->735
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|31->8|31->8|31->8|31->8|32->9|34->11|34->11|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|41->18|41->18|42->19
                  -- GENERATED --
              */
          