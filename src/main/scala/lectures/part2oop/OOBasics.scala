package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John", 26)
  println(person.age)
  person.greet("Bruno")

  class Person(name: String, val age: Int) { //constructor
    // body
    val x = 2 // można używać tego pola jako pola klasy
    println(1+3) //expression

    //method
    def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

    //overloading
    def greet(): Unit = println(s"Hi, I'm $name")

    //multiple constructors
    def this(name: String) = this(name, 0) //lepiej dodać default value to głównego konstruktora(linijka 8), niż tutaj )do pomocniczego konstruktora)
  }

  //poprzez dodanie słowa kluczowego val do konstrultora klasy możemy go "drukować" tak jak w Javie

  //class parameters are NOT Fields
}
