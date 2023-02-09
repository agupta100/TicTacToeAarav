import javax.swing.*;
import java.awt.*;

/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

public class Square {

    private String marker;
    private int row;
    private int col;
    private boolean isWinningSquare;
    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col) {
        this.row = row;
        this.col = col;

        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
    }

    /******************** Getters and Setters ********************/
    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {
        this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }

    public void draw(Graphics g, TicTacToeViewer window)
    {
        int width = 800 / 5;
        int height = 800 / 5;
        Image xImage = new ImageIcon("Resources/X.png").getImage();
        Image oImage = new ImageIcon("Resources/O.png").getImage();
        Font font = new Font("Serif", Font.ITALIC, 45);
        g.setFont(font);
        g.setColor(Color.BLACK);
        g.drawRect(window.WINDOW_WIDTH / 5 * (row + 1), window.WINDOW_HEIGHT / 5 * (col + 1), width, height);
        if (marker.equals(TicTacToe.X_MARKER))
        {
            g.drawImage(xImage, width * (col + 1), height * (row + 1), 800 / 5,
                    800 / 5, window);
        }
        else if (marker.equals(TicTacToe.O_MARKER))
        {
            g.drawImage(oImage, width * (col + 1), height * (row + 1), 800 / 5,
                    800 / 5, window);
        }
        if (isWinningSquare)
        {
            g.setColor(Color.GREEN);
            g.fillRect(width * (col + 1), height * (row + 1),800 / 5, 800 / 5);
            if (marker.equals(TicTacToe.X_MARKER))
            {
                g.drawImage(xImage, width * (col + 1), height * (row + 1), 800 / 5,
                        800 / 5, window);
                g.setColor(Color.BLACK);
                Font newFont = new Font("Serif", Font.PLAIN, 90);
                g.drawString("X Wins", 300, 700);
            }
            else if (marker.equals(TicTacToe.O_MARKER))
            {
                g.drawImage(oImage, width * (col + 1), height * (row + 1), 800 / 5,
                        800 / 5, window);
                g.setColor(Color.BLACK);
                Font newFont = new Font("Serif", Font.PLAIN, 90);
                g.drawString("O Wins", 300, 700);
            }
        }



    }
}
