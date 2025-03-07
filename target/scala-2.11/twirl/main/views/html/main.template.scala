
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Html,play.api.i18n.Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(implicit messages: play.api.i18n.Messages, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.89*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*7.106*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""'>
    </head>
    <body>
        <div class="screenshot">
            <div class="navbar navbar-fixed-top">
                <div class="navbar-inner">
                    <div class="container">
                        <a class="brand" href=""""),_display_(/*15.49*/routes/*15.55*/.Application.index()),format.raw/*15.75*/("""">
                            """),_display_(/*16.30*/Messages("application.name")),format.raw/*16.58*/("""
                        """),format.raw/*17.25*/("""</a>

                        <ul class="nav">
                            <li class="divider-vertical"></li>
                            <li class="active">
                                <a href=""""),_display_(/*22.43*/routes/*22.49*/.Products.list()),format.raw/*22.65*/("""">
                                    """),_display_(/*23.38*/Messages("products.list.navigation")),format.raw/*23.74*/("""
                                """),format.raw/*24.33*/("""</a>
                            </li>
                            <li class="active">
                                <a href=""""),_display_(/*27.43*/routes/*27.49*/.Products.newProduct()),format.raw/*27.71*/("""">
                                    <i class="icon-plus icon-white"></i>
                                    """),_display_(/*29.38*/Messages("products.new.command")),format.raw/*29.70*/("""
                                """),format.raw/*30.33*/("""</a>
                            </li>
                            <li class="divider-vertical"></li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="container">
                """),_display_(/*39.18*/if(flash.get("sucess").isDefined)/*39.51*/{_display_(Seq[Any](format.raw/*39.52*/("""
                    """),format.raw/*40.21*/("""<div class="alert alert-sucess">
                        """),_display_(/*41.26*/flash/*41.31*/.get("sucess")),format.raw/*41.45*/("""
                    """),format.raw/*42.21*/("""</div>
                """)))}),format.raw/*43.18*/("""
                """),_display_(/*44.18*/if(flash.get("error").isDefined)/*44.50*/{_display_(Seq[Any](format.raw/*44.51*/("""
                    """),format.raw/*45.21*/("""<div class="alert alert-error">
                        """),_display_(/*46.26*/flash/*46.31*/.get("error")),format.raw/*46.44*/("""
                    """),format.raw/*47.21*/("""</div>
                """)))}),format.raw/*48.18*/("""

                """),_display_(/*50.18*/content),format.raw/*50.25*/("""
                """),_display_(/*51.18*/debug()),format.raw/*51.25*/("""
            """),format.raw/*52.13*/("""</div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,messages:play.api.i18n.Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(messages,flash)

  def f:((String) => (Html) => (play.api.i18n.Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (messages,flash) => apply(title)(content)(messages,flash)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Mar 07 12:53:32 BRT 2025
                  SOURCE: C:/Users/Sergio/Desktop/scala/products/app/views/main.scala.html
                  HASH: bd1115e9272e41818022c7196928c22d90e661fd
                  MATRIX: 559->1|741->88|771->92|850->145|875->150|964->213|978->219|1045->265|1128->322|1142->328|1204->369|1482->620|1497->626|1538->646|1598->679|1647->707|1701->733|1933->938|1948->944|1985->960|2053->1001|2110->1037|2172->1071|2331->1203|2346->1209|2389->1231|2531->1346|2584->1378|2646->1412|2937->1676|2979->1709|3018->1710|3068->1732|3154->1791|3168->1796|3203->1810|3253->1832|3309->1857|3355->1876|3396->1908|3435->1909|3485->1931|3570->1989|3584->1994|3618->2007|3668->2029|3724->2054|3772->2075|3800->2082|3846->2101|3874->2108|3916->2122
                  LINES: 20->1|25->1|27->3|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|39->15|39->15|39->15|40->16|40->16|41->17|46->22|46->22|46->22|47->23|47->23|48->24|51->27|51->27|51->27|53->29|53->29|54->30|63->39|63->39|63->39|64->40|65->41|65->41|65->41|66->42|67->43|68->44|68->44|68->44|69->45|70->46|70->46|70->46|71->47|72->48|74->50|74->50|75->51|75->51|76->52
                  -- GENERATED --
              */
          