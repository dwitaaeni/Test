public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("wita");
        sayHello("Diska", "Wita");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println("Hallo " + name);
    }

    static void sayHello(String firstname, String lastname){
        System.out.println("Hello " + firstname + " " + lastname);
    }
}
