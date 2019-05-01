package phil.homework.week1day2.FizzBuzzBizzNuzz

fun fizzbuzz(n: Int): String {
    return when {
        // zero is a special case, so we handle it specially
        n == 0 -> "0"
        // all numbers divisible by both 3 and 5 are divisible by 15
        n % 15 == 0 -> "fizzbuzz"
        n % 5 == 0 -> "buzz"
        n % 3 == 0 -> "fizz"
        else -> n.toString()
    }
}

fun main() {
    for(i in 0..50) println(fizzbuzz(i))
}