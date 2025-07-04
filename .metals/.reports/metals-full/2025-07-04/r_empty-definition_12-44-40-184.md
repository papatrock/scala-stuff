error id: file://<WORKSPACE>/leetcode/ValidSudoku.scala:scala/Array#length().
file://<WORKSPACE>/leetcode/ValidSudoku.scala
empty definition using pc, found symbol in pc: scala/Array#length().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -line/length.
	 -line/length#
	 -line/length().
	 -scala/Predef.line.length.
	 -scala/Predef.line.length#
	 -scala/Predef.line.length().
offset: 2511
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
        isValid
    }

    def validateSquare(square: Array[Array[Char]]): Boolean = {
        var isValid = true
        var map : Array[Boolean] = Array(false, false, false, false, false, false, false, false, false, false)
        for(line <- 0 until square.length){
            for(cow <- 0 until square(0).length){
                if(square(line)(cow) != '.' && square(line)(cow) >= '1' && square(line)(cow) <= '9'){
                    val num : Int = square(line)(cow).toInt - '0'.toInt
                    if(map((num))){
                        isValid = false
                    }
                    map((num)) = true
                }
            }
        }
        isValid
    }

    def validateLine(line: Array[Char]) : Boolean = {
        var isValid = true
        var map : Array[Boolean] = Array(false, false, false, false, false, false, false, false, false, false)
        for(i <- 0 until line.len@@gth){
            if(line(i) != '.' && line(i) >= '1' && line(i) <= '9'){
                val num : Int = line(i).toInt - '0'.toInt
                if(map(num)){
                    isValid =  false
                }
                map(num) = true
            }
        }
        isValid
    }

    def getCow(board: Array[Array[Char]], cow : Int) : Array[Char] = {
        var cowArray : Array[Char] = new Array[Char](board.length)

        for(i <- 0 until board.length){
            cowArray(i) = board(i)(cow)
        }

        cowArray
    }

    def getSubMatrix(board: Array[Array[Char]], line: Int, cow: Int, size: Int): Array[Array[Char]] = {

        var subMatrix : Array[Array[Char]] = Array.ofDim[Char](size, size)

        for(i <- 0 until size){
            for( j <- 0 until size){
                subMatrix(i)(j) = board(line + i)(cow + j)
            }
        }
        subMatrix
    }
}

object Main extends App {

    val board2 : Array[Array[Char]] = Array(
        Array('7','.','.','.','4','.','.','.','.'),
        Array('.','.','.','8','6','5','.','.','.'),
        Array('.','1','.','2','.','.','.','.','.'),
        Array('.','.','.','.','.','9','.','.','.'),
        Array('.','.','.','.','5','.','5','.','.'),
        Array('.','.','.','.','.','.','.','.','.'),
        Array('.','.','.','.','.','.','2','.','.'),
        Array('.','.','.','.','.','.','.','.','.'),
        Array('.','.','.','.','.','.','.','.','.'),
    )

    val Output : Boolean = Solution.isValidSudoku(board)

    println(Output)
}

/*
['7','.','.','.','4','.','.','.','.'],
['.','.','.','8','6','5','.','.','.'],
['.','1','.','2','.','.','.','.','.'],

['.','.','.','.','.','9','.','.','.'],
['.','.','.','.','5','.','5','.','.'],
['.','.','.','.','.','.','.','.','.'],

['.','.','.','.','.','.','2','.','.'],
['.','.','.','.','.','.','.','.','.'],
['.','.','.','.','.','.','.','.','.']]

*/
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Array#length().