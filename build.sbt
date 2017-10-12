lazy val root = (project in file("."))
    .settings(
        name := "numla",
        version := "0.1.0",
        scalaVersion := "2.11.11",

        libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.2.0" % "provided",
        libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.0" % "provided",
        libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "2.2.0" % "provided"
    )