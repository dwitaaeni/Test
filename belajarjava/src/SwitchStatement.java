public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "B";

        switch (nilai){
            case "A":
                System.out.println("Anda Lulus dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        // switch lambda
        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        // kata kunci yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }
        System.out.println(ucapan);

        ucapan = switch (nilai){
            case  "A" :
                yield "Anda Lulus Dengan Baik";
            case "B", "C" :
                yield "Nilai Anda Cukup";
            case "D" :
                yield "Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
