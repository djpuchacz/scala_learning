package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I'm learning Scala"
  println(str.charAt(2)) //zwraca litere na podanym indeksie
  println(str.substring(7, 11)) //zwraca fragment między podanymi indeksami
  println(str.split(" ").toList) // zwraca listę podzielonych spacją stringów; tnie Stringa na mniejsze
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println(aNumber)
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //Scala-specific: String interpolators

  // S-interpolators
  val name = "Lucas"
  val age = 12
  val greeting = s"Hello. My name is $name and I am $age years old"
  val anotherGreeting = s"Hello. My name is $name and I am ${age + 1} years old"
  println(greeting)
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.5f burgers per minute"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")

}
