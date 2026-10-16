package Buoi4

// Vu Trong Toan 25810045
data class SinhVien(val mssv: String, val hoTen: String, val diemTrungBinh: Double)

fun main() {
    val sv1 = SinhVien("123", "Nguyen Van A", 8.0)
    val sv2 = SinhVien("123", "Nguyen Van A", 8.0)

    println(sv1)            // SinhVien(mssv=123, hoTen=Nguyen Van A, diemTrungBinh=8.0)
    println(sv1 == sv2)     // true

    val sv3 = sv1.copy(diemTrungBinh = 9.0)
    println(sv3)            // chi diemTrungBinh doi
}