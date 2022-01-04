package ex3;

public class Dice {
    private int value;

    public Dice(){
        value = play();
    }

    public int play(){
        value = (int)(Math.random() * 5 + 1);
        return value;
    }

    public int getValue(){
        return this.value;
    }
}
