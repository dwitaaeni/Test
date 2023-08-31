public class Array {
    public static void main(String[] args) {

        String[] StringArray = new String[3];
        String[] namaNama = {
          "Diska", "Wita", "Aeni"
        };
        System.out.println(StringArray);

        int[] arrayInt = {
          1,2,3,4,5,6,7,8,9
        };

        long[] arrayLong = {
          10L, 20L, 30L
        };

        arrayLong[0] = 0;
        System.out.println(arrayLong.length);

        String[][] members = {
                {"Diska", "Wita"},
                {"Prita", "Aeni"},
                {"Dwi"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
