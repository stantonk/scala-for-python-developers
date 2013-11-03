/*
>>> x = {"dog": "Woof", "cat": "Meow"}
>>> for k, v in x.items():
...   print "%s=%s" % (k, v)
...
dog=Woof
cat=Meow

>>> print "the dog says " + x["dog"] + " and the cat says " + x["cat"]
the dog says Woof and the cat says Meow

>>> print x.get("duck", "quack")
quack

>>> x['fox'] = '??????'
>>> print "what does the fox say: " + x['fox']
what does the fox say: ??????
*/

var x = Map("dog" -> "Woof", "cat" -> "Meow")
println("the dog says " + x("dog") + " and the cat says " + x("cat")) // like lists, note parens..not brackets
// the dog says Woof and the cat says Meow

for ((k, v) <- x)
  printf("%s=%s\n", k, v)
// dog=Woof
// cat=Meow

println(x.getOrElse("duck", "quack"))
// quack

x += ("fox" -> "??????")

println("what does the fox say: " + x("fox"))
// what does the fox say: ??????