package com.shaihi.animalbattle;

public class Monkey extends Animal{
    public Monkey(int ignoredStrength){
        super(3);
    }
    @Override
    public String battle(Animal other) {
        if(other instanceof Monkey) {
            return "It's a tie.";
        }
        else if(other instanceof Lion){
            return "The lion beat the monkey.";
        }
        else if(other instanceof Elephant){
            return "The elephant beat the monkey.";
        }
         return"";
    }
}
