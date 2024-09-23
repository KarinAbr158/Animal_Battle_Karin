package com.shaihi.animalbattle;

public class Lion extends Animal{
    public Lion(int ignoredStrength) {
        super(8);
    }

    @Override
    public String battle(Animal other) {
        if(other instanceof Lion) {
            return "It's a tie.";
        }
        else if(other instanceof Monkey){
            return "The lion beat the monkey.";
        }
        else if(other instanceof Elephant){
            return "The elephant beat the lion.";
        }
         return "";
    }
}
