error id: file://<WORKSPACE>/leetcode/removeElement.scala:scala/Int#
file://<WORKSPACE>/leetcode/removeElement.scala
empty definition using pc, found symbol in pc: scala/Int#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Int#
	 -scala/Predef.Int#
offset: 197
uri: file://<WORKSPACE>/leetcode/removeElement.scala
text:
```scala
object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
        
        nums.filter(_!=`val`)

        nums.length
    }
}

object  Main extends App{
    val nums : Array[In@@t] = Array(3,2,2,3)
    val `val` : Int = 3;

    val output : Int = Solution.removeElement(nums,`val`)

    printf("out %d\nnums:\n",output)
    nums.foreach(println)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Int#