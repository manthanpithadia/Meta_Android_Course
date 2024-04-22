import kotlin.jvm.Throws

// annotation classes

annotation class MyAnnotation(val someDescription: String)

@MyAnnotation("Description of the function")
@Throws(ArithmeticException::class)
fun divide(a:Int, b:Int):Int
{
    return a/b
}

//enum class : set of defined values

// enum with Constructor
enum class PizzaSize(val sizeInCm: Int){
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRA_LARGE(30)
}

fun printSize(pizzaSize: PizzaSize){
    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")
//    in main function: printSize(PizzaSize.MEDIUM) //MEDIUM is 20 cm
}

enum class PaymentMethod{
    CASH,
    CARD,
    CHECK
}
fun pay (amount:Double, method: PaymentMethod): Boolean{
    return when(method) {
        PaymentMethod.CARD -> true
        PaymentMethod.CASH -> true
        PaymentMethod.CHECK -> true
    }
}
fun callPaymentMethod(){
    pay(342.00, PaymentMethod.CASH)
    println(PaymentMethod.CASH.ordinal) //position: 0
}


// data classes

data class Dog(
    val name: String,
    val age: Int
)

fun callDataClass() {
    val dog = Dog("Cookie",1)
    var (firstName, age) = dog
    println(firstName) //Cookie
    println(dog.age) //1

    val newDog = dog.copy(age= dog.age+1)
    println(newDog.age) //2
}

/* Pair and Triple
*  Pair: Dataclass with 2 constructor properties
* */

fun paringExample() {
    val pair = Pair(1.0, 'A')
    println(pair.first) // 1.0
    println(pair.second) // A

    val pair2 = 5.0 to 'B'
    println("${pair2.first} and ${pair2.second}")

    val triple = Triple(1F,"ABC", true)
}
