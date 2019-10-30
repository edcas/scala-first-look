println("Welcome to Scala Worksheet")

((x: Int) => x + 1) (5)

val f = (x: Int) => x + 2
f(5)
f.apply(3)

val doubler = (i: Int) => i * 2
doubler(6)

def someOperation(f: (Int, Int) => Int): Unit = println(f(5, 5))
val add = (x: Int, y: Int) => x + y
someOperation(add)

def greeting(): String => String = (name: String) => "Hello " + name
val g = greeting()
g("Peggy")

var y = 5
val multiplier = (x: Int) => x * y
multiplier(4)
