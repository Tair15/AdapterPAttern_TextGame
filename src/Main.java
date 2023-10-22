import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("TextGame");
        TextGame game = new TextGame();
        frame.add(game);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
