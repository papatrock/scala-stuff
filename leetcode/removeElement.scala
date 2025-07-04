object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {

        val numsFiltrados: Array[Int] = nums.filter(_!=`val`)
        numsFiltrados.foreach(println)
        for(i <-0 until numsFiltrados.length) do nums(i) = numsFiltrados(i)

        numsFiltrados.length
    }
}

object  Main extends App{
    val nums : Array[Int] = Array(3,2,2,3)
    val `val` : Int = 3;

    val output : Int = Solution.removeElement(nums,`val`)

    printf("out %d\n",output)
}