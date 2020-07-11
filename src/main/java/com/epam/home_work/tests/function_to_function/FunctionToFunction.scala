package com.epam.home_work.tests.function_to_function

object FunctionToFunction {
  def main(args: Array[String]): Unit = {
    val fun = (x:Int)=>x+1
    val fun2 =(x:Int)=> Test.plusOne(x)
    println(Test.testFun(x=>x+1, 10))
    println(Test.testFun(fun, 20))
    println(Test.testFun(fun2, 30))
    println(Test.testFun((x:Int)=>Test.plusOne(x), 40))
    println(Test.testFun(Test.plusOne, 50))
  }
}

object Test{
  def testFun(f:Int=>Int, x:Int):Int=f(x)
  def plusOne(x:Int):Int = x+1
}
