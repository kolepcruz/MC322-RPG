package utils;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class GraphicInterface implements ActionListener
{
    private static int buttonX = 150; //size x of class buttons
    private static int buttonY = 40; //size y of class buttons
    private static int textFontSmall = 10;
    private static int textFontLarge = 20;

    private static int sliderX = 75;
    private static int sliderY = 240;
    private static int sliderMin = 0;
    private static int sliderMax = 15;
    private static int sliderMajor = 3;
    private static int sliderMinor = 1;
    private static int sliderText = 15;

    private static int chosenClass = 0;
    private static int chosenSubClass = 0;
    private static String playerName = "default";
    private static String characterName = "default";

    private static int totalAttributesInt = 72;
    private static int strengthInt = 0;
    private static int dexterityInt = 0;
    private static int constitutionInt = 0;
    private static int intelligenceInt = 0;
    private static int wisdomInt = 0;
    private static int charismaInt = 0;

    int marginX = 0;
    int marginY = 0;
    int exSpace = 0;


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
    private static JButton characterButton = new JButton("confirm");
    
    private static JPanel playerPanel = new JPanel();
    private static JTextField playerField = new JTextField(25);
    private static JButton playerButton = new JButton("confirm");

    private static JPanel strengthPanel = new JPanel();
    private static JSlider strengthSlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton strengthButton = new JButton("confirm");

    private static JPanel dexterityPanel = new JPanel();
    private static JSlider dexteritySlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton dexterityButton = new JButton("confirm");

    private static JPanel constitutionPanel = new JPanel();
    private static JSlider constitutionSlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton constitutionButton = new JButton("confirm");

    private static JPanel intelligencePanel = new JPanel();
    private static JSlider intelligenceSlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton intelligenceButton = new JButton("confirm");

    private static JPanel wisdomPanel = new JPanel();
    private static JSlider wisdomSlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton wisdomButton = new JButton("confirm");

    private static JPanel charismaPanel = new JPanel();
    private static JSlider charismaSlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton charismaButton = new JButton("confirm");

    private static JPanel attributesPanel = new JPanel();
    private static JLabel attributesLabel = new JLabel("attributes total: ");
    private static JLabel totalAttributesLabel = new JLabel(String.valueOf(totalAttributesInt));

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

        marginX = 50;
        marginY = 50;
        buttonStyle(barbarianButton, marginX + 0*buttonX, marginY + 0*buttonY, buttonX, buttonY, this, textFontLarge);
        buttonStyle(mageButton, marginX + 1*buttonX, marginY + 0*buttonY, buttonX, buttonY, this, textFontLarge);
        buttonStyle(rogueButton, marginX + 2*buttonX, marginY + 0*buttonY, buttonX, buttonY, this, textFontLarge);

        exSpace = 10;
        buttonStyle(furiousButton, marginX + 0*buttonX, exSpace + marginY + 1*buttonY, buttonX, buttonY, this, textFontLarge);
        buttonStyle(frostMageButton, marginX + 0*buttonX, exSpace + marginY + 1*buttonY, buttonX, buttonY, this, textFontLarge);
        buttonStyle(assassinButton, marginX + 0*buttonX, exSpace + marginY + 1*buttonY, buttonX, buttonY, this, textFontLarge);
        buttonStyle(totemicButton, marginX + 1*buttonX, exSpace + marginY + 1*buttonY, buttonX, buttonY, this, textFontLarge);
        buttonStyle(trapperButton, marginX + 1*buttonX, exSpace + marginY + 1*buttonY, buttonX, buttonY, this, textFontLarge);
        buttonStyle(fireMageButton, marginX + 1*buttonX, exSpace + marginY + 1*buttonY, buttonX, buttonY, this, textFontLarge);
        buttonStyle(arcaneMageButton, marginX + 2*buttonX, exSpace + marginY + 1*buttonY, buttonX, buttonY, this, textFontLarge);

        panelStylo(characterPanel, 50, 150, 2*buttonX, buttonY, characterField);
        buttonStyle(characterButton, 350, 150, buttonX, buttonY, this, textFontLarge);

        panelStylo(playerPanel, 50, 200, 2*buttonX, buttonY, playerField);
        buttonStyle(playerButton, 350, 200, buttonX, buttonY, this, textFontLarge);

        marginX = 50;
        marginY = 350;
        exSpace = 10;
        panelStylo(strengthPanel, marginX + 0*sliderX, marginY, sliderX, sliderY, strengthSlider);
        buttonStyle(strengthButton, marginX + 0*sliderX, exSpace + marginY + sliderY, sliderX, buttonY, this, textFontSmall);
        sliderStylo(strengthSlider, sliderMinor, sliderMajor, sliderText);

        panelStylo(dexterityPanel, marginX + 1*sliderX, marginY, sliderX, sliderY, dexteritySlider);
        buttonStyle(dexterityButton, marginX + 1*sliderX, exSpace + marginY + sliderY, sliderX, buttonY, this, textFontSmall);
        sliderStylo(dexteritySlider, sliderMinor, sliderMajor, sliderText);

        panelStylo(constitutionPanel, marginX + 2*sliderX, marginY, sliderX, sliderY, constitutionSlider);
        buttonStyle(constitutionButton, marginX + 2*sliderX, exSpace + marginY + sliderY, sliderX, buttonY, this, textFontSmall);
        sliderStylo(constitutionSlider, sliderMinor, sliderMajor, sliderText);

        panelStylo(intelligencePanel, marginX + 3*sliderX, marginY, sliderX, sliderY, intelligenceSlider);
        buttonStyle(intelligenceButton, marginX + 3*sliderX, exSpace + marginY + sliderY, sliderX, buttonY, this, textFontSmall);
        sliderStylo(intelligenceSlider, sliderMinor, sliderMajor, sliderText);

        panelStylo(wisdomPanel, marginX + 4*sliderX, marginY, sliderX, sliderY, wisdomSlider);
        buttonStyle(wisdomButton, marginX + 4*sliderX, exSpace + marginY + sliderY, sliderX, buttonY, this, textFontSmall);
        sliderStylo(wisdomSlider, sliderMinor, sliderMajor, sliderText);

        panelStylo(charismaPanel, marginX + 5*sliderX, marginY, sliderX, sliderY, charismaSlider);
        buttonStyle(charismaButton, marginX + 5*sliderX, exSpace + marginY + sliderY, sliderX, buttonY, this, textFontSmall);
        sliderStylo(charismaSlider, sliderMinor, sliderMajor, sliderText);

        marginX = 50;
        marginY = 250;
        labelStyle(attributesLabel, marginX, marginY, 3*buttonX, buttonY, textFontLarge);
        labelStyle(totalAttributesLabel, marginX, marginY, 3*buttonX, buttonY, textFontLarge);
        panelStylo(attributesPanel, marginX, marginY, 3*buttonX, buttonY, attributesLabel);
        attributesPanel.add(totalAttributesLabel);

        marginX = 710;
        marginY = 600;
        buttonStyle(startButton, marginX + 0*buttonX, marginY + 0*buttonY, buttonX, buttonY, this, textFontLarge);
        buttonStyle(restartButton, marginX + 1*buttonX, marginY + 0*buttonY, buttonX, buttonY, this, textFontLarge);
        buttonStyle(debugButton, marginX + 1*buttonX, marginY + 1*buttonY, buttonX, buttonY, this, textFontLarge);

        restartButton.setEnabled(false);

        myFrame.getContentPane().add(startButton);
        myFrame.getContentPane().add(restartButton);
        myFrame.getContentPane().add(debugButton);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close operation
        myFrame.dispose();
        myFrame.setVisible(true); //make visible
    }

    public void labelStyle(JLabel label, int positionX, int positionY, int sizeX, int sizeY, int fontSize)
    {
        label.setFont(new Font("Impact", Font.BOLD, fontSize));
        label.setForeground(Color.BLACK);
        label.setBounds(positionX, positionY, sizeX, sizeY);
    }

    public void buttonStyle(JButton button, int positionX, int positionY, int sizeX, int sizeY, ActionListener source, int fontSize)
    {
        button.setFont(new Font("Impact", Font.BOLD, fontSize));
        button.setForeground(Color.BLACK);
        button.setBounds(positionX, positionY, sizeX, sizeY);
        button.addActionListener(source);
    }

    public void panelStylo(JPanel panel, int positionX, int positionY, int sizeX, int sizeY, Component component)
    {
        panel.setBounds(positionX, positionY, sizeX, sizeY); // position and size
        panel.setLayout(new FlowLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // set board with color
        panel.add(component);
    }

    public void sliderStylo(JSlider slider, int sliderMinor, int sliderMajor, int fontSize)
    {
        slider.setMinorTickSpacing(sliderMinor);
        slider.setMajorTickSpacing(sliderMajor);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setFont(new Font("Impact", Font.PLAIN, fontSize));
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

        openButton(characterButton);

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

    public void openField(JTextField field, JPanel panel, JButton button)
    {
        openButton(button);
        myFrame.add(panel);
        field.setEditable(true);
        field.setText("");

        myFrame.repaint();
    }

    public void closeField(JTextField field, JButton button)
    {
        field.setEditable(false);
        button.setEnabled(false);
        button.setText(button.getText().toUpperCase());

        myFrame.repaint();
    }

    public void openSlider(JSlider slider, JPanel panel, JButton button)
    {
        openButton(button);
        myFrame.add(panel);
        slider.setEnabled(true);
        slider.setValue(0);

        myFrame.repaint();
    }

    public void closeSlider(JSlider slider, JButton button)
    {
        slider.setEnabled(false);
        button.setEnabled(false);
        button.setText(button.getText().toUpperCase());

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
            System.out.println("playerName: "+playerName+"\n");
            System.out.println("attributesInt: "+totalAttributesInt);
            System.out.println("strengthInt: "+strengthInt);
            System.out.println("dexterityInt: "+dexterityInt);
            System.out.println("constitutionInt: "+constitutionInt);
            System.out.println("intelligenceInt: "+intelligenceInt);
            System.out.println("wisdomInt: "+wisdomInt);
            System.out.println("charismaInt: "+charismaInt);
        }

        if(e.getSource() == restartButton)
        {
            startButton.setText("start");
            startButton.setEnabled(true);
            restartButton.setEnabled(false);
            System.out.println("\nrestart");

            chosenClass = 0;
            chosenSubClass = 0;
            characterName = "default";
            playerName = "default";
            strengthInt = 0;
            dexterityInt = 0;
            constitutionInt = 0;
            intelligenceInt = 0;
            wisdomInt = 0;
            charismaInt = 0;

            attributesLabel.setText(String.valueOf(totalAttributesInt));

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
            myFrame.remove(characterButton);

            myFrame.remove(playerPanel);
            myFrame.remove(playerField);
            myFrame.remove(playerButton);

            myFrame.remove(attributesPanel);

            myFrame.remove(strengthPanel);
            myFrame.remove(strengthSlider);
            myFrame.remove(strengthButton);

            myFrame.remove(dexterityPanel);
            myFrame.remove(dexteritySlider);
            myFrame.remove(dexterityButton);

            myFrame.remove(constitutionPanel);
            myFrame.remove(constitutionSlider);
            myFrame.remove(constitutionButton);

            myFrame.remove(intelligencePanel);
            myFrame.remove(intelligenceSlider);
            myFrame.remove(intelligenceButton);

            myFrame.remove(wisdomPanel);
            myFrame.remove(wisdomSlider);
            myFrame.remove(wisdomButton);

            myFrame.remove(charismaPanel);
            myFrame.remove(charismaSlider);
            myFrame.remove(charismaButton);

            myFrame.add(myPanel);
            myFrame.add(projectName);
            myFrame.repaint();
            // System.exit(0);
        }

        if(e.getSource() == startButton)
        {
            startButton.setText("build");
            startButton.setEnabled(false);

            restartButton.setEnabled(true);
            System.out.println("\nstart");

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

        if(e.getSource() == characterButton)
        {
            characterName = characterField.getText().toLowerCase();
            closeField(characterField, characterButton);
            openField(playerField, playerPanel, playerButton);
        }

        if(e.getSource() == playerButton)
        {
            playerName = playerField.getText().toLowerCase();
            myFrame.add(attributesPanel);
            closeField(playerField, playerButton);
            openSlider(strengthSlider, strengthPanel, strengthButton);
        }

        if(e.getSource() == strengthButton)
        {
            strengthInt = strengthSlider.getValue();
            totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - strengthInt));
            closeSlider(strengthSlider, strengthButton);
            openSlider(dexteritySlider, dexterityPanel, dexterityButton);
        }

        if(e.getSource() == dexterityButton)
        {
            dexterityInt = dexteritySlider.getValue();
            totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - dexterityInt));
            closeSlider(dexteritySlider, dexterityButton);
            openSlider(constitutionSlider, constitutionPanel, constitutionButton);
        }

        if(e.getSource() == constitutionButton)
        {
            constitutionInt = constitutionSlider.getValue();
            totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - constitutionInt));
            closeSlider(constitutionSlider, constitutionButton);
            openSlider(intelligenceSlider, intelligencePanel, intelligenceButton);
        }

        if(e.getSource() == intelligenceButton)
        {
            intelligenceInt = intelligenceSlider.getValue();
            totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - intelligenceInt));
            closeSlider(intelligenceSlider, intelligenceButton);
            openSlider(wisdomSlider, wisdomPanel, wisdomButton);
        }

        if(e.getSource() == wisdomButton)
        {
            wisdomInt = wisdomSlider.getValue();
            totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - wisdomInt));
            closeSlider(wisdomSlider, wisdomButton);
            openSlider(charismaSlider, charismaPanel, charismaButton);
        }

        if(e.getSource() == charismaButton)
        {
            charismaInt = charismaSlider.getValue();
            totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - charismaInt));
            closeSlider(charismaSlider, charismaButton);
        }
    }

    public static void main(String[] args) {
        new GraphicInterface();
    }
}
