/*
=== Python ===

def max2(x, y): return x if x > y else y

>>> max2(17, 19)
19
>>> max2(19, 17)
19
*/

// scala, function definition (brief)
def max2(x: Int, y: Int) = if (x > y) x else y

max2(17, 19)
// res2: Int = 19
max2(19, 17)
// res3: Int = 19