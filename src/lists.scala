/*
=== Python ===

l = ["one", "two", "three"]
print l[0]
for a in l:
  print a
*/

val l = List("one", "two", "three")
println(l(0))
for (a <- l)
  println(a)

/*
Note how the list is indexed with parens, not square brackets. This is because
you're actually making a method call.

println(l(0)) <-- outputs "one"
println(l.apply(0)) <-- outputs "one"
 */

/*
=== Python ===

Concatenating lists:

list1 = [1, 2]
list2 = [3, 4]
biglist = list1 + list2

*/

// scala concatenating lists
val list1 = List(1, 2)
val list2 = List(3, 4)
val biglist = list1 ::: list2

/*
Note: In Scala, Lists are immutable. Python's lists, however, are mutable.
Arrays, on the other hand, are mutable.
*/

// scala, prepend an element (using the "cons" operator, ::) to an existing
// list will generate a new list:
val list3 = List(2, 3)
val newlist = 1 :: list3

/*
=== Python ===

In python, you would do this using concatenation and a temporary list of length
1:

list1 = [2, 3]
newlist = [1] + list1

Or you could prepend the 1 to the existing list at the front, but this would be
inefficient:

list1.insert(0, 1)
*/
