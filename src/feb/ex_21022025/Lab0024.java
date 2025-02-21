package feb.ex_21022025;

public class Lab0024 {
    public static void main(String[] args) {

        //Grade Calculator
        //write a programs that calculates and displays
        //The letter grade for a given numerical
        //score(e.g., A, B, C, D, F)
        //based on the following grading scale:
        //A: 90 - 100
        //B: 80 - 89
        //C: 70 - 79
        //D: 60 - 69
        //F: 0 - 59

        //90 -> A
        //87 -> B
        //23 -> F

        //Logic Building

        //1.Find the user Inputs
        //score -> int score = 89;
        //return -> data - type - grade -> char

        //2.Basic logic
        //if score >= 90 && score <= 100 -> A
        //else if score >= 80 && score <= 89 -> B
        //else if score >= 70 && score <= 79 -> C
        //D,E
        //else -> grade -> F

        //3.Write the code
        char grade = 'F';
        int score = 89; // in the future we will get this from user. inputs
        char garde;
        if(score >= 90 && score <= 100){
            garde = 'A';
        }
        else if(score >= 80 && score <= 89){
            grade ='B';
        }
        else if(score >= 70 && score <= 79){
            grade = 'C';
        }
        else if(score >= 60 && score <= 69){
            grade = 'D';
        }
        else if(score <= 0 || score > 100){
            System.out.println("LoL!!, are you God?");
            grade = '0';
        }
        else{
            garde = 'F';
        }
        System.out.println("Your Garde is -> " + grade);

    }
}
