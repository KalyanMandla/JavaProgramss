package feb.ex_04032025_StaticKeyword;

public class Lab70_ENUM {
    public static void main(String[] args) {
        System.out.println(APIConstantsEndPoints.BASE_URL.getValue());

    }
}

// store the APIConstants - ENDPoints
enum APIConstantsEndPoints{

    BASE_URL("https://app.vwo.com"),
    LOGIN("https:////app.vwo.com/login"),
    DASHBOARD("https://app.vwo.com/dashboard"),
    CHATBOT_PAGE("https:////app.vwo.com/chat");


    private  String name;

    APIConstantsEndPoints(String name) {
        this.name = name;
    }

    String getValue(){
        return name;

    }

}
