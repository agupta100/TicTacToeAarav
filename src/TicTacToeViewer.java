import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class TicTacToeViewer extends JFrame {

    public final int WINDOW_WIDTH = 800;
    public final int WINDOW_HEIGHT = 800;
    private final Image xImage;
    private final Image oImage;
    private TicTacToe t;
    private Square square;


    public TicTacToeViewer(TicTacToe t)
    {
        this.t = t;
        xImage = new ImageIcon("Resources/X.png").getImage();
        oImage = new ImageIcon("Resources/O.png").getImage();
        this.setTitle("Tic Tac Toe!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
        square = new Square(3, 3);


    }

    public Image getXImage()
    {
        return xImage;
    }

    public Image getOImage()
    {
        return oImage;
    }

    public void paint(Graphics g)
    {
        setup(g);
        Square[][] board = t.getBoard();
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j].draw(g, this);
            }
        }
        if (t.checkTie())
        {
            g.drawString("It's a Tie!", 300, 700);
        }
    }

    public void setup(Graphics g)
    {
        g.setColor(Color.RED);
        Font font = new Font("Serif", Font.ITALIC, 45);
        g.setFont(font);

        // Drawing numbers
        g.drawString("0", (WINDOW_WIDTH * 3) / 10, WINDOW_HEIGHT / 10);
        g.drawString("1", WINDOW_WIDTH / 2, WINDOW_HEIGHT / 10);
        g.drawString("2", (WINDOW_WIDTH * 7) / 10, WINDOW_HEIGHT / 10);
        g.drawString("0", WINDOW_WIDTH / 10, (WINDOW_HEIGHT  * 3) / 10);
        g.drawString("1", WINDOW_WIDTH / 10, WINDOW_HEIGHT / 2);
        g.drawString("2", WINDOW_WIDTH / 10, (WINDOW_HEIGHT * 7) / 10);
    }
}
