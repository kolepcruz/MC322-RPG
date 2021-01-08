package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GraphicInterface implements ActionListener
{
    private static int buttonX = 150; //size x of class buttons
    private static int buttonY = 40; //size y of class buttons

    private static int sliderX = 75;
    private static int sliderY = 250;

    private static int chosenClass = 0;
    private static int chosenSubClass = 0;
    private static String playerName = "default";
    private static String characterName = "default";
    private static int strengthInt = 0;


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

    private static JButton barbarianButton = new JButton("barbarian"); //button to selection barbarian
    private static JButton mageButton = new JButton("mage");
    private static JButton rogueButton = new JButton("rogue");
    
    private static JButton furiousButton = new JButton("furious"); //button to selection mage
    private static JButton totemicButton = new JButton("totemic"); //button to selection rogue
    private static JButton frostMageButton = new JButton("frost mage");
    private static JButton fireMageButton = new JButton("fire mage");
    private static JButton arcaneMageButton = new JButton("arcane mage");
    private static JButton assassinButton = new JButton("assassin");
    private static JButton trapperButton = new JButton("trapper");

    private static JPanel characterPanel = new JPanel();
    private static JTextField characterField = new JTextField(25);
    private static JButton confirmCharacterName = new JButton("confirm");
    
    private static JPanel playerPanel = new JPanel();
    private static JTextField playerField = new JTextField(25);
    private static JButton confirmPlayerName = new JButton("confirm");

    private static JPanel strengthPanel = new JPanel();
    private static JSlider strengthSlider = new JSlider(JSlider.VERTICAL, 0, 15, 0);
    private static JButton confirmStrength = new JButton("confirm");

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

        buttonStyle(barbarianButton, 50, 50, buttonX, buttonY, this, 20);
        buttonStyle(mageButton, 200, 50, buttonX, buttonY, this, 20);
        buttonStyle(rogueButton, 350, 50, buttonX, buttonY, this, 20);

        buttonStyle(furiousButton, 50, 100, buttonX, buttonY, this, 20);
        buttonStyle(frostMageButton, 50, 100, buttonX, buttonY, this, 20);
        buttonStyle(assassinButton, 50, 100, buttonX, buttonY, this, 20);
        buttonStyle(totemicButton, 200, 100, buttonX, buttonY, this, 20);
        buttonStyle(trapperButton, 200, 100, buttonX, buttonY, this, 20);
        buttonStyle(fireMageButton, 200, 100, buttonX, buttonY, this, 20);
        buttonStyle(arcaneMageButton, 350, 100, buttonX, buttonY, this, 20);

        characterPanel.setBounds(50, 150, 2*buttonX, buttonY); // position and size
        characterPanel.setLayout(new FlowLayout());
        characterPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // set board with color
        characterPanel.add(characterField);
        buttonStyle(confirmCharacterName, 350, 150, buttonX, buttonY, this, 20);

        playerPanel.setBounds(50, 200, 2*buttonX, buttonY); // position and size
        playerPanel.setLayout(new FlowLayout());
        playerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // set board with color
        playerPanel.add(playerField);
        buttonStyle(confirmPlayerName, 350, 200, buttonX, buttonY, this, 20);

        strengthSlider.setMinorTickSpacing(1);
        strengthSlider.setMajorTickSpacing(5);
        strengthSlider.setPaintLabels(true);
        strengthSlider.setPaintTicks(true);
        strengthSlider.setFont(new Font("Impact", Font.PLAIN, 15));

        strengthPanel.setBounds(50, 250, sliderX, sliderY);
        strengthPanel.setLayout(new FlowLayout());
        strengthPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        strengthPanel.add(strengthSlider);
        buttonStyle(confirmStrength, 50, 500, 75, buttonY, this, 10);

        buttonStyle(startButton, 710, 575, buttonX, buttonY, this, 20);
        buttonStyle(restartButton, 860, 575, buttonX, buttonY, this, 20);
        buttonStyle(debugButton, 860, 615, buttonX, buttonY, this, 20);

        myFrame.getContentPane().add(startButton);
        myFrame.getContentPane().add(restartButton);
        myFrame.getContentPane().add(debugButton);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close operation
        myFrame.dispose();
        myFrame.setVisible(true); //make visible
    }


    public void buttonStyle(JButton button, int positionX, int positionY, int sizeX, int sizeY, ActionListener source, int fontSize)
    {
        button.setFont(new Font("Impact", Font.BOLD, fontSize));
        button.setForeground(Color.BLACK);
        button.setBounds(positionX, positionY, sizeX, sizeY);
        button.addActionListener(source);
    }

    public void closeClassButton(JButton button)
    {
        button.setText(button.getText().toUpperCase());

        barbarianButton.setEnabled(false);
        mageButton.setEnabled(false);
        rogueButton.setEnabled(false);

        myFrame.repaint();
    }

    public void closeSubClassButton(JButton subClass0, JButton subClass1, JButton subClass2)
    {
        subClass0.setText(subClass0.getText().toUpperCase());

        subClass0.setEnabled(false);
        subClass1.setEnabled(false);
        subClass2.setEnabled(false);

        openButton(confirmCharacterName);

        myFrame.add(characterPanel);
        characterField.setEditable(true);
        characterField.setText("");
        characterPanel.setEnabled(true);

        myFrame.repaint();
    }

    public void openButton(JButton button)
    {
        myFrame.add(button);
        button.setEnabled(true);
        button.setText(button.getText().toLowerCase());

        myFrame.repaint();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == debugButton)
        {
            System.out.println("\n===============debug===============");
            System.out.println("chosenClass: "+chosenClass);
            System.out.println("chosenSubClass: "+chosenSubClass);
            System.out.println("characterName: "+characterName);
            System.out.println("playerName: "+playerName);
            System.out.println("strengthInt: "+strengthInt);
        }

        if(e.getSource() == restartButton)
        {
            startButton.setText("start");
            System.out.println("restart");

            chosenClass = 0;
            chosenSubClass = 0;
            characterName = "default";
            playerName = "default";
            strengthInt = 0;

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

            myFrame.remove(characterPanel);
            myFrame.remove(characterField);
            myFrame.remove(confirmCharacterName);

            myFrame.remove(playerPanel);
            myFrame.remove(playerField);
            myFrame.remove(confirmPlayerName);

            myFrame.remove(strengthPanel);
            myFrame.remove(strengthSlider);
            myFrame.remove(confirmStrength);

            myFrame.add(myPanel);
            myFrame.add(projectName);
            myFrame.repaint();
            // System.exit(0);
        }

        if(e.getSource() == startButton)
        {
            startButton.setText("build");
            System.out.println("start");

            myFrame.remove(myPanel);
            myFrame.remove(projectName);

            openButton(barbarianButton);
            openButton(mageButton);
            openButton(rogueButton);

            myFrame.repaint();
        }

        if(e.getSource() == barbarianButton)
        {
            chosenClass = 1;
            closeClassButton(barbarianButton);

            openButton(furiousButton);
            openButton(totemicButton);
        }

        if(e.getSource() == mageButton)
        {
            chosenClass = 2;
            closeClassButton(mageButton);

            openButton(frostMageButton);
            openButton(fireMageButton);
            openButton(arcaneMageButton);
        }

        if(e.getSource() == rogueButton)
        {
            chosenClass = 3;
            closeClassButton(rogueButton);

            openButton(assassinButton);
            openButton(trapperButton);
        }

        if(e.getSource() == furiousButton)
        {
            chosenSubClass = 1;
            closeSubClassButton(furiousButton, furiousButton, totemicButton);
        }

        if(e.getSource() == totemicButton)
        {
            chosenSubClass = 2;
            closeSubClassButton(totemicButton, furiousButton, totemicButton);
        }

        if(e.getSource() == frostMageButton)
        {
            chosenSubClass = 1;
            closeSubClassButton(frostMageButton, fireMageButton, arcaneMageButton);
        }

        if(e.getSource() == fireMageButton)
        {
            chosenSubClass = 2;
            closeSubClassButton(fireMageButton, frostMageButton, arcaneMageButton);
        }

        if(e.getSource() == arcaneMageButton)
        {
            chosenSubClass = 3;
            closeSubClassButton(arcaneMageButton, frostMageButton, fireMageButton);
        }

        if(e.getSource() == assassinButton)
        {
            chosenSubClass = 1;
            closeSubClassButton(assassinButton, trapperButton, assassinButton);
        }

        if(e.getSource() == trapperButton)
        {
            chosenSubClass = 2;
            closeSubClassButton(trapperButton, trapperButton, assassinButton);
        }

        if(e.getSource() == confirmCharacterName)
        {
            characterName = characterField.getText().toLowerCase();

            characterField.setEditable(false);
            confirmCharacterName.setEnabled(false);
            confirmCharacterName.setText(confirmCharacterName.getText().toUpperCase());

            openButton(confirmPlayerName);
            myFrame.add(playerPanel);
            playerField.setEditable(true);
            playerField.setText("");

            myFrame.repaint();
        }

        if(e.getSource() == confirmPlayerName)
        {
            playerName = playerField.getText().toLowerCase();

            playerField.setEditable(false);
            confirmPlayerName.setEnabled(false);
            confirmPlayerName.setText(confirmPlayerName.getText().toUpperCase());

            openButton(confirmStrength);
            myFrame.add(strengthPanel);
            strengthSlider.setEnabled(true);

            myFrame.repaint();
        }

        if(e.getSource() == confirmStrength)
        {
            strengthInt = strengthSlider.getValue();

            strengthSlider.setEnabled(false);
            confirmStrength.setEnabled(false);
            confirmStrength.setText(confirmStrength.getText().toUpperCase());

            myFrame.repaint();
        }
    }

    public static void main(String[] args) {
        new GraphicInterface();
    }
}
