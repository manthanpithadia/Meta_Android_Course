class LoopPractice {

    fun triangleShape1(){
        /*
                *
                ***
                *****
                ***
                *
        * */
// i = row, j = column
        val height = 5
        val width = 5
        for(numOfStars in 1 until width step 2){
            for(i in 1..numOfStars){
                print("*")
            }
            println()
        }

        for(numOfStars in width downTo 1 step 2){
            for(i in 1..numOfStars){
                print("*")
            }
            println()
        }
    }

    fun triangleShape2(){
        /*
                *****
                 ****
                  ***
                   **
                    *
        * */

        // code:
        for(i in 5 downTo 1){
            for(k in 0..(5-i)){
                print(" ")
            }
            for(j in 1..i){
                print("*")
            }
            println()
        }
    }

    fun triangleShape3() {
        /*
               *********
                *******
                 *****
                  ***
                   *
       * */

        //  Code:
        val width = 9

        for(i in width downTo 1 step 2){
            for(k in 0..(width-i) step 2){
                print(" ")
            }
            for(j in 1 until i+1){
                print("*")
            }
            println()
        }
    }

    fun triangleShape4() {
        /*
               *
              **
             ***
            ****
           *****
            ****
             ***
              **
               *
      * */

        //  Code:
        // for upper triangle
        for(i in 1..4){
            for(k in 4 downTo i){
                print(" ")
            }
            for(j in 1..i){
                print("*")
            }
            println()
        }

        // for lower triangle
        for(i in 5 downTo 1){
            for(k in 0..(5-i-1)){
                print(" ")
            }
            for(j in 1..i){
                print("*")
            }
            println()
        }
    }

}