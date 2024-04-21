/**
 * Numbers:
 * to write , in between the number for large values we use _ to separate the numbers
 * ex : var i = 97798_44_4L
 *
 * a++ : postfix will be executed after the equation is evaluated.
 * var a = 5
 * val eq = 6 + a++ // the result will be 11 and then a will be = 6
 * valnewEq = 6+a // the result will be = 12
 */
fun main() {
    try {
        someFunction()
        println("Will not be printed")
        } catch (e: Throwable) {
        println("Caught $e") // Caught MyError: Some message
        }
    println("Code continues...")
}

// Exception
fun exception(){
    try{
        val num:Int = "ABC".toInt()
    }
    catch (t: Throwable){
     println("Caught ${t.message}")
    }
    println("Code continues...")
}

class MyError: Throwable("Some message")

 fun someFunction(){
    for(i in 1..1000000000){
        if(i>10) throw MyError(); // some condition to break the loop, it works as break
        print(i)
    }
    println("Will not be printed")
}

fun learString(){
//    string with multiple line: use """
    val multiLineString = """Hello This is a multi line text
   This just a demo text
        """
    print(multiLineString)
}

fun printScore(): Pair<Int,Int>{
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86

    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore /3

    return Pair(totalScore,averageScore)
    //output: Total Score: 257, Total Average: 85
}

fun factorial(number: Int): Int{
    if(number<=1) return 1
    return factorial(number-1) * number
}