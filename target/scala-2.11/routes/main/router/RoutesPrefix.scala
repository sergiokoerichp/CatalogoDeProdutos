
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Sergio/Desktop/scala/products/conf/routes
// @DATE:Fri Mar 07 12:51:57 BRT 2025


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
