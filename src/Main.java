import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextGame extends JPanel implements KeyListener {
    private char[][] grid = new char[10][10];
    private int playerX = 0;
    private int playerY = 0;

    public TextGame() {
        initializeGrid();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void initializeGrid() {
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                grid[y][x] = ' ';
            }
        }
        grid[playerY][playerX] = 'P';
    }

    public void displayGrid(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.WHITE);

        int cellSize = 30;

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                g.drawString(String.valueOf(grid[y][x]), x * cellSize, (y + 1) * cellSize);
            }
        }
    }

    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        switch (key) {
            case 'w':
                if (playerY > 0) {
                    grid[playerY][playerX] = ' ';
                    playerY--;
                }
                break;
            case 'a':
                if (playerX > 0) {
                    grid[playerY][playerX] = ' ';
                    playerX--;
                }
                break;
            case 's':
                if (playerY < grid.length - 1) {
                    grid[playerY][playerX] = ' ';
                    playerY++;
                }
                break;
            case 'd':
                if (playerX < grid[0].length - 1) {
                    grid[playerY][playerX] = ' ';
                    playerX++;
                }
                break;
            case 'q':
                System.exit(0);
                break;
        }
        grid[playerY][playerX] = 'P';
        repaint();
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Text-Based Game");
        TextGame game = new TextGame();
        frame.add(game);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        displayGrid(g);
    }
}
