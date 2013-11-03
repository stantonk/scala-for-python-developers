/*
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
