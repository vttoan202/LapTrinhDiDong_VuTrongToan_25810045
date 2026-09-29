package Buoi4

// Vu Trong Toan 25810045
open class DongVat(val ten: String) {
    open fun keu(): String = "..."
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String = "Gau gau"
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String = "Meo meo"
}

fun main() {
    val danhSach = listOf(Cho("Lu"), Meo("Mimi"))
    for (dv in danhSach) {
        println("${dv.ten}: ${dv.keu()}")
    }
}