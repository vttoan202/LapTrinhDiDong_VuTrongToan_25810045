package Buoi3

// Ho ten: VuTrongToan - MSSV: 25810045

fun main() {
    // Phan 1: map - nhan doi tung phan tu
    val danhSachSo = listOf(1, 2, 3, 4, 5)
    val danhSachNhanDoi = danhSachSo.map { it * 2 }
    println("Danh sach sau khi nhan doi: $danhSachNhanDoi")

    // Phan 2: flatten - gop danh sach long nhau thanh danh sach phang
    val danhSachLongNhau = listOf(
        listOf(1, 2, 3),
        listOf(4, 5),
        listOf(6, 7, 8, 9)
    )
    val danhSachPhang = danhSachLongNhau.flatten()
    println("Danh sach sau khi flatten: $danhSachPhang")
}