package Buoi3

// Ho ten: VuTrongToan - MSSV: 25810045

fun main() {
    // Kieu function type (String) -> Boolean duoc khai bao tuong minh
    val kiemTraDoDai: (String) -> Boolean = { matKhau -> matKhau.length >= 8 }

    val mk1 = "abc123"
    val mk2 = "matkhaumanh01"
    val mk3 = "12345678"

    println("$mk1 -> ${kiemTraDoDai(mk1)}")
    println("$mk2 -> ${kiemTraDoDai(mk2)}")
    println("$mk3 -> ${kiemTraDoDai(mk3)}")
}
