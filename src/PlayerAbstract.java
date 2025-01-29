import java.util.Scanner;

public abstract class PlayerAbstract {
    protected String name;
    protected char symbol;

    public PlayerAbstract(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract int getMove(Scanner sc);
}
