error id: file://<WORKSPACE>/leetcode/ValidSudoku.scala:scala/Boolean#
file://<WORKSPACE>/leetcode/ValidSudoku.scala
empty definition using pc, found symbol in pc: scala/Boolean#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Boolean#
	 -scala/Predef.Boolean#
offset: 1169
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
        var map : Array[Boolean] = Array(false, false, false, false, false, false, false, false, false)

    }

    def validateSquare(square: Array[Array[Char]], map : Array[Boolean]): Boolean = {
                                        // to com sono, vai ficar assim

    }

    def validateLine(line: Array[Char], map : Array[Boolea@@n]) : Boolean = {
        for(i <- 0 until line.length){
            if(line(i) != '.'){
                if(map(line(i).toInt - 48)){
                    false
                }
                map(line(i).toInt - 48) = true
            }
        }
        true
    }

    def validateCow(cow: Array[Char], map : Array[Boolean]) : Boolean = {

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

    for(i <- 0 until board(0).length){
        printf("\n");
        for(j <- 0 until board.length){
            printf("%c ",board(i)(j))
        }
    }

}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Boolean#