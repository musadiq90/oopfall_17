package com.company;

class Dice {
    int sum, v, w;

    public Dice() {
        sum = 0;
    }

    public void roll() {
        Die die = new Die();
        Die die1 = new Die();
        die.roll();
        die1.roll();

        v = die.readResult();
        System.out.println("The 1st die roll gives: "+v);
        w = die1.readResult();
        System.out.println("The second die roll gives: "+w);
        sum = v + w;

    }

    int readResult() {
        return sum;
    }

    boolean pair() {
        if (v == w){
            return true;
        }
        else
            return false;
    }

    boolean duces() {
        if (v == w){
            if (v == 1){
                return true;
            }
        }
        return false;
    }
    boolean sevens(){
        if(sum==7){
            return true;
        }
        else
            return false;
    }


}









public class Die {
    int v;


    public Die() {
        v = 0;
    }

    public void roll() {
        int R = (int) (Math.random() * 6 + 1);
        v = R;
    }

    int readResult() {
        return v;
    }
}




class DiceExperiment extends Dice {

    public DiceExperiment(int numRolls) {
        // establishes a dice experiment object to run numRolls times
    }

    public void perform() {
        // performs the experiment
    }

    double getPercent(int i) {
        // returns the percentage of rolls that totaled to i
        return 0;
    }

}
