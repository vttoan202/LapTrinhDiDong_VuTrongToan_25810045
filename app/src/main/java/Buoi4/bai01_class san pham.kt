package Buoi4

// Vu Trong Toan - MSSV cua ban
package buoi4.bai01

class SanPham(val tenSanPham: String, val gia: Double, val soLuongTonKho: Int = 0)

fun main() {
    val sp1 = SanPham("Ban phim", 350000.0, 20)
    val sp2 = SanPham(tenSanPham = "Chuot", gia = 150000.0)

    println("${sp1.tenSanPham} - ${sp1.gia} - ${sp1.soLuongTonKho}")
    println("${sp2.tenSanPham} - ${sp2.gia} - ${sp2.soLuongTonKho}")
}