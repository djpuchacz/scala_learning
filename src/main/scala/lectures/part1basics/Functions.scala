package lectures.part1basics

object Functions extends App {
  def aGreetingFunction(name: String, age: Int): String =
    "Hi, my name is "+ name +" and I am " + age + " years old"

  println(aGreetingFunction("Bruno", 7))

 def aFactorialFunction(n: Int): Int =
   if (n <= 0) 1
    else  n * aFactorialFunction(n-1)
 println(aFactorialFunction(5))

  def aFibonacci(n: Int): Int = {
    if (n <= 2) 1
    else aFibonacci(n-1) + aFibonacci(n-2)
  }

  println(aFibonacci(7))
// 1,1,2,3,5,8,13,21

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(2003))
}
