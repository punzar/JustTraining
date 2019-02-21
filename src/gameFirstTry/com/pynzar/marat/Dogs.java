package gameFirstTry.com.pynzar.marat;

import static java.lang.Math.random;

public class Dogs {
   private String name;
   private int luck;

    public Dogs(String name) {
        this.name = name;
        int luckStat = (int)(Math.random()*10+1);
        this.luck = luckStat+100;

    }

    public int getLuck() {
        return luck;
    }

    public String getName() {
        return name;
    }
}
