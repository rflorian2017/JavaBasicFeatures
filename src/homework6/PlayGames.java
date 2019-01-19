package homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayGames {

    static void displayMainMenu() {
        System.out.println("Choose option:");
        System.out.println("1. New game");
        System.out.println("2. Get players stats");
        System.out.println("q: Quit");
    }

    static void choosePlayers(BufferedReader br, Game game) throws IOException{
        String str = "";
        System.out.println("Player 1");
        System.out.println("Name:");
        str = br.readLine();
        PlayXO player1 = new Player(str.trim());
        System.out.println("Choose symbol : X or 0 ?");
        str = br.readLine();
        player1.chooseSymbol(str.toUpperCase().equals("X") ? PlayXO.XSYMBOL : PlayXO.OSYMBOL);

        System.out.println("Player 2");
        System.out.println("Name:");
        str = br.readLine();
        PlayXO player2 = new Player(str.trim());
        player2.chooseSymbol(((Player) player1).getSymbol().equals("X") ? PlayXO.OSYMBOL : PlayXO.XSYMBOL);

        game.startGame((Player)player1, (Player)player2);
    }

    public static void main(String[] args) throws IOException {
        GameXandO game = new Game();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while (!(s.equals("q"))) {
            displayMainMenu();
            s = br.readLine();
            System.out.println(s);

            if(s.equals("q"))
                continue;

            if(s.equals("2")) {
                System.out.println(((Game) game).getStats());
            }

            if(s.equals("1")) {
                choosePlayers(br, (Game) game);

                while (!game.checkWin()) {
                    System.out.println(game.displayBoard());

                    System.out.println("Choose move for player 1:");
                    System.out.println("Line (0-2):");
                    int line = Integer.parseInt(br.readLine());

                    System.out.println("Column (0-2):");
                    int column = Integer.parseInt(br.readLine());
                    ((Game) game).processMove(((Game) game).getPlayer1().chooseMove(column, line), ((Game) game).getPlayer1().getSymbol());
                    System.out.println(game.displayBoard());
                    if (game.checkWin()) {
                        break;
                    }

                    System.out.println("Choose move for player 2:");
                    System.out.println("Line (0-2):");
                    line = Integer.parseInt(br.readLine());

                    System.out.println("Column (0-2):");
                    column = Integer.parseInt(br.readLine());
                    ((Game) game).processMove(((Game) game).getPlayer2().chooseMove(column, line), ((Game) game).getPlayer2().getSymbol());
                    System.out.println(game.displayBoard());
                }

                System.out.println(((Game) game).getPlayer1().isWinner() ? "Player 1 has won!" : "Player 2 has won!");

                System.out.println(game.displayBoard());
            }

        }
    }
}
