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
        var uniqs: Array[java.lang.Integer] = new Array[java.lang.Integer](nums.length)
        var indice : Int = 0
        for (num <- nums){
            if(!uniqs.contains(num)){
                //printf("adicionando %d\n",num)
                uniqs(indice) = num
                nums(indice) = num
                indice += 1
            }
        }
        indice
    }
}


object  Main extends App {
    val nums : Array [Int] = Array(0,0,1,1,1,2,2,3,3,4)

    val k = Solution.removeDuplicates(nums)

    printf("Output: %d\n",k)
}