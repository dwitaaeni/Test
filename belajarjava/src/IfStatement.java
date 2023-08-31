public class IfStatement {
    public static void main(String[] args) {

        // If Statement
        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >=75) {
            System.out.println("Selamat Anda Lulus");   // if statement
        } else {
            System.out.println("Anda Tidak Lulus");     // else statement
        }

        // kode else if statement
        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50 ) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }

    }
}
