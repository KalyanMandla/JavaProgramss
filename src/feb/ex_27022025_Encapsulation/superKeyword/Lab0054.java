package feb.ex_27022025_Encapsulation.superKeyword;

public class Lab0054 {
    public static void main(String[] args) {
        BaseClass t1 = new BaseClass();
        TestCase1 t2 = new TestCase1();
        BaseClass t3 = new TestCase1(); // Dynamic Dispatch


        // Dynamic Dispatch
        t3.openBrowser("edge");
        t3.closeBrowser();

    }
}
