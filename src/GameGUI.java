import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameGUI {
    int speed = 10;

    JFrame frame = new JFrame("CarRace");
    JPanel carPanel = new JPanel();
    GameGUI() throws IOException {
       CarHandler hnd = new CarHandler(this);

        //for resizing the Image
        BufferedImage bufferedImage = ImageIO.read(new File("D:\\java\\Big Assignments\\Car_Race_Game\\car.png"));
        Image image = bufferedImage.getScaledInstance(100, 150, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(image);
        JLabel car = new JLabel(icon);

        //for road image
        JLabel background = new JLabel("", new ImageIcon("runningroad.gif"),JLabel.CENTER);
        background.setBounds(0,0,500,700);
        frame.add(background);
        carPanel.add(car);
        carPanel.setSize(100,150);
        Color carBg =Color.decode("0x212326");
        carPanel.setBackground(carBg);
        carPanel.setLocation(260,400);

        frame.setLayout(null);
        frame.addKeyListener(hnd);
        background.add(carPanel);
        frame.setSize(500,700);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
