name := "scala-ipfs-api"

version := "1.0.0-SNAPSHOT"

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.2.2"

libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.2.2"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.6.4" % "test")