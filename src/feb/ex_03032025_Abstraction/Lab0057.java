package feb.ex_03032025_Abstraction;

public class Lab0057 {
    public static void main(String[] args) {

        CHROMETC c = new CHROMETC();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenshot();
        c.NoBodyKnowsWhereIamPresent();

        FIREFOXTC firefoxTC = new FIREFOXTC();
        firefoxTC.openBrowser("FIREFOX");
        firefoxTC.closeBrowser("FIREFOX");


    }
}
