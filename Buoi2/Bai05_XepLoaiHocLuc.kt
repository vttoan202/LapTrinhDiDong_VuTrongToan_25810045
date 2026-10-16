package Buoi2

// Vu Trong Toan 25810045
fun main() {
    val diemTrungBinh = 8.7
    val xepLoai = when (diemTrungBinh) {
        in 9.0..10.0 -> "Xuất sắc"
        in 8.0..<9.0 -> "Giỏi"
        in 6.5..<8.0 -> "Khá"
        in 5.0..<6.5 -> "Trung bình"
        in 0.0..<5.0 -> "Yếu"
        else -> "Điểm không hợp lệ"
    }
    println("Điểm $diemTrungBinh -> $xepLoai")
}