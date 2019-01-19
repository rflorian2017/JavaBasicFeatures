package homework6;

public interface PlayXO {
    final String XSYMBOL = "X";
    final String OSYMBOL = "0";

    void chooseSymbol(String symbol);
    Move chooseMove(int col, int line);
}
