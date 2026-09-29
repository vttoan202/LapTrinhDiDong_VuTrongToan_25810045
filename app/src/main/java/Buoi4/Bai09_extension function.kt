package Buoi4

// Vu Trong Toan 25810045
fun String.demNguyenAm(): Int = this.count { it.lowercaseChar() in "aeiou" }

fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) return false
    for (i in 2..Math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    println("Hello".demNguyenAm())      // 2
    println("Kotlin".demNguyenAm())     // 2
    println("AEIOU xyz".demNguyenAm())  // 5

    println(7.laSoNguyenTo())   // true
    println(10.laSoNguyenTo())  // false
    println(1.laSoNguyenTo())   // false
}