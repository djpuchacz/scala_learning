package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
def factorial(n: Int): Int =
  if (n <= 1) 1
  else n * factorial(n-1)


@tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String = {
    if(n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)}

    println(concatenateTailrec("hello", 3, ""))
}
