public class Scope {
    public static void main(String[] args) {

        sayHello("wita");
    }
     static void sayHello(String name){
        String hello = "Hello " + name;

         if (!name.isBlank()){
             String hai = "Hai " + name;

             System.out.println(hai);
         }
         System.out.println(hello);
     }
}
