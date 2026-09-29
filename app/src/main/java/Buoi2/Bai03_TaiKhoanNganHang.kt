package Buoi2

// Vu Trong Toan - 25810045
fun main() {
    // val vì số dư ban đầu là mốc đối chiếu, không được thay đổi;
    // var vì số dư hiện tại thay đổi sau mỗi giao dịch.
    val soDuBanDau: Long = 5_000_000
    var soDuHienTai: Long = soDuBanDau

    println("Số dư ban đầu: $soDuBanDau đồng")

    soDuHienTai += 2_000_000
    println("Sau khi gửi 2.000.000: $soDuHienTai đồng")

    soDuHienTai -= 1_500_000
    println("Sau khi rút 1.500.000: $soDuHienTai đồng")
}