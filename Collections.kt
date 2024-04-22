fun main() {

    /**
     * Scenario
     *
     * Imagine you are creating a forum for coders in a programming community.
     * In that forum, the user can create a post. For instance, they may talk in
     * their post about their code or projects. Other coders in that forum can
     * choose a comment to add to that post.  In addition, the users can choose
     * a relationship type. This indicates the relationship between one user
     * and another. These are relationship types such as ‘work colleague’,
     * ‘friend’ or being a member of the same sports team. Finally, you will
     * include the ability for the author of a post to block other users
     * from commenting on the post.
     */

    // storing all the comments:
    var comments = listOf<Comment>(
        Comment(5241, "Nice code"),
        Comment(6624, "Like it"),
        Comment(5224, "What's going on?"),
        Comment(9001, "Check out my website"),
        Comment(8818, "Hello everyone,:)")
    )
    var blockedUserIds = setOf(5224,9001)
    var userIdToRelation = mapOf<Int, String>(5241 to "Friend", 6624 to "Work Colleague")

    for (element in comments){
        if(element.userID !in blockedUserIds)
            println("${element.userID} said ${element.message} - from ${userIdToRelation[element.userID]?:"Unknown"}")
    }
}

class Comment(
    val userID: Int,
    val message: String
)


// List: ordered list (Read only by default)
// mutableList: Read/Write (Mutable variant of List)
fun listPractice(){
    var list = listOf('a','b')
    list = list + 'c' - 'a' // bc
}

// Set: unordered elements, do not accept duplicate; to store email addresses or to store list of IDs which are always unique
fun setPractice(){
    val set = setOf('a','b','c')
    println(set) // [a,b,c]
    println(set + 'a') // [a,b,c]; because we can not duplicate any element in set
    println('b' in set) // true

}
// Map: key-value pair, logical connection between objects (employee ID and position)
// duplicated values are allowed but not keys, if you duplicate keys then it will remove the previous one.
fun mapPractice(){
    val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)
    val number: Int? = alphabet['A']
    println(number) // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null
}

