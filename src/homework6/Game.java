package homework6;

import java.util.ArrayList;

public class Game implements GameXandO {
    private ArrayList<Player> players;
    private String[][] gameBoard = new String[3][3];
    private Player player1, player2;

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Game() {
        players = new ArrayList<>();
    }

    public void startGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

        if (!players.contains(player1)) {
            players.add(player1);
        }

        if (!players.contains(player2)) {
            players.add(player2);
        }

        initGame();

    }

    public String getStats() {
        String aux = "";
        for (Player player :
                players) {
            aux+= player.getName() + " score: " + player.getScore() + "\n";
        }

        return aux;
    }

    public void processMove(Move move, String symbol) {
        gameBoard[move.getLine()][move.getCol()] = symbol;
        checkWin();
    }

    @Override
    public void initGame() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                gameBoard[i][j] = "|_| ";
            }
        }
    }

    @Override
    public String displayBoard() {
        String result = "";
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                result += gameBoard[i][j] + "\t";
            }
            result += "\n";
        }
        return result;
    }

    @Override
    public boolean checkWin() {
        String firstPlayerSymbol = player1.getSymbol();
        String secondPlayerSymbol = player2.getSymbol();

        if ((checkLine(0, firstPlayerSymbol) ||
                checkLine(1, firstPlayerSymbol) ||
                checkLine(2, firstPlayerSymbol))
                ||
                (checkColumn(0, firstPlayerSymbol) ||
                        checkColumn(1, firstPlayerSymbol) ||
                        checkColumn(2, firstPlayerSymbol))

                ||
                checkDiagonal(firstPlayerSymbol)

        ) {
            player1.setWinner(true);
            player1.setScore(player1.getScore() + 1);

            return true;
        } else {
            if ((checkLine(0, secondPlayerSymbol) ||
                    checkLine(1, secondPlayerSymbol) ||
                    checkLine(2, secondPlayerSymbol))
                    ||
                    (checkColumn(0, secondPlayerSymbol) ||
                            checkColumn(1, secondPlayerSymbol) ||
                            checkColumn(2, secondPlayerSymbol))

                    ||
                    checkDiagonal(secondPlayerSymbol)

            ) {
                player2.setWinner(true);
                player2.setScore(player2.getScore() + 1);
                return true;
            }
        }
        return false;
    }

    private boolean checkLine(int line, String symbol) {
        for (int i = 0; i < gameBoard[line].length; i++) {
            if (!gameBoard[line][i].equals(symbol)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(int column, String symbol) {
        for (int i = 0; i < gameBoard.length; i++) {
            if (!gameBoard[i][column].equals(symbol)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonal(String symbol) {
        for (int i = 0; i < gameBoard.length; i++) {
            if (!gameBoard[i][i].equals(symbol)) {
                return false;
            }
        }
        return true;
    }
}
