package Buoi3

// Ho ten: VuTrongToan - MSSV: 25810045

fun main() {
    val tuoi = 15

    val loaiVe = if (tuoi < 12) {
        "Ve tre em"
    } else if (tuoi < 60) {
        "Ve nguoi lon"
    } else {
        "Ve cao tuoi"
    }

    println("Loai ve: $loaiVe")
}
