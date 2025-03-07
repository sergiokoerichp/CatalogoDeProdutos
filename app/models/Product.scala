package models

case class Product(ean: Long, name: String, description: String)

object Product {
  // Dados de teste (lista estática de produtos)
  private var products = Set(
    Product(5010255079763L, "Paperclips Large", "Large Plain Pack of 1000"),
    Product(5018206244666L, "Giant Paperclips", "Giant Plain 51mm 100 pack"),
    Product(5018306332812L, "Paperclip Giant Plain", "Giant Plain Pack of 1000"),
    Product(5018306312913L, "No Tear Paper Clip", "No Tear Extra Large Pack of 1000"),
    Product(5018206244611L, "Zebra Paperclips", "Zebra Lenght 28mm Assorted 150 Pack")
  )
  
  def findAll: List[Product] = products.toList.sortBy(_.ean)
  def findByEan(ean: Long): Option[Product] = products.find(_.ean == ean)

  def add(product: Product) {
    products = products + product
  }
}
