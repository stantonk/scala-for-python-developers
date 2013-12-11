/*
Python

l = [1, 2, 3, 4, 5, 6]
evens = [n for n in l if n % 2 == 0]
*/

// Scala
val l = List(1, 2, 3, 4, 5, 6)
val evens = for (n <- l if n % 2 == 0) yield n
