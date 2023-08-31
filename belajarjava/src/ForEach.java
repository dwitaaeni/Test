public class ForEach {
    public static void main(String[] args) {


        String[] names = {
                "Diska", "Wita", "Aeni",
                "Pemrogrammer", "Zaman", "Now"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Perulangan For Each");
        for (var name: names){
            System.out.println(name);
        }
    }
}
