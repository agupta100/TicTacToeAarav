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
        xImage = new ImageIcon("Resources/O.png").getImage();
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
        g.setColor(Color.RED);

    }
}
