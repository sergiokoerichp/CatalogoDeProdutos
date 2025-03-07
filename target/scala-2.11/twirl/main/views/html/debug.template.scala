
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object debug_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class debug extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.api.i18n.Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit lang: play.api.i18n.Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.current

Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<footer>
    lang = """),_display_(/*5.13*/lang/*5.17*/.code),format.raw/*5.22*/(""",
    user = """),_display_(/*6.13*/current/*6.20*/.configuration.getString("environment.user").getOrElse("unknown")),format.raw/*6.85*/(""",
    date = """),_display_(/*7.13*/(new java.util.Date().toString)),format.raw/*7.44*/("""
"""),format.raw/*8.1*/("""</footer>
"""))
      }
    }
  }

  def render(lang:play.api.i18n.Lang): play.twirl.api.HtmlFormat.Appendable = apply()(lang)

  def f:(() => (play.api.i18n.Lang) => play.twirl.api.HtmlFormat.Appendable) = () => (lang) => apply()(lang)

  def ref: this.type = this

}


}

/**/
object debug extends debug_Scope0.debug
              /*
                  -- GENERATED --
                  DATE: Thu Mar 06 16:53:48 BRT 2025
                  SOURCE: C:/Users/Sergio/Desktop/scala/products/app/views/debug.scala.html
                  HASH: 7c1e6abf4663fc1381200437e2b8a4450caee43f
                  MATRIX: 539->1|699->38|727->71|755->73|803->95|815->99|840->104|881->119|896->126|981->191|1022->206|1073->237|1101->239
                  LINES: 20->1|25->1|26->3|27->4|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|31->8
                  -- GENERATED --
              */
          