package basics

/*
@author Vengat (HackPro-Tech)

DataTypes in Scala
*/
object DataTypes {

  def main(args: Array[String]): Unit = {

    //  Value Types => Int, Float, Double, Long, Short, Byte, Char and Boolean =>  extends AnyVal
    val intValue: Int = 10
    val floatValue: Float = 100.15
    val doubleValue: Double = 90.45
    val longValue: Long = 100000000000000
    val shortValue: Short = 32767
    val boolValue: Boolean = true

    println("Integer Value - " + intValue)
    println("Float Value - " + floatValue)
    println("Double Value - " + doubleValue)
    println("Long Value - " + longValue)
    println("Short Value - " + shortValue)
    println("Bool Value - " + boolValue)

    //  Reference Type => String, List, Map., etc and Custom Classes  => extends AnyRef

    val strRef: String = "Hello HackPro tech Community!!!"
    val listRef: List[Int] = List(1, 2, 3, 4, 5)

    class Employee

    val emp: Employee = new Employee()

    println(strRef)
    println(listRef)
    println(emp)

    //  Unit  => void
    def display(): Unit = {
      println("Hello Hackpro")
    }

    display()
//    println(display())

    //  Null
    //  Nothing
    // Nil
    // None
    // null

  }
}
