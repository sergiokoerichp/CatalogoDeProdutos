error id: file:///C:/Users/Sergio/Desktop/scala/products/app/controllers/Products.scala:[1344..1345) in Input.VirtualFile("file:///C:/Users/Sergio/Desktop/scala/products/app/controllers/Products.scala", "package controllers

import play.api.mvc._
import models.Product
import play.api.Play.current
import play.api.i18n.Messages.Implicits._
import play.api.data.Form
import play.api.data.Forms.{mapping, longNumber, nonEmptyText}
import play.api.i18n.Messages
import play.api.mvc.Flash

object Products extends Controller {

    def list = Action { implicit request =>
        val products = Product.findAll
        Ok(views.html.products.list(products))
    }
    
    def show(ean: Long) = Action { implicit request =>
        Product.findByEan(ean).map { product =>
        Ok(views.html.products.details(product))
        }.getOrElse(NotFound)
    }

    def save = Action { implict request =>
        val newProductFornm = productForm.bindFromRequest()

        newProductForm.fold(

            hasErrors = { form =>
                Redirect(routes.Products.newProduct()).
                flashing(Flash(form.data) + 
                ("error" -> Messages("validation.errors")))
            },
            sucess = { newProduct =>
                Product.add(newProduct)
                val message = Message("products.new.sucess", newProduct.name)
                Redirect(routes.Products.show(newProduct.ean)).
                flashing("success" -> message)
            }
        )
    }

    def 
}

private val productForm: Form[Product] = Form (
    mapping(
        "ean" -> longNumber.verifying(
            "validation.ean.duplicate", Product.findByEan(_).isEmpty),
        "name" -> nonEmptyText
    ) (Product.apply) (Product.unapply)
)")
file:///C:/Users/Sergio/Desktop/scala/products/app/controllers/Products.scala:45: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace