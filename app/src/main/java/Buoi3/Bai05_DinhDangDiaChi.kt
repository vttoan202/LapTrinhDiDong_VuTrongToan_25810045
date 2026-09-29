package Buoi3

// Ho ten: VuTrongToan - MSSV: 25810045

fun dinhDangDiaChi(
    soNha: String,
    tenDuong: String,
    phuong: String = "Khong xac dinh",
    quan: String = "Khong xac dinh",
    thanhPho: String = "TP.HCM"
): String {
    return "$soNha $tenDuong, $phuong, $quan, $thanhPho"
}

fun main() {
    val diaChi1 = dinhDangDiaChi(
        "123", "Nguyen Trai",
        phuong = "Phuong 5",
        quan = "Quan 5",
        thanhPho = "TP.HCM"
    )
    println(diaChi1)

    val diaChi2 = dinhDangDiaChi(
        "45A", "Le Van Viet",
        quan = "TP. Thu Duc"
    )
    println(diaChi2)
}