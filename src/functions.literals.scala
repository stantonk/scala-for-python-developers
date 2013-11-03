/*
=== Python ===

Python does not have a function literal syntax per se, but functions are first
class objects and you can treat them in similar ways in Scala.

greeting = lambda name: "Hello " + name
print greeting("world")

def greet(name): return "Hello " + name
greeting = greet
print greeting("world")

*/

var greeting = (name: String) => "Hello " + name
println(greeting("world"))

def greet(name: String) = "Hello " + name
greeting = greet
println(greeting("world"))