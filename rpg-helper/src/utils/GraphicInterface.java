package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GraphicInterface
{
    static int chosenClass = 0;
    static int chosenSubClass = 0;

    public static void main(String[] args) {

        JButton startButton; // starts routine button
        JButton restartButton; // restarts routine button
        JButton debugButton; // restarts routine button

        JLabel projectName;
        JLabel projectPicture;
        Image mainImage;

        JButton barbarianButton = new JButton("barbarian");
        JButton furiousButton = new JButton("furious");
        JButton totemicButton = new JButton("totemic");

        int classButtonX = 150;
        int classButtonY = 40;

        JButton mageButton = new JButton("mage");
        JButton frostMageButton = new JButton("frost mage");
        JButton fireMageButton = new JButton("fire mage");
        JButton arcaneMageButton = new JButton("arcane mage");

        JButton rogueButton = new JButton("rogue");
        JButton assassinButton = new JButton("assassin");
        JButton trapperButton = new JButton("trapper");

        JFrame myFrame = new JFrame("RPG Helper"); // frame name
        myFrame.setSize(1080, 720); // size of frame
        myFrame.setLayout(null); // no layout
        myFrame.getContentPane().setBackground(new Color(96, 85, 91)); // set color

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // screen size
        myFrame.setLocation((dim.width - myFrame.getWidth()) / 2, (dim.height - myFrame.getHeight()) / 2); // center window

        Container myContainer = myFrame.getContentPane(); // get container
        myContainer.setLayout(null); // set layout
        myContainer.setBackground(new Color(96, 85, 91)); // set color

        JPanel myPanel = new JPanel();
        myPanel.setBounds(50, 50, 960, 479); // position and size
        myPanel.setLayout(null);
        myContainer.add(myPanel);

        mainImage = new ImageIcon("RPG Git.png").getImage(); // get image
        mainImage = mainImage.getScaledInstance(960, 479, java.awt.Image.SCALE_AREA_AVERAGING); // transform it

        projectPicture = new JLabel("");
        projectPicture.setIcon(new ImageIcon(mainImage)); // load image
        projectPicture.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // set board with color
        projectPicture.setBounds(0, 0, 960, 479); // width height
        myPanel.add(projectPicture);

        projectName = new JLabel("RPG HELPER");
        projectName.setFont(new Font("Impact", Font.BOLD, 60));
        projectName.setForeground(Color.BLACK);
        projectName.setBounds(50, 575, 500, 50);
        myFrame.add(projectName);

        furiousButton.setFont(new Font("Impact", Font.BOLD, 20));
        furiousButton.setForeground(Color.BLACK);
        furiousButton.setBounds(50, 100, classButtonX, classButtonY);
        furiousButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                furiousButton.setText(furiousButton.getText().toUpperCase());
                chosenSubClass = 1;

                furiousButton.setEnabled(false);
                totemicButton.setEnabled(false);
                myFrame.repaint();
            }
        });

        totemicButton.setFont(new Font("Impact", Font.BOLD, 20));
        totemicButton.setForeground(Color.BLACK);
        totemicButton.setBounds(200, 100, classButtonX, classButtonY);
        totemicButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                totemicButton.setText(totemicButton.getText().toUpperCase());
                chosenSubClass = 2;

                furiousButton.setEnabled(false);
                totemicButton.setEnabled(false);
                myFrame.repaint();
            }
        });

        barbarianButton.setFont(new Font("Impact", Font.BOLD, 20));
        barbarianButton.setForeground(Color.BLACK);
        barbarianButton.setBounds(50, 50, classButtonX, classButtonY);
        barbarianButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                barbarianButton.setText(barbarianButton.getText().toUpperCase());
                chosenClass = 1;

                barbarianButton.setEnabled(false);
                mageButton.setEnabled(false);
                rogueButton.setEnabled(false);

                myFrame.add(furiousButton);
                furiousButton.setEnabled(true);
                furiousButton.setText(furiousButton.getText().toLowerCase());

                myFrame.add(totemicButton);
                totemicButton.setEnabled(true);
                totemicButton.setText(totemicButton.getText().toLowerCase());
                myFrame.repaint();
            }
        });

        frostMageButton.setFont(new Font("Impact", Font.BOLD, 20));
        frostMageButton.setForeground(Color.BLACK);
        frostMageButton.setBounds(50, 100, classButtonX, classButtonY);
        frostMageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frostMageButton.setText(frostMageButton.getText().toUpperCase());
                chosenSubClass = 1;

                frostMageButton.setEnabled(false);
                fireMageButton.setEnabled(false);
                arcaneMageButton.setEnabled(false);
                myFrame.repaint();
            }
        });

        fireMageButton.setFont(new Font("Impact", Font.BOLD, 20));
        fireMageButton.setForeground(Color.BLACK);
        fireMageButton.setBounds(200, 100, classButtonX, classButtonY);
        fireMageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fireMageButton.setText(fireMageButton.getText().toUpperCase());
                chosenSubClass = 2;

                frostMageButton.setEnabled(false);
                fireMageButton.setEnabled(false);
                arcaneMageButton.setEnabled(false);
                myFrame.repaint();
            }
        });

        arcaneMageButton.setFont(new Font("Impact", Font.BOLD, 20));
        arcaneMageButton.setForeground(Color.BLACK);
        arcaneMageButton.setBounds(350, 100, classButtonX, classButtonY);
        arcaneMageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arcaneMageButton.setText(arcaneMageButton.getText().toUpperCase());
                chosenSubClass = 3;

                frostMageButton.setEnabled(false);
                fireMageButton.setEnabled(false);
                arcaneMageButton.setEnabled(false);
                myFrame.repaint();
            }
        });

        mageButton.setFont(new Font("Impact", Font.BOLD, 20));
        mageButton.setForeground(Color.BLACK);
        mageButton.setBounds(200, 50, classButtonX, classButtonY);
        mageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                mageButton.setText(mageButton.getText().toUpperCase());
                chosenClass = 2;

                barbarianButton.setEnabled(false);
                mageButton.setEnabled(false);
                rogueButton.setEnabled(false);

                myFrame.add(frostMageButton);
                frostMageButton.setEnabled(true);
                frostMageButton.setText(frostMageButton.getText().toLowerCase());

                myFrame.add(fireMageButton);
                fireMageButton.setEnabled(true);
                fireMageButton.setText(fireMageButton.getText().toLowerCase());

                myFrame.add(arcaneMageButton);
                arcaneMageButton.setEnabled(true);
                arcaneMageButton.setText(arcaneMageButton.getText().toLowerCase());
                myFrame.repaint();
            }
        });

        assassinButton.setFont(new Font("Impact", Font.BOLD, 20));
        assassinButton.setForeground(Color.BLACK);
        assassinButton.setBounds(50, 100, classButtonX, classButtonY);
        assassinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                assassinButton.setText(assassinButton.getText().toUpperCase());
                chosenSubClass = 1;

                assassinButton.setEnabled(false);
                trapperButton.setEnabled(false);
                myFrame.repaint();
            }
        });

        trapperButton.setFont(new Font("Impact", Font.BOLD, 20));
        trapperButton.setForeground(Color.BLACK);
        trapperButton.setBounds(200, 100, classButtonX, classButtonY);
        trapperButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trapperButton.setText(trapperButton.getText().toUpperCase());
                chosenSubClass = 2;

                assassinButton.setEnabled(false);
                trapperButton.setEnabled(false);
                myFrame.repaint();
            }
        });

        rogueButton.setFont(new Font("Impact", Font.BOLD, 20));
        rogueButton.setForeground(Color.BLACK);
        rogueButton.setBounds(350, 50, classButtonX, classButtonY);
        rogueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                rogueButton.setText(rogueButton.getText().toUpperCase());
                chosenClass = 3;

                barbarianButton.setEnabled(false);
                mageButton.setEnabled(false);
                rogueButton.setEnabled(false);

                myFrame.add(assassinButton);
                assassinButton.setEnabled(true);
                assassinButton.setText(assassinButton.getText().toLowerCase());

                myFrame.add(trapperButton);
                trapperButton.setEnabled(true);
                trapperButton.setText(trapperButton.getText().toLowerCase());
                myFrame.repaint();
            }
        });

        startButton = new JButton("start");
        startButton.setFont(new Font("Impact", Font.BOLD, 20));
        startButton.setForeground(Color.BLACK);
        startButton.setBounds(810, 575, 100, 40);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                startButton.setText("build");
                System.out.println("start");

                myFrame.remove(myPanel);
                myFrame.remove(projectName);

                myFrame.add(barbarianButton);
                barbarianButton.setEnabled(true);
                barbarianButton.setText(barbarianButton.getText().toLowerCase());

                myFrame.add(mageButton);
                mageButton.setEnabled(true);
                mageButton.setText(mageButton.getText().toLowerCase());

                myFrame.add(rogueButton);
                rogueButton.setEnabled(true);
                rogueButton.setText(rogueButton.getText().toLowerCase());

                myFrame.repaint();
            }
        });
        myFrame.getContentPane().add(startButton);

        restartButton = new JButton("restart");
        restartButton.setFont(new Font("Impact", Font.BOLD, 20));
        restartButton.setForeground(Color.BLACK);
        restartButton.setBounds(910, 575, 100, 40);
        restartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                startButton.setText("start");
                System.out.println("restart");

                chosenClass = 0;
                chosenSubClass = 0;

                myFrame.remove(barbarianButton);
                myFrame.remove(furiousButton);
                myFrame.remove(totemicButton);

                myFrame.remove(mageButton);
                myFrame.remove(frostMageButton);
                myFrame.remove(fireMageButton);
                myFrame.remove(arcaneMageButton);

                myFrame.remove(rogueButton);
                myFrame.remove(assassinButton);
                myFrame.remove(trapperButton);

                myFrame.add(myPanel);
                myFrame.add(projectName);
                myFrame.repaint();
                // System.exit(0);
            }
        });
        myFrame.getContentPane().add(restartButton);

        debugButton = new JButton("debug");
        debugButton.setFont(new Font("Impact", Font.BOLD, 20));
        debugButton.setForeground(Color.BLACK);
        debugButton.setBounds(910, 615, 100, 40);
        debugButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("\n===============debug===============");
                System.out.println("chosenClass: "+chosenClass);
                System.out.println("chosenSubClass: "+chosenSubClass);
            }
        });
        myFrame.getContentPane().add(debugButton);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close operation
        myFrame.dispose();
        myFrame.setVisible(true); //make visible
    }
}
