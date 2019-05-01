package phil.homework.week1day2.Encoding

fun f(string: String): String {
    val sBuilder = StringBuilder()
    for(letter in string) {
        sBuilder.append(fPrime(letter.toInt()).toChar());
    }
    return sBuilder.toString()
}

fun fPrime(n: Int): Int {
    return when(n) {
        in  97..122 -> 219 - n
        in 65..90 -> 155 - n
        else -> n
    }
}

fun g(string: String): String {
    val freqs = Array<Int>(26, {i -> 0})
    var n: Int
    for(letter in string){
        n = gPrime(letter.toInt())
        if(n >= 0) {
            freqs[n] ++
        }
    }

    val sBuilder = StringBuilder()
    // Specified format does not have a final comma, so neither does my return.
    // Specified format has inconsistent spacing before line items, but I took
    // that as a typo.
    var nextLine: String
    sBuilder.appendln("{")
    for(i in 0..25) {
        nextLine = when(i) {
            25 -> "\t${(i+97).toChar()}:${freqs[i]}"
            else -> "\t${(i+97).toChar()}:${freqs[i]},"
        }
        sBuilder.appendln(nextLine)
    }
    sBuilder.append("}")

    return sBuilder.toString()
}

fun gPrime(n: Int): Int {
    return when(n) {
        in 97..122 -> n - 97
        in 65..90 -> n - 65
        else -> -1
    }
}

fun main() {
    println("acp")
    println(f("acp"))

    // I fixed your grammar bro
    println("Errors in strategy cannot be correctED through tactical maneuvers")
    println(f("Errors in strategy cannot be correctED through tactical maneuvers"))

    println("Hello there! Apple!")
    println(g("Hello there! Apple!"))
}