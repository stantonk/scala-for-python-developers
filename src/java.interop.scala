/*
This isn't for Python programmers, but it is pretty cool to see how seamlessly
Java code can be used in Scala. The entire world of existing Java libraries
can be leveraged.
*/

import java.io.{FileReader, BufferedReader, IOException}

if (args.length > 0) {

  try {
    val reader = new BufferedReader(new FileReader(args(0)))

    var done = false
    while (!done) {
      val line = reader.readLine
      if (line == null) done = true else println(line)
    }

  } catch {
    case ioe: IOException => println("ERROR: IOException")
  }

} else {
  println("ERROR: no file specified")
}


