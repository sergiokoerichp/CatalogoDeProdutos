name := "products"

version := "1.0"

scalaVersion := "2.11.8"

enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "net.sf.barcode4j" % "barcode4j" % "2.0"
)
