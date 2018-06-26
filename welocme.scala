//package production.Option3.welcome
import java.math.BigInteger

import javafx.beans.binding.DoubleExpression

object welcome {
  def main(args: Array[String]) {
    var capital = Map("US"->"Washington","France"->"Paris");
    capital+=("Japan"->"Tokyo");
    println(capital("Japan"))
    var num=16.toHexString;
    /*println(num);
    println((1 to 10).contains(10))
    println((1 until 10).contains(10))
    println("foo".drop(1))
    println("bar".take(2))
    print(factorial(20))
*/    println(area(10))
      println(sumOfSquare(3,2+2))
      println("Area of the triangle")
      println(areaOftriangle(5,6))

    println("square root of x")
    println(sqrt(9))
     /* def loop: Int = loop
      val x=loop;
    println(x);*/
  }
  def areaOftriangle(base:Double, height:Double):Double = base * height / 2;
  def square(x: Double) = x * x;
  def sumOfSquare(x: Double,y:Double): Double = square(x) + square(y);
  def area(radius: Double):Double = 3.14159 * square(radius)
  def factorial(x:BigInt): BigInt = if(x==0 ) 1 else x * factorial(x-1)
  def abs(x:Double)=if(x>=0) x else -x
  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001
  def sqrt(x: Double) = sqrtIter(1.0, x)
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

}
