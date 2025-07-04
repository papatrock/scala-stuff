error id: file://<WORKSPACE>/leetcode/removeDuplicates.scala:contains.
file://<WORKSPACE>/leetcode/removeDuplicates.scala
empty definition using pc, found symbol in pc: contains.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -uniqs/contains.
	 -uniqs/contains#
	 -uniqs/contains().
	 -scala/Predef.uniqs.contains.
	 -scala/Predef.uniqs.contains#
	 -scala/Predef.uniqs.contains().
offset: 470
uri: file://<WORKSPACE>/leetcode/removeDuplicates.scala
text:
```scala
/*
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once
Example:
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]

    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
*/

object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        var uniqs =Array.fill(nums.length)(null)

        for (num <- nums){
            if(!uniqs.conta@@ins(num)){
                printf("adicionando %d\n",num)
                uniqs :+ num
                //uniqs.appended(num)
                for n <- uniqs do println
                //println("Array: " + uniqs)
            }
        }
        uniqs.length
    }
}


object  Main extends App {
    val nums : Array [Int] = Array(1,1,2)

    val k = Solution.removeDuplicates(nums)

    printf("Output: %ad\n",k)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: contains.