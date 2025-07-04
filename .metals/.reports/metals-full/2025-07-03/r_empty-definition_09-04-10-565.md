error id: file://<WORKSPACE>/leetcode/removeDuplicates.scala:`<none>`.
file://<WORKSPACE>/leetcode/removeDuplicates.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 449
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
        var uniqs : Array [Int]

        for (num <- nums){

        }

    }

    @@def notIn(num: Int, uniqs: Array[Int]): Boolean = {

        for (x <- uniqs){
            if (x == num)
                return false
        }

        true
    }

}


object  Main extends App {
    val nums : Array [Int] = Array(1,1,2)

    val k = Solution.removeDuplicates(num)

    printf("Output: %d\n",k)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.