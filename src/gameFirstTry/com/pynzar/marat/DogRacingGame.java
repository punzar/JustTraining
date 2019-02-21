package gameFirstTry.com.pynzar.marat;

import java.util.Scanner;

public class DogRacingGame {
    public void startDogRacing() {
        System.out.println("Set your Bank size: ");
        Bets bank = new Bets(new Scanner(System.in).nextInt());
        bank.setBet();
        Dogs richard = new Dogs("Brave Richard");
        Dogs rex = new Dogs("Dumb Rex");
        Dogs dobby = new Dogs("Free Dog Dobby");

        int luckSum = rex.getLuck() + richard.getLuck() + dobby.getLuck();
        String[] party = new String[luckSum];
        for (int d = 0; d < party.length; d++) {
            int place = (int) (Math.random() * 3);
            switch (place) {
                case 0:
                    party[d] = richard.getName();

                case 1:
                    party[d] = rex.getName();

                case 2:
                    party[d] = dobby.getName();

            }

        }
        int winner = (int) (Math.random() * party.length);
        String name = party[winner];
        System.out.println("And the winner is: " + name);

    }
}