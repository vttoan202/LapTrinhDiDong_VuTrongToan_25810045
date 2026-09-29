// Ho ten: VuTrongToan - MSSV: 25810045

fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "Ban thuong") {
    println("Dat ban cho $tenKhachHang, $soLuongKhach khach, loai ban: $loaiBan")
}

fun main() {
    // Cach 1: dung gia tri mac dinh cho loaiBan
    datBan("Nguyen Van A", 4)

    // Cach 2: truyen du tham so theo dung thu tu
    datBan("Tran Thi B", 6, "Ban VIP")

    // Cach 3: truyen tham so bang ten (named argument)
    datBan(tenKhachHang = "Le Van C", soLuongKhach = 2, loaiBan = "Ban ngoai troi")
}