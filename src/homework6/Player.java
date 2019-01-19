package homework6;

public class Player implements PlayXO {
    public void setScore(int score) {
        this.score = score;
    }

    private int score;

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    private String name;

    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    private boolean isWinner;

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void chooseSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public Move chooseMove(int col, int line) {
        return new Move(col, line);
    }
}
