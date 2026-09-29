package Buoi2

// Vu Trong Toan 25810045
fun main() {
    var a = 0
    var b = 1
    for (viTri in 0..100) {
        if (a >= 100) break
        println("F($viTri) = $a")
        val tiepTheo = a + b
        a = b
        b = tiepTheo
    }
}