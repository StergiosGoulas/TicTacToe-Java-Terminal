import java.util.Scanner;

public class HumanPlayer extends PlayerAbstract {

    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public int getMove(Scanner sc) {
        System.out.println("Hello " + name + " give me your move(" + symbol + "): ");
        return sc.nextInt();
    }
}