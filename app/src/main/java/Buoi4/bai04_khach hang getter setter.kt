package Buoi4

// Ho ten - MSSV
class KhachHang(var ho: String, var ten: String) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val viTri = value.trim().lastIndexOf(' ')
            if (viTri == -1) {
                ho = ""
                ten = value.trim()
            } else {
                ho = value.trim().substring(0, viTri)
                ten = value.trim().substring(viTri + 1)
            }
        }
}

fun main() {
    val kh = KhachHang("Nguyen Van", "An")
    println(kh.hoTen)          // Nguyen Van An

    kh.ten = "Binh"
    println(kh.hoTen)          // Nguyen Van Binh

    kh.hoTen = "Tran Thi Mai"
    println("Ho: ${kh.ho}")    // Tran Thi
    println("Ten: ${kh.ten}")  // Mai
}