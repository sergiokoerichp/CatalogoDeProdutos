
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Sergio/Desktop/scala/products/conf/routes
// @DATE:Fri Mar 07 12:51:57 BRT 2025

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:4
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseBarcodes(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def barcode: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Barcodes.barcode",
      """
        function(ean) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "barcode/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ean", ean)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseProducts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def newProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.newProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/new"})
        }
      """
    )
  
    // @LINE:16
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:7
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:12
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.show",
      """
        function(ean) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ean", ean)})
        }
      """
    )
  
  }

  // @LINE:4
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}