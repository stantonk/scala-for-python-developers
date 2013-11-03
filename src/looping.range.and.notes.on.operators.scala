/*
=== Python ===

Loop over range of numbers:

for i in range(0, 5):
    print i

Note, last number printed is 4.
*/

// Scala is inclusive over the range, last number printed is 5
for (i <- 0 to 5)
  println(i)

// interesting to note, this code is equivalent:
for (i <- 0.to(5))
  println(i)
// because "to" is actually not an operator, but a method on Int, see:
0.to(5)
// res16: scala.collection.immutable.Range.Inclusive = Range(0, 1, 2, 3, 4, 5)

0 to 5
// res17: scala.collection.immutable.Range.Inclusive = Range(0, 1, 2, 3, 4, 5)


/*
This may seem somewhat odd, but it actually is similar (at least to my
non-expert eye) to how operators are implemented in languages like Python
and PHP, e.g.

>>> x = 5
>>> x.__add__
<method-wrapper '__add__' of int object at 0x7fc339c10788>
  >>> x.__add__(2)
7
>>> x + 2
7
*/

// scala
val x = 5
// x: Int = 5

x.+(2)
// res20: Int = 7

x + 2
// res21: Int = 7