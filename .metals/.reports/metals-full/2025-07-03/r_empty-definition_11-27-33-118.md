error id: file://<WORKSPACE>/leetcode/indexOfFirstOcurrence.scala:
file://<WORKSPACE>/leetcode/indexOfFirstOcurrence.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 277
uri: file://<WORKSPACE>/leetcode/indexOfFirstOcurrence.scala
text:
```scala
/*
Given two strings needle and haystack, return the index of the first occurrence
of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    Th@@e first occurrence is at index 0, so we return 0.

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
```


#### Short summary: 

empty definition using pc, found symbol in pc: 