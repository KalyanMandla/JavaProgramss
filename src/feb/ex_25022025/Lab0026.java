package feb.ex_25022025;

public class Lab0026 {
    public static void main(String[] args) {
//        int a = 10;
//        switch(a){
//
//        }

          char ch = 'A'; // 65
          switch(ch){

          }

//          boolean b = true; // Its Invalid
//          switch(b){
//
//          }

         long all = 30l;
          switch((int)all){

          }

          //JDk > 13
          int itemcode = 006;
          switch(itemcode){
              case 001,002,005:
                  System.out.println("All of the them are Electronic Gadgets");
                  break;
              case 004,006,007:
                  System.out.println("All of the them are Mechanical Gadgets");
                  break;
              default:
                  System.out.println("None");
                  break;

          }





    }
}
