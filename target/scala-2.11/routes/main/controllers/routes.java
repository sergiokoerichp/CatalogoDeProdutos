
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Sergio/Desktop/scala/products/conf/routes
// @DATE:Fri Mar 07 12:51:57 BRT 2025

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBarcodes Barcodes = new controllers.ReverseBarcodes(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProducts Products = new controllers.ReverseProducts(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBarcodes Barcodes = new controllers.javascript.ReverseBarcodes(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProducts Products = new controllers.javascript.ReverseProducts(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
