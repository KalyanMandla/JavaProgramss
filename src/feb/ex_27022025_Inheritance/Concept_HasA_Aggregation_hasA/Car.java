package feb.ex_27022025_Inheritance.Concept_HasA_Aggregation_hasA;

public class Car {
    // Car Has-A Engine and Tyre
    protected void startCar(){
        new Engine().start();
        new Tyre().rolling();
    }


}
