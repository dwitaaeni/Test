public class MethodVariableAgument {
    public static void main(String[] args) {

        int[] values = {70, 80, 65, 70, 88};
        sayCongrats("Wita", values);

        sayCongrats("Diska", 80, 75, 70, 80, 80);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
