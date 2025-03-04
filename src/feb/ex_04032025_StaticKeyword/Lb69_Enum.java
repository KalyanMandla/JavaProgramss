package feb.ex_04032025_StaticKeyword;

public class Lb69_Enum {
    public static void main(String[] args) {
        System.out.println(Color.RED.getHexcode());
        System.out.println(Color.GREEN.getHexcode());

        if(Color.GREEN.getHexcode() == "#61FF33"){
            System.out.println("Color is Green");
        }

    }
}

enum Color{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF");

    private String hexcode;

    Color(String hexcode) {
        this.hexcode = hexcode;
    }

    public String getHexcode(){
        return this.hexcode;
    }

}
