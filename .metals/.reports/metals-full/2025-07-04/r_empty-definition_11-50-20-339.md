error id: file://<WORKSPACE>/leetcode/ValidSudoku.scala:scala/Array#`<init>`().
file://<WORKSPACE>/leetcode/ValidSudoku.scala
empty definition using pc, found symbol in pc: scala/Array#`<init>`().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 2424
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
                                    // to com sono, vai ficar assim

        var isValid : Boolean = true
        //verifica linhas
        for(line <- 0 until board.length){
            var validLines: Boolean = validateLine(board(0))
        }
        //verifica colunas
        for(cow <- 0 until board(0).length){
            var cow = getCow(board,cow)
            var validCows: Boolean = validateLine(cow)
        }
        //verifica quadrados


    }

    def validateSquare(square: Array[Array[Char]]): Boolean = {
        var isValid = true
        var map : Array[Boolean] = Array(false, false, false, false, false, false, false, false, false, false)
        for(line <- 0 until square.length){

            for(cow <- until square(0).length){
                if(square(line)(cow) != '.'){
                    if(map(line(i).toInt - 48)){
                        isValid = false
                    }
                    map(line(i).toInt - 48) = true
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
        var cow : Array[Char] = n@@ew Array[Char](board.length)

        for(i <- 0 until board.length){
            cow(i)(cow) = board(i)(cow)
        }

        cow
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

empty definition using pc, found symbol in pc: scala/Array#`<init>`().