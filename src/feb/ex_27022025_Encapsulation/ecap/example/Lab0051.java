package feb.ex_27022025_Encapsulation.ecap.example;

public class Lab0051 {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit",100);
        // amit.bal = 10000; private name
        // amit.setBal(1000000);

        // This should be allowed to only Admin

        // Write a code to connect with mySQL
        // Admin
        boolean are_you_admin = true;
        ICICIBank admin = new ICICIBank("admin",1000);
        admin.setBal(50000,true);
        System.out.println(admin.getName());


    }
}
