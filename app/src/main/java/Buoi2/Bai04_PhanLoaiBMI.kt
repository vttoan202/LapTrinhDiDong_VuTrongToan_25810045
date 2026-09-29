package Buoi2

// Vu Trong Toan 25810045
fun main() {
    val canNang = 65.0
    val chieuCao = 1.70
    val bmi = canNang / (chieuCao * chieuCao)

    val phanLoai: String
    if (bmi < 18.5) {
        phanLoai = "Gầy"
    } else if (bmi < 25.0) {
        phanLoai = "Bình thường"
    } else if (bmi < 30.0) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }
    println("BMI = ${"%.2f".format(bmi)} -> $phanLoai")
}