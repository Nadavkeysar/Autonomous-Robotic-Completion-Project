package Gui;

import Bereshit.*;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private Ship ship;
    private Panel panel;

    /**
     * Constructor
     *
     * @param s represents the ship that we present its details.
     */
    public Frame(Ship s) {
        super();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        this.setTitle("Bereshit control"); // Sets the title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits from application
        this.setSize(screenWidth, screenHeight); // Sets the x-dimension and y-dimension of frame
        this.setResizable(true);
//        ImageIcon image = new ImageIcon("./resources/Pokemon.png"); // Creates an ImageIcon
//        this.setIconImage(image.getImage()); // Changes icon of frame
        this.setExtendedState(Frame.MAXIMIZED_BOTH);

        this.ship = s;
        initPanel();
        this.setVisible(true); // Makes frame visible
    }

    private void initPanel(){
        this.panel = new Panel(this.ship);
        this.add(panel);
    }

    /**
     * Updates the frame during the game all the time.
     *
     */
    public void update(){
        this.panel.update();
    }
}
