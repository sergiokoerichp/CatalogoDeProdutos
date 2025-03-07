
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Sergio/Desktop/scala/products/conf/routes
// @DATE:Fri Mar 07 12:51:57 BRT 2025

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """controllers.Application.index"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""", """controllers.Products.list"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/new""", """controllers.Products.newProduct"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$ean<[^/]+>""", """controllers.Products.show(ean:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """barcode/$ean<[^/]+>""", """controllers.Barcodes.barcode(ean:Long)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""", """controllers.Products.save"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    controllers.Application.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Rota raiz: redireciona para o controlador Application""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Products_list1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_Products_list1_invoker = createInvoker(
    controllers.Products.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "list",
      Nil,
      "GET",
      """ Rota para a listagem de produtos""",
      this.prefix + """products"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Rota para arquivos estáticos (assets)""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Products_newProduct3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/new")))
  )
  private[this] lazy val controllers_Products_newProduct3_invoker = createInvoker(
    controllers.Products.newProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "newProduct",
      Nil,
      "GET",
      """""",
      this.prefix + """products/new"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Products_show4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Products_show4_invoker = createInvoker(
    controllers.Products.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """products/$ean<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Barcodes_barcode5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("barcode/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Barcodes_barcode5_invoker = createInvoker(
    controllers.Barcodes.barcode(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Barcodes",
      "barcode",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """barcode/$ean<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Products_save6_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_Products_save6_invoker = createInvoker(
    controllers.Products.save,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """products"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
      }
  
    // @LINE:7
    case controllers_Products_list1_route(params) =>
      call { 
        controllers_Products_list1_invoker.call(controllers.Products.list)
      }
  
    // @LINE:10
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(controllers.Assets.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_Products_newProduct3_route(params) =>
      call { 
        controllers_Products_newProduct3_invoker.call(controllers.Products.newProduct)
      }
  
    // @LINE:12
    case controllers_Products_show4_route(params) =>
      call(params.fromPath[Long]("ean", None)) { (ean) =>
        controllers_Products_show4_invoker.call(controllers.Products.show(ean))
      }
  
    // @LINE:14
    case controllers_Barcodes_barcode5_route(params) =>
      call(params.fromPath[Long]("ean", None)) { (ean) =>
        controllers_Barcodes_barcode5_invoker.call(controllers.Barcodes.barcode(ean))
      }
  
    // @LINE:16
    case controllers_Products_save6_route(params) =>
      call { 
        controllers_Products_save6_invoker.call(controllers.Products.save)
      }
  }
}