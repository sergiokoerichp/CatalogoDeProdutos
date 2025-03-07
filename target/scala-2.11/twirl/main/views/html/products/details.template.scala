
package views.html.products

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object details_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class details extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Product,play.api.i18n.Messages,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Product)(implicit messages: play.api.i18n.Messages, flash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.90*/("""

"""),_display_(/*3.2*/main(Messages("products.details", product.name))/*3.50*/ {_display_(Seq[Any](format.raw/*3.52*/("""
    """),format.raw/*4.5*/("""<h2>
        """),_display_(/*5.10*/tags/*5.14*/.barcode(product.ean)),format.raw/*5.35*/("""
        """),_display_(/*6.10*/Messages("products.details", product.name)),format.raw/*6.52*/("""
    """),format.raw/*7.5*/("""</h2>

    <dl class="dl-horizontal">
        <dt>"""),_display_(/*10.14*/Messages("ean")),format.raw/*10.29*/(""":</dt>
        <dd>"""),_display_(/*11.14*/product/*11.21*/.ean),format.raw/*11.25*/("""</dd>

        <dt>"""),_display_(/*13.14*/Messages("name")),format.raw/*13.30*/(""":</dt>
        <dd>"""),_display_(/*14.14*/product/*14.21*/.name),format.raw/*14.26*/("""</dd>

        <dt>"""),_display_(/*16.14*/Messages("description")),format.raw/*16.37*/(""":</dt>
        <dd>"""),_display_(/*17.14*/product/*17.21*/.description),format.raw/*17.33*/("""</dd>
    </dl>
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(product:Product,messages:play.api.i18n.Messages,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(product)(messages,flash)

  def f:((Product) => (play.api.i18n.Messages,play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (product) => (messages,flash) => apply(product)(messages,flash)

  def ref: this.type = this

}


}

/**/
object details extends details_Scope0.details
              /*
                  -- GENERATED --
                  DATE: Fri Mar 07 12:53:32 BRT 2025
                  SOURCE: C:/Users/Sergio/Desktop/scala/products/app/views/products/details.scala.html
                  HASH: e3e471df39292f90108e2724a994ee18c3a26d7f
                  MATRIX: 583->1|766->89|796->94|852->142|891->144|923->150|964->165|976->169|1017->190|1054->201|1116->243|1148->249|1229->303|1265->318|1313->339|1329->346|1354->350|1403->372|1440->388|1488->409|1504->416|1530->421|1579->443|1623->466|1671->487|1687->494|1720->506|1769->525
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6|30->6|31->7|34->10|34->10|35->11|35->11|35->11|37->13|37->13|38->14|38->14|38->14|40->16|40->16|41->17|41->17|41->17|43->19
                  -- GENERATED --
              */
          