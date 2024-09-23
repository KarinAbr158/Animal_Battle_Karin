package com.shaihi.animalbattle;

public class Elephant extends Animal{
    public Elephant(int ignoredStrength){
        super(10);
    }
    @Override
    public String battle(Animal other) {
        if(other instanceof Elephant) {
            return "It's a tie.";
        }
        else if(other instanceof Monkey){
            return "The elephant beat the monkey.";
        }
        else if(other instanceof Lion){
            return "The elephant beat the lion.";
        }
         return"";
    }
}
