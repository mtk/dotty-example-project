/**
  * Created by mtk on 4/19/2017.
  */
object ScalaVersionExample extends App {
  import util.Properties

  println("versionString: " + Properties.versionString)
  println("ScalaCompilerVersion:" + Properties.ScalaCompilerVersion)
  println("developmentVersion: " + Properties.developmentVersion)
  println("releaseVersion: " + Properties.releaseVersion)
  println("java version: " + System.getProperty("java.version"))
  println("something: " + System.getProperties)
  }
      