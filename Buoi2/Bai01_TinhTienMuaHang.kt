package Buoi2

// Vu Trong Toan - 25810045
fun main() {
    val soLuong: Int = 3
    val donGia: Double = 25000.0
    val tienHang = soLuong.toDouble() * donGia
    val tongTien = tienHang * 1.08 // cộng thuế 8%
    println("Tổng tiền phải trả: ${"%,.0f".format(tongTien)} VND")
}