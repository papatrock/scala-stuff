error id: file://<WORKSPACE>/leetcode/removeElement.scala:scala/Array#length().
file://<WORKSPACE>/leetcode/removeElement.scala
empty definition using pc, found symbol in pc: scala/Array#length().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -nums/length.
	 -nums/length#
	 -nums/length().
	 -scala/Predef.nums.length.
	 -scala/Predef.nums.length#
	 -scala/Predef.nums.length().
offset: 155
uri: file://<WORKSPACE>/leetcode/removeElement.scala
text:
```scala
object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {

        val numsFiltrados: Array[Int] = nums.filter(_!=`val`)
        nums.@@length
    }
}

object  Main extends App{
    val nums : Array[Int] = Array(3,2,2,3)
    val `val` : Int = 3;

    val output : Int = Solution.removeElement(nums,`val`)

    printf("out %d\nnums:\n",output)
    nums.foreach(println)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Array#length().