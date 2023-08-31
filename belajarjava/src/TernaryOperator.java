public class TernaryOperator {
    public static void main(String[] args) {

        //  menggunakan if statement
        var nilai = 55;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Semangat Belajar Lagi";
        }
        System.out.println(ucapan);

        // menggunakan ternary operator
        var tinggi = 155;
        String komentar = tinggi >= 165 ? "selamat Kamu Tinggi" : "Maaf Kamu Kurang Tinggi";

        System.out.println(komentar);
    }
}
