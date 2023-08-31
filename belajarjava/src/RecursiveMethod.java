public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));

        loop(100);
    }

    static int factorialLoop(int value){
        var result = 1;

        for(var counter = 1; counter<= value; counter++){
            result *= counter;
        }

        return result;
    }

    // Recursive Method

    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        } else {
            return value *factorialRecursive(value - 1);
        }
    }

    // eror StackOverflow

    static void loop(int value) {
        if (value == 0) {
            System.out.println("print selesai");
        } else {
            System.out.println("Loop-" + value);
            loop(value -1);
        }
    }
}
