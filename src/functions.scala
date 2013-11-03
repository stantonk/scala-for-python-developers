/*
=== Python ===

def max(x, y):
  if x > y:
    return x
  else:
    return y
*/

def max(x: Int, y: Int): Int = {
  if (x > y) x
  else y
}

/*
Note that type information is present in the function definition. Scala is a
statically-typed language. But it's type system is advanced, and usually it can
infer the type. So you can leave some type information off for improved
readability.
 */

def max(x: Int, y: Int) = {
  if (x > y) x
  else y
}

/*
Seen in the second form, Scala can usually infer the return type. So you can
leave it off. In some cases it can't infer the return type, i.e. recursion.

Also, note how there is no explicit return statement in the functions. In Scala,
the last statement executed in the body of a function becomes the return value.
 */

def max(x: Int, y: Int): Int = {
  if (x > y) return x
  else return y
}
/*
You can use return statements, but if you do, Scala's compiler cannot infer
the return type so you must specify it.

http://stackoverflow.com/questions/2209179/type-inference-on-method-return-type
*/
