package Buoi4

// Vu Trong Toan 25810045
class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV001", "An", 15000000.0)
    val nv2 = NhanVien("Binh")

    // println(nv1.maNhanVien)
    // Loi bien dich: maNhanVien khong co val/var nen chi la tham so constructor,
    // khong phai thuoc tinh cua object, khong truy cap duoc tu ben ngoai.

    println("${nv1.ten} - ${nv1.luongThang}")
    println("${nv2.ten} - ${nv2.luongThang}")
}