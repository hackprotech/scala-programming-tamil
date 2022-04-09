package basics

object VarAndVal {

  def main(arr: Array[String]): Unit = {


    // var
    var sum: Int = 1000
    println(sum)

    // val
    val message: String = "Hello, HackPro Tech Community!"
    println(message)


    //     Modified
    sum = 999
    println(sum)

    //    message = "test"   => reassign is not possible


    // Interview Question

    val arr1 = Array[Int](1, 2, 3)
    arr1.foreach(println)

    arr1(1) = 555

    arr1.foreach(println)

    //    arr1 = Array[Int](1,100)


  }

}
