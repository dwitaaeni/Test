public class TipeDataBukaPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null; // tipe data bukan primitif
        System.out.println(iniByte);

        iniByte =100;
        System.out.println(iniByte);

    // Konversi dari Data Tipe Primitif ke Tipe Data Bukan Primitif

        int iniInt = 100;
        Integer iniInteger2 = iniInt;

    // Konversi dari Tipe Data Bukan Primitif ke Tipe Data Primitif

        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();


    }
}
