file://<WORKSPACE>/leetcode/removeDuplicates.scala
### java.lang.AssertionError: assertion failed: found: Array.apply[Int]: (implicit evidence$5: scala.reflect.ClassTag[Int]): Array[Int], expected: Any

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 399
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
        var uniqs =Array[Int].fil@@

        for (num <- nums){
            if(!uniqs.contains(num)){
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



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.typer.Implicits$ImplicitSearch.<init>(Implicits.scala:1206)
	dotty.tools.dotc.interactive.Completion$Completer.implicitConversionTargets(Completion.scala:630)
	dotty.tools.dotc.interactive.Completion$Completer.implicitConversionMemberCompletions(Completion.scala:514)
	dotty.tools.dotc.interactive.Completion$Completer.selectionCompletions(Completion.scala:445)
	dotty.tools.dotc.interactive.Completion$.computeCompletions(Completion.scala:218)
	dotty.tools.dotc.interactive.Completion$.rawCompletions(Completion.scala:78)
	dotty.tools.pc.completions.Completions.enrichedCompilerCompletions(Completions.scala:114)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:136)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: found: Array.apply[Int]: (implicit evidence$5: scala.reflect.ClassTag[Int]): Array[Int], expected: Any