import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class TicTacToeViewer extends JFrame {

    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 800;
    private final Image xImage;
    private final Image oImage;
    private TicTacToe t;
    public TicTacToeViewer(TicTacToe t)
    {
        this.t = t;
        xImage = new ImageIcon("Resources/X.png").getImage();
        oImage = new ImageIcon("Resources/O.png").getImage();
        this.setTitle("Tic Tac Toe!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);

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
    }

    public void setup(Graphics g)
    {
        g.setColor(Color.RED);
        Font font = new Font("Times", Font.PLAIN, 45);
        g.setFont(font);

        // Drawing numbers
        g.drawString("0", (WINDOW_WIDTH * 3) / 10, WINDOW_HEIGHT / 10);
        g.drawString("1", WINDOW_WIDTH / 2, WINDOW_HEIGHT / 10);
        g.drawString("2", (WINDOW_WIDTH * 7) / 10, WINDOW_HEIGHT / 10);
        g.drawString("0", WINDOW_WIDTH / 10, (WINDOW_HEIGHT  * 3) / 10);
        g.drawString("1", WINDOW_WIDTH / 10, WINDOW_HEIGHT / 2);
        g.drawString("2", WINDOW_WIDTH / 10, (WINDOW_HEIGHT * 7) / 10);
        g.setColor(Color.BLACK);
        g.drawLine(WINDOW_WIDTH / 5, WINDOW_HEIGHT / 5, WINDOW_WIDTH / 5, (WINDOW_HEIGHT * 4) / 5);
        g.drawLine(WINDOW_WIDTH / 5, WINDOW_HEIGHT / 5, (WINDOW_WIDTH * 4) / 5, WINDOW_HEIGHT / 5);
        g.drawLine(WINDOW_WIDTH / 5, (WINDOW_HEIGHT * 4) / 5, (WINDOW_WIDTH * 4) / 5, (WINDOW_HEIGHT * 4) / 5);
        g.drawLine((WINDOW_WIDTH * 4) / 5, WINDOW_HEIGHT / 5, (WINDOW_WIDTH * 4) / 5, (WINDOW_HEIGHT * 4) / 5);
        g.drawLine((WINDOW_WIDTH * 2) / 5, WINDOW_HEIGHT / 5, (WINDOW_WIDTH * 2) / 5, (WINDOW_HEIGHT * 4) / 5);
        g.drawLine((WINDOW_WIDTH * 3) / 5, WINDOW_HEIGHT / 5, (WINDOW_WIDTH * 3) / 5, (WINDOW_HEIGHT * 4) / 5);
        g.drawLine(WINDOW_WIDTH / 5, (WINDOW_HEIGHT * 2) / 5, (WINDOW_WIDTH * 4) / 5, (WINDOW_HEIGHT * 2) / 5);
        g.drawLine(WINDOW_WIDTH / 5, (WINDOW_HEIGHT * 3) / 5, (WINDOW_WIDTH * 4) / 5, (WINDOW_HEIGHT * 3) / 5);

//        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

    }
}
