package gameFirstTry.com.pynzar.marat;

import java.util.Scanner;

public class Bets {
    private int bank;
    private int bet;
    private int coefficient;


    public Bets(int bank) {
        this.bank = bank;


    }


    public void setBet() {
        System.out.println("Set your Bet: \t");
        this.bet = new Scanner(System.in).nextInt();
        System.out.println("Set your Coefficient (2-10): \t");
        this.coefficient = new Scanner(System.in).nextInt();
    }
}
