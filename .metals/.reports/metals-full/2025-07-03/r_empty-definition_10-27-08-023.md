error id: file://<WORKSPACE>/leetcode/removeElement.scala:`<none>`.
file://<WORKSPACE>/leetcode/removeElement.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -println.
	 -println#
	 -println().
	 -scala/Predef.println.
	 -scala/Predef.println#
	 -scala/Predef.println().
offset: 329
uri: file://<WORKSPACE>/leetcode/removeElement.scala
text:
```scala
object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {

        nums.filter(_==`val`)

        nums.length
    }
}

object  Main {
    val nums : Array[Integer] = Array(3,2,2,3)
    val `val` : Int = 3;

    val output = removeElement(nums,`val`)

    printf("out %d\nnums:",output)
    nums.foreach(print@@ln)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.