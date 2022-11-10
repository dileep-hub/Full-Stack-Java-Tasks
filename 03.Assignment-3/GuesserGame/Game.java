import java.util.*;

class Guesser {
    int guessNum;

    int guessNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser please guess the number : ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player {
    int guessNum;

    int guessNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player guess the number : ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNum();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNum();
        numFromPlayer2 = p2.guessNum();
        numFromPlayer3 = p3.guessNum();

    }
    void collectNumFromPlayers12() {
        Player p1 = new Player();
        Player p2 = new Player();

        numFromPlayer1 = p1.guessNum();
        numFromPlayer2 = p2.guessNum();

    }

    void collectNumFromPlayers13() {
        Player p1 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNum();
        numFromPlayer3 = p3.guessNum();

    }

    void collectNumFromPlayers23() {
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer2 = p2.guessNum();
        numFromPlayer3 = p3.guessNum();

    }

    void compare12() {
        if(numFromPlayer2==numFromGuesser && numFromPlayer1 == numFromGuesser) {
            System.out.println("Tie between p1 and p2");
            System.out.println("p1 and p2 try again");
            Umpire u = new Umpire();
            u.collectNumFromGuesser();
            u.collectNumFromPlayers12();
            u.compare12();
        } else if(numFromPlayer2 == numFromGuesser) {
            System.out.println("p2 won the game!!");
        } else if (numFromPlayer1 == numFromGuesser){
            System.out.println("p1 won");
        } else {
            System.out.println("no one won, tie between p1 and p2 :(");
            System.out.println("");
            Umpire u = new Umpire();
            u.collectNumFromGuesser();
            u.collectNumFromPlayers12();
            u.compare12();
        }
    }
    void compare13() {
        if(numFromPlayer3==numFromGuesser && numFromPlayer1 == numFromGuesser) {
            System.out.println("Tie between p1 and p3");
            System.out.println("p3 and p1 try again");
            Umpire u = new Umpire();
            u.collectNumFromGuesser();
            u.collectNumFromPlayers13();
            u.compare13();
        } else if(numFromPlayer3 == numFromGuesser) {
            System.out.println("p3 won");
        } else if (numFromPlayer1 == numFromGuesser){
            System.out.println("p1 won");
        } else {
            System.out.println("no one won, tie between p1 and p3");
            Umpire u = new Umpire();
            u.collectNumFromGuesser();
            u.collectNumFromPlayers13();
            u.compare13();
        }
    }
    void compare32() {
        if(numFromPlayer2==numFromGuesser && numFromPlayer3 == numFromGuesser) {
            System.out.println("Tie between p3 and p2");
            System.out.println("P3 and p2 try again");
            Umpire u = new Umpire();
            u.collectNumFromGuesser();
            u.collectNumFromPlayers23();
            u.compare32();
        } else if(numFromPlayer2 == numFromGuesser) {
            System.out.println("p2 won");
        } else if (numFromPlayer3 == numFromGuesser){
            System.out.println("p3 won");
        } else {
            System.out.println("no one won, tie between p2 and p3");
            Umpire u = new Umpire();
            u.collectNumFromGuesser();
            u.collectNumFromPlayers23();
            u.compare32();
        }
    }

    void compare() {
        if(numFromPlayer1 == numFromGuesser) {
            if(numFromPlayer3 == numFromGuesser && numFromPlayer2 == numFromGuesser) {
                System.out.println("everyone won");
                System.out.println("please try again");
                Umpire u = new Umpire();
                u.collectNumFromGuesser();
                u.collectNumFromPlayers();
                u.compare();
            }
            else if(numFromPlayer2 == numFromGuesser) {
                System.out.println("Tie between p1 and p2");
                System.out.println("p1 and p2 try again");
                Umpire u = new Umpire();
                u.collectNumFromGuesser();
                u.collectNumFromPlayers12();
                u.compare12();
            }
            else if(numFromPlayer3 == numFromGuesser) {
                System.out.println("Tie between p1 and p3");
                System.out.println("p1 and p3 try again");
                Umpire u = new Umpire();
                u.collectNumFromGuesser();
                u.collectNumFromPlayers13();
                u.compare13();
            }
            else System.out.println("p1 won");
        }

        else if(numFromPlayer2 == numFromGuesser) {
            if( numFromPlayer3 == numFromGuesser) {
                System.out.println("Tie between p2 and p3");
                System.out.println("p2 ans p3 try again");
                Umpire u = new Umpire();
                u.collectNumFromGuesser();
                u.collectNumFromPlayers23();
                u.compare32();
            }
            else System.out.println("p2 won the game");
        }

        else if(numFromPlayer3 == numFromGuesser) {
            System.out.println("p3 won the game");
        }

        else {
            System.out.println("No one won");
            System.out.println("please try again ");
            Umpire u = new Umpire();
            u.collectNumFromGuesser();
            u.collectNumFromPlayers();
            u.compare();
        }
    }

}

public class Game {
    public static void main(String[] args) {

        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();

    }
}
