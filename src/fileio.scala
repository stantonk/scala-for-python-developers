/*
=== Python ===

import sys

if len(sys.argv) > 0:
    for line in open(sys.argv[1]):
        print line.rstrip('\r\n') # scala.io.Source removes line terminators
else:
    sys.stderr.write('Please enter filename')

*/

import scala.io.Source

if (args.length > 0) {
  for (line <- Source.fromFile(args(0)).getLines)
    println(line)
} else {
  Console.err.println("Please enter filename")
}