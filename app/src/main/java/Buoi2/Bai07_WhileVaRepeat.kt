package Buoi2

// Vu Trong Toan 25810045
// So sánh: dùng while khi chưa biết trước số lần lặp hoặc lặp theo điều kiện;
// dùng repeat khi biết chính xác số lần lặp và không cần biến đếm phức tạp.
fun main() {
    var so = 10
    while (so >= 1) {
        println(so)
        so--
    }

    repeat(5) {
        println("Học Kotlin thật thú vị!")
    }
}