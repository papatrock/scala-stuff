/*
Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not, return the index
where it would be if it were inserted in order.
*/

object Solution {
    def searchInsert(nums: Array[Int], init: Int, end: Int, target: Int): Int = {
        if (init >= end) init
        else {
            val mid = (init + end) / 2
            if (target == nums(mid)) mid
            else if (target > nums(mid)) searchInsert(nums, mid + 1, end, target)
            else searchInsert(nums, init, mid, target)
        }
    }
}

object  Main extends App {
    val nums : Array[Int] = Array(1,3,5,6)

    val target: Int = 5

    val index : Int = Solution.searchInsert(nums,0,nums.length,target)

    printf("%d\n",index)
}