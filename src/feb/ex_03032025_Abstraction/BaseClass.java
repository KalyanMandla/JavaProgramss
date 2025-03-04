package feb.ex_03032025_Abstraction;

public class BaseClass extends GrandBaseClass{
    // Web Automation
    // Single
    // Hide the Functionality of the open and close Browser

    void openBrowser(String browser){}
    void closeBrowser(String browser){}


    @Override
    void takeScreenshot(){
        System.out.println("Taking Screenshot");
    }


}
