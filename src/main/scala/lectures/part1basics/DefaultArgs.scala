package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1) : Int = //wartość startowa, jeżeli wywołuje funkcję x krotnie to nie muszę za każdym razem podawać tego samego argumentu
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  val fact10 = trFact(10) //zamiast val fact10 = trFact(10, 1)
  val fact5 = trFact(5, 3) // można przeciążać
  println(fact10)
  println(fact5)

  def savePicture(width: Int, height: Int, format: String = "jpg"): Unit = println("saving picture")
  //def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")

  savePicture(800, 600)

  def greet(name: String = "Superman", age: Int = 10): String = s"Hi, I'm $name and I'm $age years old."

  println(greet(age = 5))
  println(greet())

}
