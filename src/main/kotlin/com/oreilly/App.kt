package com.oreilly
import spark.kotlin.*

class App {
  companion object {
    @JvmStatic public fun main(args: Array<String>) {
      val http: Http = ignite()
      http.get("/hello") {
        "Hello Spark Kotlin"
      }
    }
  }
}