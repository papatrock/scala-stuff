error id: file://<WORKSPACE>/leetcode/ValidSudoku.scala:scala/Array#
file://<WORKSPACE>/leetcode/ValidSudoku.scala
empty definition using pc, found symbol in pc: scala/Array#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Array#
	 -scala/Predef.Array#
offset: 2738
uri: file://<WORKSPACE>/leetcode/ValidSudoku.scala
text:
```scala
/*
    Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be
    validated according to the following rules:

    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the nine 3 x 3 sub-boxes of the grid must contain the digits
        1-9 without repetition.

    Input: board =
[['5','3','.','.','7','.','.','.','.']
,['6','.','.','1','9','5','.','.','.']
,['.','9','8','.','.','.','.','6','.']
,['8','.','.','.','6','.','.','.','3']
,['4','.','.','8','.','3','.','.','1']
,['7','.','.','.','2','.','.','.','6']
,['.','6','.','.','.','.','2','8','.']
,['.','.','.','4','1','9','.','.','5']
,['.','.','.','.','8','.','.','7','9']]
Output: true

*/

object Solution {
    def isValidSudoku(board: Array[Array[Char]]): Boolean = {

        var isValid : Boolean = true
        //verifica linhas
        for(line <- 0 until board.length){
            if(!validateLine(board(0)))
                isValid = false

        }
        //verifica colunas
        for(cow <- 0 until board(0).length){
            var cowArray : Array[Char] = getCow(board,cow)
            if(!validateLine(cowArray))
                isValid = false
        }
        //verifica quadrados
        val size : Int = 3

        for(line <- 0 until board(0).length by 3){

            for(cow <- 0 until board.length by 3){
                var subMatrix: Array[Array[Char]] = getSubMatrix(board, line, cow, size)
                if(!validateSquare(subMatrix))
                    isValid = false
            }
        }


    }

    def validateSquare(square: Array[Array[Char]]): Boolean = {
        var isValid = true
        var map : Array[Boolean] = Array(false, false, false, false, false, false, false, false, false, false)
        for(line <- 0 until square.length){

            for(cow <- 0 until square(0).length){
                if(square(line)(cow) != '.'){
                    if(map((line).toInt - 48)){
                        isValid = false
                    }
                    map((line).toInt - 48) = true
                }
            }
        }
        isValid
    }

    def validateLine(line: Array[Char]) : Boolean = {
        var isValid = true
        var map : Array[Boolean] = Array(false, false, false, false, false, false, false, false, false, false)
        for(i <- 0 until line.length){
            if(line(i) != '.'){
                if(map(line(i).toInt - 48)){
                    isValid =  false
                }
                map(line(i).toInt - 48) = true
            }
        }
        isValid
    }

    def getCow(board: Array[Array[Char]], cow : Int) : Array[Char] = {
        var cowArray : Array[Char] = new @@Array[Char](board.length)

        for(i <- 0 until board.length){
            cowArray(i) = board(i)(cow)
        }

        cowArray
    }

    def getSubMatrix(board: Array[Array[Char]], line: Int, cow: Int, size: Int): Array[Array[Char]] = {

        var subMatrix : Array[Array[Char]] = Array.ofDim[Char](size, size)

        for(i <- line until line + size){
            for( j <- cow until cow + size){
                subMatrix(i)(j) = board(i)(j)
            }
        }
        subMatrix
    }
}

object Main extends App {

    val board : Array[Array[Char]] = Array(
        Array('5','3','.','.','7','.','.','.','.'),
        Array('6','.','.','1','9','5','.','.','.'),
        Array('.','9','8','.','.','.','.','6','.'),
        Array('8','.','.','.','6','.','.','.','3'),
        Array('4','.','.','8','.','3','.','.','1'),
        Array('7','.','.','.','2','.','.','.','6'),
        Array('.','6','.','.','.','.','2','8','.'),
        Array('.','.','.','4','1','9','.','.','5'),
        Array('.','.','.','.','8','.','.','7','9'),
    )

    val Output : Boolean = Solution.isValidSudoku(board)

    println(Output)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Array#