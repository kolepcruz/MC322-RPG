package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;


public class GraphicInterface implements ActionListener
{

    private static int chosenClass = 0;
    private static int chosenSubClass = 0;
    private static String playerName = "default";
    private static String characterName = "default";


    private static JButton debugButton = new JButton("debug"); // debug routine button
    private static JButton startButton = new JButton("start"); // starts routine button
    private static JButton restartButton  = new JButton("restart"); // restarts routine button

    JFrame myFrame = new JFrame("RPG Helper"); // frame name
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // screen size
    Container myContainer = myFrame.getContentPane(); // get container
    JPanel myPanel = new JPanel();


    private static JLabel projectName = new JLabel("RPG HELPER");
    private static JLabel projectPicture = new JLabel("");
    private static Image mainImage = new ImageIcon("RPG Git.png").getImage(); // get image


    private static int buttonX = 150; //size x of class buttons
    private static int buttonY = 40; //size y of class buttons

    private static JButton barbarianButton = new JButton("barbarian"); //button to selection barbarian
    private static JButton furiousButton = new JButton("furious"); //button to selection mage
    private static JButton totemicButton = new JButton("totemic"); //button to selection rogue

    private static JButton mageButton = new JButton("mage");
    private static JButton frostMageButton = new JButton("frost mage");
    private static JButton fireMageButton = new JButton("fire mage");
    private static JButton arcaneMageButton = new JButton("arcane mage");

    private static JButton rogueButton = new JButton("rogue");
    private static JButton assassinButton = new JButton("assassin");
    private static JButton trapperButton = new JButton("trapper");


    private static JPanel textPanel = new JPanel();
    private static JButton confirmButton = new JButton("confirm");

    private static JTextField nameField = new JTextField(25);
    private static JTextField characterField = new JTextField(25);

    GraphicInterface()
    {
        myFrame.setSize(1080, 720); // size of frame
        myFrame.setLayout(null); // no layout
        myFrame.getContentPane().setBackground(new Color(96, 85, 91)); // set color

        myFrame.setLocation((dim.width - myFrame.getWidth())/2, (dim.height - myFrame.getHeight())/2); // center window

        myContainer.setLayout(null); // set layout
        myContainer.setBackground(new Color(96, 85, 91)); // set color

        myPanel.setBounds(50, 50, 960, 479); // position and size
        myPanel.setLayout(null);
        myContainer.add(myPanel);

        mainImage = mainImage.getScaledInstance(960, 479, java.awt.Image.SCALE_AREA_AVERAGING); // transform it

        projectPicture.setIcon(new ImageIcon(mainImage)); // load image
        projectPicture.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // set board with color
        projectPicture.setBounds(0, 0, 960, 479); // width height
        myPanel.add(projectPicture);

        projectName.setFont(new Font("Impact", Font.BOLD, 60));
        projectName.setForeground(Color.BLACK);
        projectName.setBounds(50, 575, 500, 50);
        myFrame.add(projectName);

        buttonStyle(barbarianButton, 50, 50, buttonX, buttonY, this);
        buttonStyle(mageButton, 200, 50, buttonX, buttonY, this);
        buttonStyle(rogueButton, 350, 50, buttonX, buttonY, this);

        buttonStyle(furiousButton, 50, 100, buttonX, buttonY, this);
        buttonStyle(frostMageButton, 50, 100, buttonX, buttonY, this);
        buttonStyle(assassinButton, 50, 100, buttonX, buttonY, this);
        buttonStyle(totemicButton, 200, 100, buttonX, buttonY, this);
        buttonStyle(trapperButton, 200, 100, buttonX, buttonY, this);
        buttonStyle(fireMageButton, 200, 100, buttonX, buttonY, this);
        buttonStyle(arcaneMageButton, 350, 100, buttonX, buttonY, this);

        buttonStyle(confirmButton, 350, 150, buttonX, buttonY, this);

        textPanel.setBounds(50, 150, 2*buttonX, buttonY); // position and size
        textPanel.setLayout(new FlowLayout());
        textPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // set board with color
        textPanel.add(nameField);

        buttonStyle(startButton, 710, 575, buttonX, buttonY, this);
        buttonStyle(restartButton, 860, 575, buttonX, buttonY, this);
        buttonStyle(debugButton, 860, 615, buttonX, buttonY, this);

        myFrame.getContentPane().add(startButton);
        myFrame.getContentPane().add(restartButton);
        myFrame.getContentPane().add(debugButton);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close operation
        myFrame.dispose();
        myFrame.setVisible(true); //make visible
    }


    public void buttonStyle(JButton button, int positionX, int positionY, int sizeX, int sizeY, ActionListener source)
    {
        button.setFont(new Font("Impact", Font.BOLD, 20));
        button.setForeground(Color.BLACK);
        button.setBounds(positionX, positionY, sizeX, sizeY);
        button.addActionListener(source);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == debugButton)
        {
            System.out.println("\n===============debug===============");
            System.out.println("chosenClass: "+chosenClass);
            System.out.println("chosenSubClass: "+chosenSubClass);
            System.out.println("characterName: "+characterName);
        }

        if(e.getSource() == startButton)
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

        if(e.getSource() == restartButton)
        {
            startButton.setText("start");
            System.out.println("restart");

            chosenClass = 0;
            chosenSubClass = 0;
            characterName = "default";

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

            myFrame.remove(textPanel);
            myFrame.remove(nameField);
            myFrame.remove(confirmButton);

            myFrame.add(myPanel);
            myFrame.add(projectName);
            myFrame.repaint();
            // System.exit(0);
        }

        if(e.getSource() == furiousButton)
        {
            furiousButton.setText(furiousButton.getText().toUpperCase());
            chosenSubClass = 1;

            furiousButton.setEnabled(false);
            totemicButton.setEnabled(false);
            myFrame.repaint();
        }

        if(e.getSource() == totemicButton)
        {
            totemicButton.setText(totemicButton.getText().toUpperCase());
            chosenSubClass = 2;

            furiousButton.setEnabled(false);
            totemicButton.setEnabled(false);
            myFrame.repaint();
        }

        if(e.getSource() == barbarianButton)
        {
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

        if(e.getSource() == frostMageButton)
        {
            frostMageButton.setText(frostMageButton.getText().toUpperCase());
            chosenSubClass = 1;

            frostMageButton.setEnabled(false);
            fireMageButton.setEnabled(false);
            arcaneMageButton.setEnabled(false);
            myFrame.repaint();
        }

        if(e.getSource() == fireMageButton)
        {
            fireMageButton.setText(fireMageButton.getText().toUpperCase());
            chosenSubClass = 2;

            frostMageButton.setEnabled(false);
            fireMageButton.setEnabled(false);
            arcaneMageButton.setEnabled(false);
            myFrame.repaint();
        }

        if(e.getSource() == arcaneMageButton)
        {
            arcaneMageButton.setText(arcaneMageButton.getText().toUpperCase());
            chosenSubClass = 3;

            frostMageButton.setEnabled(false);
            fireMageButton.setEnabled(false);
            arcaneMageButton.setEnabled(false);
            myFrame.repaint();
        }

        if(e.getSource() == mageButton)
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

        if(e.getSource() == assassinButton)
        {
            assassinButton.setText(assassinButton.getText().toUpperCase());
            chosenSubClass = 1;

            assassinButton.setEnabled(false);
            trapperButton.setEnabled(false);
            myFrame.repaint();
        }

        if(e.getSource() == trapperButton)
        {
            trapperButton.setText(trapperButton.getText().toUpperCase());
            chosenSubClass = 2;

            assassinButton.setEnabled(false);
            trapperButton.setEnabled(false);

            myFrame.add(confirmButton);
            confirmButton.setEnabled(true);
            confirmButton.setText(confirmButton.getText().toLowerCase());

            myFrame.add(textPanel);
            textPanel.setEnabled(true);;

            myFrame.repaint();
        }

        if(e.getSource() == rogueButton)
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

        if(e.getSource() == confirmButton)
        {
            characterName = nameField.getText().toLowerCase();

            textPanel.setEnabled(false);
            confirmButton.setEnabled(false);
            confirmButton.setText(confirmButton.getText().toUpperCase());

            myFrame.repaint();
        }
    }

    public static void main(String[] args) {
        new GraphicInterface();
    }
}
