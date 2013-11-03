/*
=== Python ===

>>> pair = (1, "foo")
>>> print pair[0]
1
>>> print pair[1]
foo

*/

val pair = (1, "foo")
// pair: (Int, String) = (1,foo)
println(pair._1)
// 1
println(pair._2)
// foo

/*
Scala has tuples too (yay, no JavaBean silliness for returning multiple
values of varied types!)

Both Scala and Python tuples are immutable, but Scala's are type safe,
hence the strange accessing mechanism (pair._1 vs. pair[0]).

Scala actually defines multiple tuple types, up to Tuple22, to achieve this.
*/

