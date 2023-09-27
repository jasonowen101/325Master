import java.util.Random;

class Knight extends Thread {
    public void run() {
        System.out.println("The brave Knight sets out on a quest to slay the dragon!");
        Random rand = new Random();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Knight: Step " + i);
                Thread.sleep(rand.nextInt(1000) + 500);
            }
        } catch (InterruptedException e) {
            System.err.println("Knight's adventure was interrupted!");
        }
        System.out.println("The Knight returns victorious!");
    }
}

class Wizard extends Thread {
    public void run() {
        System.out.println("The wise Wizard embarks on a mystical journey to find ancient artifacts!");
        Random rand = new Random();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Wizard: Step " + i);
                Thread.sleep(rand.nextInt(1000) + 500);
            }
        } catch (InterruptedException e) {
            System.err.println("Wizard's adventure was interrupted!");
        }
        System.out.println("The Wizard returns with powerful artifacts!");
    }
}

class Thief extends Thread {
    public void run() {
        System.out.println("The cunning Thief sneaks into the treasure vault to steal the crown jewels!");
        Random rand = new Random();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thief: Step " + i);
                Thread.sleep(rand.nextInt(1000) + 500);
            }
        } catch (InterruptedException e) {
            System.err.println("Thief's adventure was interrupted!");
        }
        System.out.println("The Thief escapes with the crown jewels!");
    }
}

public class RetroMultithreadingAdventure {
    public static void main(String[] args) {
        Knight knight = new Knight();
        Wizard wizard = new Wizard();
        Thief thief = new Thief();

        knight.start();
        wizard.start();
        thief.start();

        try {
            knight.join();
            wizard.join();
            thief.join();
        } catch (InterruptedException e) {
            System.err.println("The adventure was interrupted!");
        }

        System.out.println("All characters have completed their adventures!");
    }
}
