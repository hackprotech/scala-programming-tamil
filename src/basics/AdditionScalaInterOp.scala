package basics

import javautils.AdditionUtil

object AdditionScalaInterOp {

  def main(arr: Array[String]): Unit = {

    val addUtil: AdditionUtil = new AdditionUtil()
    addUtil.addition(50, 20) // 70

  }

}
