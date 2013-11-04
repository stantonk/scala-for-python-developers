/*
=== Python ===

class Dog(object):
    def __init__(self, name):
        self.name = name

    def speak(self):
        print '%s: Bark!' % self.name

    def command(self, cmd):
        print '%s ::%s::' % (self.name, cmd)

dog = Dog('Rover')
dog.speak()
dog.command('sit')

*/

class Dog(name: String) {
  /*
  The body of the class can contain code for the primary constructor, instead
  of an explicitly defined constructor method like in Java or Python. Also,
  note that the parameters for the constructor are in the class definition
  portion at the top. Scala automatically places them in fields named after
  the parameter name. Less boilerplate!
   */
  println("This line runs upon instantiation")

  /*
  Notice how there is no equals sign on the speak method, that's because it
  doesn't return anything. Technically, it returns Unit, which is like Java's
  void and Python's None.
   */
  def speak() { println(this.name + ": Bark!") }

  def command(cmd: String) = {
    println(name + " ::" + cmd + "::")
  }
}

val dog = new Dog("Rover")
// This line runs upon instantiation of a Dog, it is the primary constructor
// dog: Dog = Dog@11727596

dog.speak()
// Rover: Bark!

dog.command("sit")
// Rover ::sit::