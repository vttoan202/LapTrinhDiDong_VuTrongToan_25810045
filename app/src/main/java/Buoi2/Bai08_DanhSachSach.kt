package Buoi2

// Vu Trong Toan - 25810045
fun main() {
    val dsSach = mutableListOf("Dế Mèn Phiêu Lưu Ký", "Nhà Giả Kim", "Đắc Nhân Tâm", "Tôi Thấy Hoa Vàng Trên Cỏ Xanh", "Sapiens")
    println("Danh sách ban đầu: $dsSach")

    dsSach.add("Clean Code")
    dsSach.add("Atomic Habits")
    dsSach.remove("Sapiens")
    dsSach.sort() // hàm sắp xếp có sẵn, theo thứ tự chữ cái

    println("Danh sách sau khi thêm, xoá, sắp xếp: $dsSach")
}