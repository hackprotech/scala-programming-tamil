package basics

object TypeInference {

  def main(arr: Array[String]): Unit = {

    //   1) Basics
    val intValue1 = 10
    println(intValue1)
    println(intValue1.isInstanceOf[Int])

    //   2) Need to be careful while using value types
    val floatValue = 1.9f
    println(f"Float value => ${floatValue} - ${floatValue.isInstanceOf[Float]}")

    val doubleValue = 3.768
    println(f"Double value => ${doubleValue} - ${doubleValue.isInstanceOf[Double]}")

    val intValue = 100043534
    println(f"Int value => ${intValue} - ${intValue.isInstanceOf[Int]}")

    val longValue = 12345678900L
    println(f"Long value => ${longValue} - ${longValue.isInstanceOf[Long]}")

    val boolValue = false
    println(f"Boolean value => ${boolValue} - ${boolValue.isInstanceOf[Boolean]}")


    //   3) Higher level Datatype

    val integerValue: Any = 100
    println(integerValue)

    val numericList = List(1, 2, 3)
    println(">>>>>> List[Int] Types")
    numericList.foreach(println)
    println(f"List[Int] value => ${numericList.isInstanceOf[List[Int]]}")

    val anyValList = List(1, 2, 3, 1.0, true)
    println(">>>>>> List[AnyVal] Types")
    anyValList.foreach(println)
    println(f"List[AnyVal] value => ${anyValList.isInstanceOf[List[AnyVal]]}")

    val anyRefList = List("Sample", List(1, 2, 3))
    println(">>>>>> List[AnyRef] Types")
    anyRefList.foreach(println)
    println(f"List[AnyRef] value => ${anyRefList.isInstanceOf[List[AnyRef]]}")

    val higherLevelTypes = List("Hello World!!!", 1.6, true, List(1, 2, 3), 100)
    println(">>>>>> List[Any] Types")
    higherLevelTypes.foreach(println)
    println(f"List[Any] value => ${higherLevelTypes.isInstanceOf[List[Any]]}")

  }

}
