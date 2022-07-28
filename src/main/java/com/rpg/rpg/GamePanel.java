package com.rpg.rpg;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    //Screen settings
    final int originalTileSize = 16; //16x16
    final int scale = 3;

    final int tileSize = originalTileSize * scale; //48x48
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; //48*16 = 768px
    final int screenHeight = tileSize * maxScreenRow; //48*12 = 576px

    Thread gameThread;

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        while (gameThread != null) {

//            System.out.println("The game loop is running");

            // 1. UPDATE
            update();

            // 2. DRAW
            repaint();
        }
    }

    public void update() {

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.WHITE);
        g2.fillRect(100, 100, tileSize, tileSize);
        g2.dispose();
    }
}
