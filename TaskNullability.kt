/*
* This exercise concentrates on these two approaches
        Elvis Operator
        Assertion operator
* */

data class Student(
    val Id: Int,
    val name:String,
    val grade:Double)

val studentList: List<Student> = listOf(
    Student(223,"John",140.0),
    Student(548,"Mark",120.0),
    Student(342,"Natali",150.0),
    Student(781,"Sara",130.0)
)

fun getStudentById(id:Int) = studentList.find { it.Id==id }!!

fun searchInStudents(name:String):Student? = studentList.find { it.name.lowercase()==name.lowercase() }