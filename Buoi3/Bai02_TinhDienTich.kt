package Buoi3

// Ho ten: VuTrongToan - MSSV: 25810045

fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

val dienTich1 = tinhDienTich(5.0, 3.0).also { println("Dien tich hinh 1 (5.0 x 3.0) = $it") }
val dienTich2 = tinhDienTich(7.5, 2.0).also { println("Dien tich hinh 2 (7.5 x 2.0) = $it") }

fun main() {

}