
package views.html.products

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],play.api.i18n.Messages,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product])(implicit messages: play.api.i18n.Messages, flash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.104*/("""

"""),_display_(/*3.2*/main(Messages("application.name"))/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""

    """),format.raw/*5.5*/("""<dl class="products">
        """),_display_(/*6.10*/for(product <- products) yield /*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
            """),format.raw/*7.13*/("""<dt>
                <a href=""""),_display_(/*8.27*/controllers/*8.38*/.routes.Products.show(product.ean)),format.raw/*8.72*/("""">
                    """),_display_(/*9.22*/product/*9.29*/.name),format.raw/*9.34*/("""
                """),format.raw/*10.17*/("""</a>
            </dt>
            <dd>"""),_display_(/*12.18*/product/*12.25*/.description),format.raw/*12.37*/("""</dd>
        """)))}),format.raw/*13.10*/("""
    """),format.raw/*14.5*/("""</dl>
    <p>
        <a href=""""),_display_(/*16.19*/controllers/*16.30*/.routes.Products.newProduct()),format.raw/*16.59*/(""""
        class="btn">
        <i class="icon-plus"></i> """),_display_(/*18.36*/Messages("products.new.command")),format.raw/*18.68*/("""</a>
    </p>
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],messages:play.api.i18n.Messages,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(products)(messages,flash)

  def f:((List[models.Product]) => (play.api.i18n.Messages,play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (products) => (messages,flash) => apply(products)(messages,flash)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Fri Mar 07 12:13:15 BRT 2025
                  SOURCE: C:/Users/Sergio/Desktop/scala/products/app/views/products/list.scala.html
                  HASH: 673998cfbbd07fdcb11738c4e2a10dec155363fb
                  MATRIX: 590->1|788->103|818->108|860->142|899->144|933->152|991->184|1030->208|1069->210|1110->224|1168->256|1187->267|1241->301|1292->326|1307->333|1332->338|1378->356|1447->398|1463->405|1496->417|1543->433|1576->439|1637->473|1657->484|1707->513|1794->573|1847->605|1894->622
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|30->6|30->6|30->6|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|36->12|36->12|36->12|37->13|38->14|40->16|40->16|40->16|42->18|42->18|44->20
                  -- GENERATED --
              */
          