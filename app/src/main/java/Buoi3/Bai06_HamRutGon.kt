package Buoi3

// Ho ten: VuTrongToan - MSSV: 25810045

// ---- Ban day du (co tu khoa return) ----
fun binhPhuongDayDu(x: Int): Int {
    return x * x
}

fun chuViHinhVuongDayDu(canh: Double): Double {
    return canh * 4
}

fun laSoChanDayDu(n: Int): Boolean {
    return n % 2 == 0
}

// ---- Ban rut gon (single-expression function) ----
fun binhPhuongRutGon(x: Int): Int = x * x

fun chuViHinhVuongRutGon(canh: Double): Double = canh * 4

fun laSoChanRutGon(n: Int): Boolean = n % 2 == 0

fun main() {
    println("Binh phuong: ${binhPhuongDayDu(5)} == ${binhPhuongRutGon(5)}")
    println("Chu vi hinh vuong: ${chuViHinhVuongDayDu(3.0)} == ${chuViHinhVuongRutGon(3.0)}")
    println("So chan: ${laSoChanDayDu(8)} == ${laSoChanRutGon(8)}")
}