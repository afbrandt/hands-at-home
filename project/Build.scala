import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "hands-at-home"
  val appVersion      = "1.0-SNAPSHOT"
  val postgreSQL 	  = "postgresql" % "postgresql" % "8.4-702.jdbc4"

  val appDependencies = Seq(
    // Add your project dependencies here,
    postgreSQL,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
