/*
=== Python ===

>>> basket1 = set(["apple", "pear"])
>>> basket1.add("strawberry")
>>> basket2 = set(["grape", "apple", "starfruit"])
>>> print "common to both: %s" % (basket1 & basket2)
common to both: set(['apple'])
>>> print "in either basket: %s" % (basket1 | basket2)
in either basket: set(['strawberry', 'grape', 'apple', 'pear', 'starfruit'])

*/

var basket1 = Set("apple", "pear")
// basket1: scala.collection.immutable.Set[String] = Set(apple, pear)
basket1 += "strawberry"
var basket2 = Set("grape", "apple", "starfruit")
// basket2: scala.collection.immutable.Set[String] = Set(grape, apple, starfruit)
println("common to both: " + (basket1 & basket2))
// common to both: Set(apple)
println("in either basket: " + (basket1 | basket2))
// in either basket: Set(grape, apple, pear, strawberry, starfruit)

// If you needed a mutable set:
import scala.collection.mutable
val mutableSet = mutable.Set("a", "b")
mutableSet += "c"

// or maybe an immutable HashSet?
import scala.collection.immutable.HashSet
var hashSet = HashSet(1, 2, 3)