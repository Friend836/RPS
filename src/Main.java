import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RockPaperScissors game = new RockPaperScissors();
        // Re-start game if user press C else quit game
        String con;
        con = "C";
        while (con.compareToIgnoreCase("C") == 0) {
            game.startGame();
            // ask user 'Continue?'
            System.out.print("... Continue? [C|X] ");
            // user enters C or X
            con = input.next();
//            System.out.print(con);
        }
        System.out.print("Adios!");
    }
}