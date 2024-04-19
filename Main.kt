
fun main() {
    println("Total Score: ${printScore().first}, Total Average: ${printScore().second}")
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