/*
Given two strings needle and haystack, return the index of the first occurrence
of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.

*/

object Solution {
    def strStr(haystack: String, needle: String): Int = {
        haystack.indexOf(needle)
    }
}

object  Main extends App{

    val haystack : String = String("sadbutsad")
    val needle : String = String("sad")
    val index : Int = Solution.strStr(haystack, needle)

    printf("Output %d\n",index)

}