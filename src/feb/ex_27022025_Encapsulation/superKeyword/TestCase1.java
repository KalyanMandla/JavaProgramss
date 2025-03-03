package feb.ex_27022025_Encapsulation.superKeyword;

public class TestCase1 extends BaseClass{
    // TestCase is a Type of BaseClass - Single Inheritance

    TestCase1(){
        super(); // DC of Parent
        this.setBrowser("edge", true);

    }

    @Override
    public void setBrowser(String browser, boolean isAuth){
        super.setBrowser(browser, isAuth);
    }

}
