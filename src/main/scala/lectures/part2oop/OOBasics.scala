package lectures.part2oop

object OOBasics extends App { // 10 i 11
  val person = new Person("John", 26)
  println(person.age)
  person.greet("Bruno")


  val author = new Writer("Charles", "Dickens", 1842)
  val imposter = new Writer("Charles", "Dickens", 1842)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter

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


  class Writer(firstName: String, surname: String, val year: Int)
  {
    def fullName: String = firstName + " " + surname
  }

  class Novel(name: String, year: Int, author: Writer) {
    def authorAge = year - author.year

    def isWrittenBy(author: Writer) = author == this.author

    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }

  class Counter(val count: Int = 0) {
    def inc = {
      println("incrementing")
      new Counter(count + 1) //immutability
    }
    def dec = {
      println("decrementing")
      new Counter(count - 1)
    }
    def inc(n: Int): Counter = {
      if (n <= 0) this
      else inc.inc(n+1)
    }
    def dec(n: Int): Counter = {
      if (n <= 0) this
      else dec.dec(n-1)
    }
  }
}
