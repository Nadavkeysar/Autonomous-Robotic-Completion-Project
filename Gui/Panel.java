package Gui;

import Bereshit.Moon;
import Bereshit.Ship;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    // engines
    private JLabel main, engines;
    private JLabel topLeft , bottomLeft, topRight, bottomRight, leftTop, leftBottom, rightTop, rightBottom;

    // info
    private JLabel angular, angularT, altitude, altitudeT;
    private JLabel vertical, verticalT, horizontal, horizontalT;
    private JLabel state, stateT;
    private JLabel fuel, fuelT;


    private Ship ship;


    /**
     * Constructor
     *
     * @param s represents the ship.
     */
    public Panel(Ship s) {
        super();
        this.setLayout(null);

        //background = new ImageIcon("./resources/GameBackground.png").getImage();

        this.engines = new JLabel("engines");
        this.add(engines);
        this.engines.setFont(new Font(Font.SERIF, Font.PLAIN,  50));
        this.engines.setBounds(275, 50, 150, 70);
        this.engines.setHorizontalAlignment(SwingConstants.CENTER);
        this.engines.setVerticalAlignment(SwingConstants.CENTER);
        this.engines.setOpaque(true);

        this.main = new JLabel("main");
        this.add(main);
        this.topLeft = new JLabel("topLeft");
        this.add(topLeft);
        this.topRight = new JLabel("topRight");
        this.add(topRight);
        this.bottomLeft = new JLabel("bottomLeft");
        this.add(bottomLeft);
        this.bottomRight = new JLabel("bottomRight");
        this.add(bottomRight);
        this.leftTop = new JLabel("leftTop");
        this.add(leftTop);
        this.leftBottom = new JLabel("leftBottom");
        this.add(leftBottom);
        this.rightTop = new JLabel("rightTop");
        this.add(rightTop);
        this.rightBottom = new JLabel("rightBottom");
        this.add(rightBottom);

        this.state = new JLabel("state");
        this.add(state);
        this.stateT = new JLabel("state");
        this.add(stateT);
        this.stateT.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.stateT.setBounds(1000, 65, 100, 40);
        this.stateT.setHorizontalAlignment(SwingConstants.CENTER);
        this.stateT.setVerticalAlignment(SwingConstants.CENTER);
        this.stateT.setOpaque(true);

        this.angular = new JLabel("angular");
        this.add(angular);
        this.angularT = new JLabel("angular");
        this.add(angularT);
        this.angularT.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.angularT.setBounds(1000, 165, 100, 40);
        this.angularT.setHorizontalAlignment(SwingConstants.CENTER);
        this.angularT.setVerticalAlignment(SwingConstants.CENTER);
        this.angularT.setOpaque(true);

        this.altitude = new JLabel("altitude");
        this.add(altitude);
        this.altitudeT = new JLabel("altitude");
        this.add(altitudeT);
        this.altitudeT.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.altitudeT.setBounds(1000, 265, 100, 40);
        this.altitudeT.setHorizontalAlignment(SwingConstants.CENTER);
        this.altitudeT.setVerticalAlignment(SwingConstants.CENTER);
        this.altitudeT.setOpaque(true);

        this.fuel = new JLabel("fuel");
        this.add(fuel);
        this.fuelT = new JLabel("fuel");
        this.add(fuelT);
        this.fuelT.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.fuelT.setBounds(1000, 365, 100, 40);
        this.fuelT.setHorizontalAlignment(SwingConstants.CENTER);
        this.fuelT.setVerticalAlignment(SwingConstants.CENTER);
        this.fuelT.setOpaque(true);

        this.vertical = new JLabel("vertical");
        this.add(vertical);
        this.verticalT = new JLabel("vertical");
        this.add(verticalT);
        this.verticalT.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.verticalT.setBounds(930, 465, 100, 40);
        this.verticalT.setHorizontalAlignment(SwingConstants.CENTER);
        this.verticalT.setVerticalAlignment(SwingConstants.CENTER);
        this.verticalT.setOpaque(true);

        this.horizontal = new JLabel("horizontal");
        this.add(horizontal);
        this.horizontalT = new JLabel("horizontal");
        this.add(horizontalT);
        this.horizontalT.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.horizontalT.setBounds(1070, 465, 100, 40);
        this.horizontalT.setHorizontalAlignment(SwingConstants.CENTER);
        this.horizontalT.setVerticalAlignment(SwingConstants.CENTER);
        this.horizontalT.setOpaque(true);

        this.ship = s;
    }

    protected void update(){
        this.repaint();
    }

    /**
     * Draws on the window.
     * Overrides paintComponent method.
     *
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        engines();
        g.setColor(Color.BLACK);
        g.drawLine(700, 3, 700, 700);
        info();
    }

    private void engines(){
        this.main.setText("" + ship.getMain().getPower());
        this.main.setFont(new Font(Font.SERIF, Font.PLAIN,  50));
        this.main.setBackground(Color.orange);
        this.main.setBounds(270, 310, 150, 70);
        this.main.setHorizontalAlignment(SwingConstants.CENTER);
        this.main.setVerticalAlignment(SwingConstants.CENTER);
        this.main.setOpaque(true);

        this.topLeft.setText("TL: " + ship.getTopLeft().getPower());
        this.topLeft.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.topLeft.setBackground(Color.orange);
        this.topLeft.setBounds(220, 210, 100, 40);
        this.topLeft.setHorizontalAlignment(SwingConstants.CENTER);
        this.topLeft.setVerticalAlignment(SwingConstants.CENTER);
        this.topLeft.setOpaque(true);

        this.topRight.setText("TR: " + ship.getTopRight().getPower());
        this.topRight.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.topRight.setBackground(Color.orange);
        this.topRight.setBounds(380, 210, 100, 40);
        this.topRight.setHorizontalAlignment(SwingConstants.CENTER);
        this.topRight.setVerticalAlignment(SwingConstants.CENTER);
        this.topRight.setOpaque(true);

        this.bottomLeft.setText("BL: " + ship.getBottomLeft().getPower());
        this.bottomLeft.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.bottomLeft.setBackground(Color.orange);
        this.bottomLeft.setBounds(220, 440, 100, 40);
        this.bottomLeft.setHorizontalAlignment(SwingConstants.CENTER);
        this.bottomLeft.setVerticalAlignment(SwingConstants.CENTER);
        this.bottomLeft.setOpaque(true);

        this.bottomRight.setText("BR:" + ship.getBottomRight().getPower());
        this.bottomRight.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.bottomRight.setBackground(Color.orange);
        this.bottomRight.setBounds(380, 440, 100, 40);
        this.bottomRight.setHorizontalAlignment(SwingConstants.CENTER);
        this.bottomRight.setVerticalAlignment(SwingConstants.CENTER);
        this.bottomRight.setOpaque(true);

        this.leftTop.setText("LT: " + ship.getLeftTop().getPower());
        this.leftTop.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.leftTop.setBackground(Color.orange);
        this.leftTop.setBounds(110, 280, 100, 40);
        this.leftTop.setHorizontalAlignment(SwingConstants.CENTER);
        this.leftTop.setVerticalAlignment(SwingConstants.CENTER);
        this.leftTop.setOpaque(true);

        this.leftBottom.setText("LB: " + ship.getLeftBottom().getPower());
        this.leftBottom.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.leftBottom.setBackground(Color.orange);
        this.leftBottom.setBounds(110, 370, 100, 40);
        this.leftBottom.setHorizontalAlignment(SwingConstants.CENTER);
        this.leftBottom.setVerticalAlignment(SwingConstants.CENTER);
        this.leftBottom.setOpaque(true);

        this.rightTop.setText("RT: " + ship.getRightTop().getPower());
        this.rightTop.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.rightTop.setBackground(Color.orange);
        this.rightTop.setBounds(480, 280, 100, 40);
        this.rightTop.setHorizontalAlignment(SwingConstants.CENTER);
        this.rightTop.setVerticalAlignment(SwingConstants.CENTER);
        this.rightTop.setOpaque(true);

        this.rightBottom.setText("RB: " + ship.getRightBottom().getPower());
        this.rightBottom.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.rightBottom.setBackground(Color.orange);
        this.rightBottom.setBounds(480, 370, 100, 40);
        this.rightBottom.setHorizontalAlignment(SwingConstants.CENTER);
        this.rightBottom.setVerticalAlignment(SwingConstants.CENTER);
        this.rightBottom.setOpaque(true);
    }

    /**
     * if (bereshit.getVerticalSpeed() < 2.5 && bereshit.getHorizontalSpeed() < 2.5) {
     *             System.out.println("landed");
     *         }else{
     *             System.out.println("crashed, speed too high");
     *         }
     *
     *  angularSpeed
     *  getVerticalSpeed
     *  getHorizontalSpeed
     *  altitude
     *  state
     *  fuelKG - less than 50 yellow, less than 10 red
     */
    private void info(){
        String s = null;
        switch (ship.getState()){
            case orientation:
                s = "orientation";
                break;
            case braking:
                s = "braking";
                break;
        }
        this.state.setText(s);
        this.state.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.state.setBackground(Color.GRAY);
        this.state.setBounds(1000, 100, 100, 40);
        this.state.setHorizontalAlignment(SwingConstants.CENTER);
        this.state.setVerticalAlignment(SwingConstants.CENTER);
        this.state.setOpaque(true);

        this.angular.setText("" + ship.getAngularSpeed());
        this.angular.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.angular.setBackground(Color.GRAY);
        this.angular.setBounds(1000, 200, 100, 40);
        this.angular.setHorizontalAlignment(SwingConstants.CENTER);
        this.angular.setVerticalAlignment(SwingConstants.CENTER);
        this.angular.setOpaque(true);

        this.altitude.setText("" + ship.getAltitude());
        this.altitude.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        this.altitude.setBackground(Color.GRAY);
        this.altitude.setBounds(1000, 300, 100, 40);
        this.altitude.setHorizontalAlignment(SwingConstants.CENTER);
        this.altitude.setVerticalAlignment(SwingConstants.CENTER);
        this.altitude.setOpaque(true);

        double f = ship.getFuelKG();
        this.fuel.setText("" + f);
        this.fuel.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        if (f > 50){
            this.fuel.setBackground(Color.green);
        }
        else if (f <= 50 && f > 30){
            this.fuel.setBackground(Color.yellow);
        }
        else{
            this.fuel.setBackground(Color.red);
        }
        this.fuel.setBounds(1000, 400, 100, 40);
        this.fuel.setHorizontalAlignment(SwingConstants.CENTER);
        this.fuel.setVerticalAlignment(SwingConstants.CENTER);
        this.fuel.setOpaque(true);

        /**
         * if (bereshit.getVerticalSpeed() < 2.5 && bereshit.getHorizontalSpeed() < 2.5) {
         *             System.out.println("landed");
         *         }else{
         *             System.out.println("crashed, speed too high");
         *         }
         */
        double v = ship.getVerticalSpeed();
        this.vertical.setText("" + v);
        this.vertical.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        if(Moon.inMoonRange(ship.getAltitude())){
            if(v < 40.0) {
                this.vertical.setBackground(Color.green);
            }
            else if (v > 40.0 && v < 45.5){
                this.vertical.setBackground(Color.yellow);
            }
            else {
                this.vertical.setBackground(Color.red);
            }
        }
        else {
            if (v < 48.0 && v >= 40.0) {
                this.vertical.setBackground(Color.green);
            }
            else if ((v >= 48.0 && v < 52.5) || (v < 40.0 && v >= 35.5)) {
                this.vertical.setBackground(Color.yellow);
            }
            else {
                this.vertical.setBackground(Color.red);
            }
        }
        this.vertical.setBounds(930, 500, 100, 40);
        this.vertical.setHorizontalAlignment(SwingConstants.CENTER);
        this.vertical.setVerticalAlignment(SwingConstants.CENTER);
        this.vertical.setOpaque(true);

        double h = ship.getHorizontalSpeed();
        this.horizontal.setText("" + h);
        this.horizontal.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
        if(h < 1800) {
            this.horizontal.setBackground(Color.green);
        }
        else if (h >= 1800 && h < 2000){
            this.horizontal.setBackground(Color.yellow);
        }
        else {
            this.horizontal.setBackground(Color.red);
        }
        this.horizontal.setBounds(1070, 500, 100, 40);
        this.horizontal.setHorizontalAlignment(SwingConstants.CENTER);
        this.horizontal.setVerticalAlignment(SwingConstants.CENTER);
        this.horizontal.setOpaque(true);
    }
}
