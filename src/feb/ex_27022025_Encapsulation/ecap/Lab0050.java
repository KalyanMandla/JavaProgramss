package feb.ex_27022025_Encapsulation.ecap;

public class Lab0050 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hacker";
        System.out.println(vwoLogin.password);


        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("good admin","password");
        // System.out.println(vwoLogin1.password);
        //  vwoLogin1.password = "pass123";
        System.out.println(vwoLogin1.getPassword());

        //checking Admin
        boolean isAdmin = false;

        vwoLogin1.setPassword("newpassword", isAdmin);
        System.out.println(vwoLogin1.getPassword());

    }
}
