package utils;

import enums.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;


public class GraphicInterfaceUtil implements ActionListener, ChangeListener
{
    /**
     * *===============
     * *start variables
     * *===============
     */
    private static int chosenClass = 0;
    private static int chosenSubClass = 0;

    private static String playerName = "default";
    private static String characterName = "default";

    private static String barbarianString = "barbarian";
    private static String mageString = "mage";
    private static String rogueString = "rogue";

    private static String furiousString = "furious";
    private static String totemicString = "totemic";
    private static String frostString = "frost";
    private static String fireString = "fire";
    private static String arcaneString = "arcane";
    private static String assassinString = "assassin";
    private static String trapperString = "trapper";

    private static int barbarianClassInt = 1;
    private static int mageClassInt = 2;
    private static int rogueClassInt = 3;

    private static int furiousClassInt = 1;
    private static int totemicClassInt = 2;
    private static int frostClassInt = 1;
    private static int fireClassInt = 2;
    private static int arcaneClassInt = 3;
    private static int assassinClassInt = 1;
    private static int trapperClassInt = 2;

    private static int raceInt = 0;
    private static int eyesInt = 0;
    private static int hairInt = 0;
    private static int skinInt = 0;
    private static int sexInt = 0;

    private static int totalAttributesInt = 72;
    private static int strengthInt = 0;
    private static int dexterityInt = 0;
    private static int constitutionInt = 0;
    private static int intelligenceInt = 0;
    private static int wisdomInt = 0;
    private static int charismaInt = 0;

    /**
     * *================
     * *button positions
     * *================
     */
    private static String raceString = "choose race";
    private static int racePositionX = 510;
    private static int racePositionY = 40;
    private static int raceColumns = 3;

    private static String skinString = "choose skin";
    private static int skinPositionX = 510;
    private static int skinPositionY = 210;
    private static int skinColumns = 2;
    
    private static String eyesString = "choose eyes";
    private static int eyesPositionX = 510;
    private static int eyesPositionY = 340;
    private static int eyesColumns = 2;

    private static String hairString = "choose hair";
    private static int hairPositionX = 510;
    private static int hairPositionY = 470;
    private static int hairColumns = 2;
    
    private static String sexString = "choose sex";
    private static int sexPositionX = 810;
    private static int sexPositionY = 210;
    private static int sexColumns = 1;
    
    /**
     * *===============
     * *interface stylo
     * *===============
     */
    private static int fontSmall = 10;
    private static int fontLarge = 20;

    private static int fieldSize = 25;

    private static int labelX = 450;
    private static int labelY = 40;

    private static int buttonX = 150;
    private static int buttonY = 40;
    private static String confirmText = "confirm";

    private static int sliderX = 75;
    private static int sliderY = 220;
    private static int sliderMin = 0;
    private static int sliderMax = 15;
    private static int sliderMajor = 3;
    private static int sliderMinor = 1;
    private static int sliderText = 15;

    private static int marginX = 0;
    private static int marginY = 0;
    private static int exSpace = 0;

    /**
     * *start frame
     */
    private static JFrame myFrame = new JFrame("RPG Helper"); // frame name
    private static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // screen size
    private static Container myContainer = myFrame.getContentPane(); // get container
    private static JPanel picturePanel = new JPanel();

    /**
     * *primary buttons
     * !debug button is for developers only
     * TODO: setEnabled of debugButton to false before deploying
     */
    private static JButton debugButton = new JButton("debug"); // debug routine button
    private static JButton startButton = new JButton("start"); // starts routine button
    private static JButton restartButton = new JButton("restart"); // restarts routine button

    /**
     * *primary page
     * TODO: add main photo
     */
    private static JLabel projectName = new JLabel("RPG HELPER");
    private static JLabel projectPicture = new JLabel("");
    private static Image mainImage = new ImageIcon("RPG Git.png").getImage(); // get image
    private static ImageIcon iconImage = new ImageIcon("rpg-helper/src/images/icon.png");// get iconImage


    /**
     * *================================
     * *classButtons and subClassButtons
     * *================================
     */
    private static JPanel classPanel = new JPanel();
    private static JLabel classLabel = new JLabel("choose class");

    private static JButton barbarianButton = new JButton(barbarianString); // button to selection barbarian
    private static JButton mageButton = new JButton(mageString);
    private static JButton rogueButton = new JButton(rogueString);

    private static JButton furiousButton = new JButton(furiousString);
    private static JButton totemicButton = new JButton(totemicString);
    private static JButton frostMageButton = new JButton(frostString);
    private static JButton fireMageButton = new JButton(fireString);
    private static JButton arcaneMageButton = new JButton(arcaneString);
    private static JButton assassinButton = new JButton(assassinString);
    private static JButton trapperButton = new JButton(trapperString);

    /**
     * *===========================
     * *enumsAttributes and buttons
     * *===========================
     */
    private static JPanel racePanel = new JPanel();
    private static JLabel raceLabel = new JLabel(raceString);
    private static ArrayList<JButton> raceButtonArray = new ArrayList<>();

    private static JPanel eyesPanel = new JPanel();
    private static JLabel eyesLabel = new JLabel(eyesString);
    private static ArrayList<JButton> eyeButtonArray = new ArrayList<>();

    private static JPanel hairPanel = new JPanel();
    private static JLabel hairLabel = new JLabel(hairString);
    private static ArrayList<JButton> hairButtonArray = new ArrayList<>();

    private static JPanel sexPanel = new JPanel();
    private static JLabel sexLabel = new JLabel(sexString);
    private static ArrayList<JButton> sexButtonArray = new ArrayList<>();

    private static JPanel skinPanel = new JPanel();
    private static JLabel skinLabel = new JLabel(skinString);
    private static ArrayList<JButton> skinButtonArray = new ArrayList<>();


    /**
     * *============================
     * *characterName and playerName
     * *============================
     */
    private static JPanel namesPanel = new JPanel();
    private static JLabel namesLabel = new JLabel("write character name");
    private static JPanel characterPanel = new JPanel();
    private static JTextField characterField = new JTextField(fieldSize);
    private static JButton characterButton = new JButton(confirmText);

    private static JPanel playerPanel = new JPanel();
    private static JTextField playerField = new JTextField(fieldSize);
    private static JButton playerButton = new JButton(confirmText);


    /**
     * *=====================================
     * *attributesTotal and attributesSliders
     * *=====================================
     */
    private static JPanel attributesPanel = new JPanel();
    private static JLabel attributesLabel = new JLabel("attributes points left");
    private static JLabel atualAttributesLabel = new JLabel("set strength: ");
    private static JLabel totalAttributesLabel = new JLabel(String.valueOf(totalAttributesInt));

    private static JPanel strengthCountPanel = new JPanel();
    private static JLabel strengthCountLabel = new JLabel(String.valueOf(strengthInt));
    private static JPanel strengthPanel = new JPanel();
    private static JSlider strengthSlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton strengthButton = new JButton(confirmText);

    private static JPanel dexterityCountPanel = new JPanel();
    private static JLabel dexterityCountLabel = new JLabel(String.valueOf(dexterityInt));
    private static JPanel dexterityPanel = new JPanel();
    private static JSlider dexteritySlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton dexterityButton = new JButton(confirmText);

    private static JPanel constitutionCountPanel = new JPanel();
    private static JLabel constitutionCountLabel = new JLabel(String.valueOf(constitutionInt));
    private static JPanel constitutionPanel = new JPanel();
    private static JSlider constitutionSlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton constitutionButton = new JButton(confirmText);

    private static JPanel intelligenceCountPanel = new JPanel();
    private static JLabel intelligenceCountLabel = new JLabel(String.valueOf(intelligenceInt));
    private static JPanel intelligencePanel = new JPanel();
    private static JSlider intelligenceSlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton intelligenceButton = new JButton(confirmText);

    private static JPanel wisdomCountPanel = new JPanel();
    private static JLabel wisdomCountLabel = new JLabel(String.valueOf(wisdomInt));
    private static JPanel wisdomPanel = new JPanel();
    private static JSlider wisdomSlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton wisdomButton = new JButton(confirmText);

    private static JPanel charismaCountPanel = new JPanel();
    private static JLabel charismaCountLabel = new JLabel(String.valueOf(charismaInt));
    private static JPanel charismaPanel = new JPanel();
    private static JSlider charismaSlider = new JSlider(JSlider.VERTICAL, sliderMin, sliderMax, sliderMin);
    private static JButton charismaButton = new JButton(confirmText);

    GraphicInterfaceUtil() 
    {
        /**
         * *create myFrame
         */
        myFrame.setSize(1080, 720); // size of frame
        myFrame.setLayout(null); // no layout
        myFrame.getContentPane().setBackground(new Color(96, 85, 91)); // set color
        myFrame.setLocation((dim.width - myFrame.getWidth()) / 2, (dim.height - myFrame.getHeight()) / 2); // center
        myFrame.setIconImage(iconImage.getImage()); //change icon of frame

        /**
         * *create myContainer
         */
        myContainer.setLayout(null); // set layout
        myContainer.setBackground(new Color(96, 85, 91)); // set color

        /**
         * *create picturePanel
         */
        picturePanel.setBounds(50, 50, 960, 450); // position and size
        picturePanel.setLayout(null);
        myContainer.add(picturePanel);

        /**
         * *create projectImage
         */
        mainImage = mainImage.getScaledInstance(960, 450, java.awt.Image.SCALE_AREA_AVERAGING); // transform it
        projectPicture.setIcon(new ImageIcon(mainImage)); // load image
        projectPicture.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // set board with color
        projectPicture.setBounds(0, 0, 960, 450); // width height
        picturePanel.add(projectPicture);

        /**
         * *create projectName
         */
        projectName.setFont(new Font("Impact", Font.BOLD, 60));
        projectName.setForeground(Color.BLACK);
        projectName.setBounds(50, 560, 500, 50);
        myFrame.add(projectName);

        /**
         * *================================
         * *classButtons and subClassButtons
         * *================================
         */

        marginX = 50;
        marginY = 40;
        labelStyle(classLabel, marginX, marginY, labelX, labelY, fontLarge);
        panelStyle(classPanel, marginX, marginY, labelX, labelY, classLabel);

        marginX = 50;
        marginY += buttonY;
        buttonStyle(barbarianButton, marginX, marginY, buttonX, buttonY, this, fontLarge);
        marginX +=buttonX;
        buttonStyle(mageButton, marginX, marginY, buttonX, buttonY, this, fontLarge);
        marginX +=buttonX;
        buttonStyle(rogueButton, marginX, marginY, buttonX, buttonY, this, fontLarge);

        marginX = 50;
        marginY += buttonY;
        buttonStyle(furiousButton, marginX, marginY, buttonX, buttonY, this, fontLarge);
        buttonStyle(frostMageButton, marginX, marginY, buttonX, buttonY, this, fontLarge);
        buttonStyle(assassinButton, marginX, marginY, buttonX, buttonY, this, fontLarge);
        marginX += buttonX;
        buttonStyle(totemicButton, marginX, marginY, buttonX, buttonY, this, fontLarge);
        buttonStyle(trapperButton, marginX, marginY, buttonX, buttonY, this, fontLarge);
        buttonStyle(fireMageButton, marginX, marginY, buttonX, buttonY, this, fontLarge);
        marginX += buttonX;
        buttonStyle(arcaneMageButton, marginX, marginY, buttonX, buttonY, this, fontLarge);

        /**
         * *=============================
         * *characterPanel and playerName
         * *=============================
         */
        marginX = 50;
        marginY = 170;
        labelStyle(namesLabel, marginX, marginY, labelX, labelY, fontLarge);
        panelStyle(namesPanel, marginX, marginY, labelX, labelY, namesLabel);

        marginY += labelY;
        panelStyle(characterPanel, marginX, marginY, 2 * buttonX, buttonY, characterField);
        buttonStyle(characterButton, marginX + 2 * buttonX, marginY, buttonX, buttonY, this, fontLarge);

        marginY += buttonY;
        panelStyle(playerPanel, marginX, marginY, 2 * buttonX, buttonY, playerField);
        buttonStyle(playerButton, marginX + 2 * buttonX, marginY, buttonX, buttonY, this, fontLarge);

        /**
         * *==================================================
         * *populate static array with enum values dynamically
         * *==================================================
         */
        EnumSet.allOf(Race.class).forEach(race -> raceButtonArray.add(new JButton(race.name().toLowerCase())));
        EnumSet.allOf(Hair.class).forEach(hair -> hairButtonArray.add(new JButton(hair.name().toLowerCase())));
        EnumSet.allOf(Eyes.class).forEach(eyes -> eyeButtonArray.add(new JButton(eyes.name().toLowerCase())));
        EnumSet.allOf(Sex.class).forEach(sex -> sexButtonArray.add(new JButton(sex.name().toLowerCase())));
        EnumSet.allOf(Skin.class).forEach(skin -> skinButtonArray.add(new JButton(skin.name().toLowerCase())));

        /**
         * *=====================================
         * *Person attributes and enums
         * *=====================================
         */
        labelStyle(raceLabel, racePositionX, racePositionY, labelX, labelY, fontLarge);
        panelStyle(racePanel, racePositionX, racePositionY, labelX, labelY, raceLabel);
        myFrame.revalidate();

        labelStyle(skinLabel, skinPositionX, skinPositionY, labelX - buttonX, labelY, fontLarge);
        panelStyle(skinPanel, skinPositionX, skinPositionY, labelX - buttonX, labelY, skinLabel);
        myFrame.revalidate();

        labelStyle(eyesLabel, eyesPositionX, eyesPositionY, labelX - buttonX, labelY, fontLarge);
        panelStyle(eyesPanel, eyesPositionX, eyesPositionY, labelX - buttonX, labelY, eyesLabel);
        myFrame.revalidate();

        labelStyle(hairLabel, hairPositionX, hairPositionY, labelX - buttonX, labelY, fontLarge);
        panelStyle(hairPanel, hairPositionX, hairPositionY, labelX - buttonX, labelY, hairLabel);
        myFrame.revalidate();

        labelStyle(sexLabel, sexPositionX, sexPositionY, buttonX, labelY, fontLarge);
        panelStyle(sexPanel, sexPositionX, sexPositionY, buttonX, labelY, sexLabel);
        myFrame.revalidate();


        /**
         * *=====================================
         * *attributesTotal and attributesSliders
         * *=====================================
         */
        marginX = 50;
        marginY = 300;
        labelStyle(attributesLabel, marginX, marginY, labelX, labelY, fontLarge);
        labelStyle(atualAttributesLabel, marginX, marginY, labelX, labelY, fontLarge);
        labelStyle(totalAttributesLabel, marginX, marginY, labelX, buttonY, fontLarge);
        attributesPanel.add(atualAttributesLabel);
        attributesPanel.add(totalAttributesLabel);
        panelStyle(attributesPanel, marginX, marginY, 3 * buttonX, buttonY, attributesLabel);

        marginY += 2 * buttonY;
        panelStyle(strengthCountPanel, marginX, marginY - buttonY, sliderX, buttonY, strengthCountLabel);
        labelStyle(strengthCountLabel, marginX, marginY - buttonY, sliderX, buttonY, fontLarge);
        panelStyle(strengthPanel, marginX, marginY, sliderX, sliderY, strengthSlider);
        buttonStyle(strengthButton, marginX, marginY + sliderY, sliderX, buttonY, this, fontSmall);
        sliderStylo(strengthSlider, sliderMinor, sliderMajor, sliderText);
        strengthSlider.addChangeListener((ChangeListener) this);

        marginX += sliderX;
        panelStyle(dexterityCountPanel, marginX, marginY - buttonY, sliderX, buttonY, dexterityCountLabel);
        labelStyle(dexterityCountLabel, marginX, marginY - buttonY, sliderX, buttonY, fontLarge);
        panelStyle(dexterityPanel, marginX, marginY, sliderX, sliderY, dexteritySlider);
        buttonStyle(dexterityButton, marginX, marginY + sliderY, sliderX, buttonY, this, fontSmall);
        sliderStylo(dexteritySlider, sliderMinor, sliderMajor, sliderText);
        dexteritySlider.addChangeListener((ChangeListener) this);

        marginX += sliderX;
        panelStyle(constitutionCountPanel, marginX, marginY - buttonY, sliderX, buttonY, constitutionCountLabel);
        labelStyle(constitutionCountLabel, marginX, marginY - buttonY, sliderX, buttonY, fontLarge);
        panelStyle(constitutionPanel, marginX, marginY, sliderX, sliderY, constitutionSlider);
        buttonStyle(constitutionButton, marginX, marginY + sliderY, sliderX, buttonY, this, fontSmall);
        sliderStylo(constitutionSlider, sliderMinor, sliderMajor, sliderText);
        constitutionSlider.addChangeListener((ChangeListener) this);

        marginX += sliderX;
        panelStyle(intelligenceCountPanel, marginX, marginY - buttonY, sliderX, buttonY, intelligenceCountLabel);
        labelStyle(intelligenceCountLabel, marginX, marginY - buttonY, sliderX, buttonY, fontLarge);
        panelStyle(intelligencePanel, marginX, marginY, sliderX, sliderY, intelligenceSlider);
        buttonStyle(intelligenceButton, marginX, marginY + sliderY, sliderX, buttonY, this, fontSmall);
        sliderStylo(intelligenceSlider, sliderMinor, sliderMajor, sliderText);
        intelligenceSlider.addChangeListener((ChangeListener) this);

        marginX += sliderX;
        panelStyle(wisdomCountPanel, marginX, marginY - buttonY, sliderX, buttonY, wisdomCountLabel);
        labelStyle(wisdomCountLabel, marginX, marginY - buttonY, sliderX, buttonY, fontLarge);
        panelStyle(wisdomPanel, marginX, marginY, sliderX, sliderY, wisdomSlider);
        buttonStyle(wisdomButton, marginX, marginY + sliderY, sliderX, buttonY, this, fontSmall);
        sliderStylo(wisdomSlider, sliderMinor, sliderMajor, sliderText);
        wisdomSlider.addChangeListener((ChangeListener) this);

        marginX += sliderX;
        panelStyle(charismaCountPanel, marginX, marginY - buttonY, sliderX, buttonY, charismaCountLabel);
        labelStyle(charismaCountLabel, marginX, marginY - buttonY, sliderX, buttonY, fontLarge);
        panelStyle(charismaPanel, marginX, marginY, sliderX, sliderY, charismaSlider);
        buttonStyle(charismaButton, marginX, marginY + sliderY, sliderX, buttonY, this, fontSmall);
        sliderStylo(charismaSlider, sliderMinor, sliderMajor, sliderText);
        charismaSlider.addChangeListener((ChangeListener) this);


        /**
         * *===========
         * *mainButtons
         * *===========
         */
        marginX = 860;
        marginY = 520;
        buttonStyle(startButton, marginX, marginY, buttonX, buttonY, this, fontLarge);
        marginY += buttonY;
        buttonStyle(restartButton, marginX, marginY, buttonX, buttonY, this, fontLarge);
        marginY += buttonY;
        buttonStyle(debugButton, marginX, marginY, buttonX, buttonY, this, fontLarge);

        /**
         * *starting and adding mainButtons
         */
        restartButton.setEnabled(false);
        myFrame.getContentPane().add(startButton);
        myFrame.getContentPane().add(restartButton);
        myFrame.getContentPane().add(debugButton);

        /**
         * *finish myFrame
         */
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close operation
        myFrame.dispose();
        myFrame.setVisible(true); // make visible
    }

    /**
     * *=================
     * *passiveComponents
     * *=================
     */
    /**
     * *generic pattern for labels
     * @param label 
     * @param positionX
     * @param positionY
     * @param sizeX
     * @param sizeY
     * @param fontSize
     */
    public void labelStyle(JLabel label, int positionX, int positionY, int sizeX, int sizeY, int fontSize) {
        label.setFont(new Font("Impact", Font.BOLD, fontSize));
        label.setForeground(Color.BLACK);
        label.setBounds(positionX, positionY, sizeX, sizeY);
    }

    /**
     * *generic pattern for panels anding a component
     * ?remove add component?
     * @param panel
     * @param positionX
     * @param positionY
     * @param sizeX
     * @param sizeY
     * @param component
     */
    public void panelStyle(JPanel panel, int positionX, int positionY, int sizeX, int sizeY, Component component) {
        panel.setBounds(positionX, positionY, sizeX, sizeY); // position and size
        panel.setLayout(new FlowLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // set board with color
        panel.add(component);
    }

    /**
     * *================
     * *activeComponents
     * *================
     */
    /**
     * *generic pattern for buttons adding an ActionListener
     * @param button
     * @param positionX
     * @param positionY
     * @param sizeX
     * @param sizeY
     * @param source
     * @param fontSize
     */    
    public void buttonStyle(JButton button, int positionX, int positionY, int sizeX, int sizeY, ActionListener source,
            int fontSize) {
        button.setFont(new Font("Impact", Font.BOLD, fontSize));
        button.setForeground(Color.BLACK);
        button.setBounds(positionX, positionY, sizeX, sizeY);
        button.addActionListener(source);
    }

    /**
     * *generic pattern for sliders
     * @param slider
     * @param sliderMinor
     * @param sliderMajor
     * @param fontSize
     */
    public void sliderStylo(JSlider slider, int sliderMinor, int sliderMajor, int fontSize) {
        slider.setMinorTickSpacing(sliderMinor);
        slider.setMajorTickSpacing(sliderMajor);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setFont(new Font("Impact", Font.PLAIN, fontSize));
    }

    /**
     * *closes a classButton: desired button text is upper and the other classes are disabled
     * @param classButton
     */
    public void closeClassButton(JButton classButton) {
        classButton.setText(classButton.getText().toUpperCase());

        classLabel.setText("choose subClass");

        barbarianButton.setEnabled(false);
        mageButton.setEnabled(false);
        rogueButton.setEnabled(false);

        myFrame.repaint();
    }

    /**
     * *closes the subClassesButtons: desired button text is upper and the other classes are disabled
     * !when class has les than three subClass, repeat one subClass as parameter
     * @param subClassButton
     * @param subClass1
     * @param subClass2
     */
    public void closeSubClassButton(JButton subClassButton, JButton subClass1, JButton subClass2) {
        subClassButton.setText(subClassButton.getText().toUpperCase());

        subClassButton.setEnabled(false);
        subClass1.setEnabled(false);
        subClass2.setEnabled(false);

        /**
         * *all subClassButtons open the characterButton and characterField
         */
        openButton(characterButton);

        classLabel.setText("class and subClass");

        myFrame.add(characterPanel);
        myFrame.add(namesPanel);
        characterField.setEditable(true);
        characterField.setText("");
        characterPanel.setEnabled(true);

        myFrame.repaint();
    }

    /**
     * *starts a button: make it enabled and lower its text
     * @param button
     */
    public void openButton(JButton button) {
        myFrame.add(button);
        button.setEnabled(true);
        button.setText(button.getText().toLowerCase());

        myFrame.repaint();
    }

    /**
     * buttons are used for confirmation. when it is pressed it is disabled
     * *close a button: make it disable and upper its text
     * @param button
     */
    public void closeButton(JButton button)
    {
        button.setEnabled(false);
        button.setText(button.getText().toUpperCase());
    }

    /**
     * text fields are associated with confirmation buttons. when the button and the text
     * field need to be showed in the screen both will be opened
     * *starts a field: make it editable and remove its text
     * *starts a button: make it enable
     * @param field
     * @param panel
     * @param button
     */
    public void openField(JTextField field, JPanel panel, JButton button) {
        openButton(button);
        myFrame.add(panel);
        field.setEditable(true);
        field.setText("");

        myFrame.repaint();
    }

    /**
     * text fields are associated with confirmation buttons. when the button is pressed
     * this method is called, then the field and the buttom will be closed
     * *close a field: make it noneditable
     * *close a button: make it disable and its text upper
     * @param field
     * @param button
     */
    public void closeField(JTextField field, JButton button) {
        field.setEditable(false);
        closeButton(button);

        myFrame.repaint();
    }

    /**
     * *open a slider: make it enable, set its value to zero and add to the main frame
     * @param slider
     * @param panel
     * @param button
     */
    public void openSlider(JSlider slider, JPanel panel, JButton button) {
        openButton(button);
        myFrame.add(panel);
        slider.setEnabled(true);
        slider.setValue(0);

        myFrame.repaint();
    }

    /**
     * *close a slider: mate it disable and close button
     * @param slider
     * @param button
     */
    public void closeSlider(JSlider slider, JButton button) {
        slider.setEnabled(false);
        closeButton(button);

        myFrame.repaint();
    }

    public boolean valideAttribute(int value)
    {
        if(Integer.parseInt(totalAttributesLabel.getText()) >= value)
            return true;

        JOptionPane.showMessageDialog(myFrame, "insert a valide value\nbelow "+ totalAttributesLabel.getText());
        return false;
    }

    public void addButtonArray(ArrayList<JButton> arrayList,int marginX,int marginY, int sizeX)
    {
        int originalMarginX = marginX;
        int counter = 1;

        for(JButton j : arrayList)
        {
            buttonStyle(j,marginX,marginY,buttonX,buttonY,this,fontLarge);
            myFrame.add(j);
            j.setText(j.getText().toLowerCase());
            j.setEnabled(true);

            marginX += buttonX;

            if(counter%sizeX==0)
            {
                marginY+= buttonY;
                marginX = originalMarginX;
            }
            counter++;
        }
    }

    /**
     * *receve changes in the frame
     * @param e
     */
    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == strengthSlider) {
            strengthCountLabel.setText(String.valueOf(strengthSlider.getValue()));
        }

        if (e.getSource() == dexteritySlider) {
            dexterityCountLabel.setText(String.valueOf(dexteritySlider.getValue()));
        }

        if (e.getSource() == constitutionSlider) {
            constitutionCountLabel.setText(String.valueOf(constitutionSlider.getValue()));
        }

        if (e.getSource() == intelligenceSlider) {
            intelligenceCountLabel.setText(String.valueOf(intelligenceSlider.getValue()));
        }

        if (e.getSource() == wisdomSlider) {
            wisdomCountLabel.setText(String.valueOf(wisdomSlider.getValue()));
        }

        if (e.getSource() == charismaSlider) {
            charismaCountLabel.setText(String.valueOf(charismaSlider.getValue()));
        }
    }

    /**
     * *receve actions in the frame
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * *shows all program variables to see if it is working
         * !all new variables must be add here
         */
        if (e.getSource() == debugButton) {
            System.out.println("\n===============debug===============");
            System.out.println("chosenClass: " + chosenClass);
            System.out.println("chosenSubClass: " + chosenSubClass);
            System.out.println("characterName: " + characterName);
            System.out.println("playerName: " + playerName + "\n");
            System.out.println("raceInt: " + raceInt);
            System.out.println("eyesInt: " + eyesInt);
            System.out.println("sexInt: " + sexInt);
            System.out.println("skinInt: " + skinInt);
            System.out.println("hairInt: " + hairInt+"\n");
            System.out.println("attributesInt: " + totalAttributesInt);
            System.out.println("strengthInt: " + strengthInt);
            System.out.println("dexterityInt: " + dexterityInt);
            System.out.println("constitutionInt: " + constitutionInt);
            System.out.println("intelligenceInt: " + intelligenceInt);
            System.out.println("wisdomInt: " + wisdomInt);
            System.out.println("charismaInt: " + charismaInt);
        }

        /**
         * *restart all the variables and the frame
         * !all variables and components must be add here
         */
        if (e.getSource() == restartButton) {
            startButton.setText("start");
            startButton.setEnabled(true);
            restartButton.setEnabled(false);
            System.out.println("\nrestart");

            chosenClass = 0;
            chosenSubClass = 0;
            characterName = "default";
            playerName = "default";
            raceInt = 0;
            eyesInt = 0;
            sexInt = 0;
            skinInt = 0;
            hairInt = 0;
            strengthInt = 0;
            dexterityInt = 0;
            constitutionInt = 0;
            intelligenceInt = 0;
            wisdomInt = 0;
            charismaInt = 0;

            totalAttributesLabel.setText(String.valueOf(totalAttributesInt));

            myFrame.remove(classPanel);

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

            myFrame.remove(namesPanel);

            myFrame.remove(characterPanel);
            myFrame.remove(characterField);
            myFrame.remove(characterButton);

            myFrame.remove(playerPanel);
            myFrame.remove(playerField);
            myFrame.remove(playerButton);

            myFrame.remove(attributesPanel);

            myFrame.remove(strengthCountPanel);
            myFrame.remove(strengthPanel);
            myFrame.remove(strengthSlider);
            myFrame.remove(strengthButton);

            for (JButton j:raceButtonArray)
            {
                myFrame.remove(j);
            }
            myFrame.remove(racePanel);

            for (JButton j:hairButtonArray)
            {
                myFrame.remove(j);
            }
            myFrame.remove(hairPanel);

            for (JButton j:eyeButtonArray)
            {
                myFrame.remove(j);
            }
            myFrame.remove(eyesPanel);

            for (JButton j:skinButtonArray)
            {
                myFrame.remove(j);
            }
            myFrame.remove(skinPanel);

            for (JButton j:sexButtonArray)
            {
                myFrame.remove(j);
            }
            myFrame.remove(sexPanel);

            myFrame.remove(dexterityCountPanel);
            myFrame.remove(dexterityPanel);
            myFrame.remove(dexteritySlider);
            myFrame.remove(dexterityButton);

            myFrame.remove(constitutionCountPanel);
            myFrame.remove(constitutionPanel);
            myFrame.remove(constitutionSlider);
            myFrame.remove(constitutionButton);

            myFrame.remove(intelligenceCountPanel);
            myFrame.remove(intelligencePanel);
            myFrame.remove(intelligenceSlider);
            myFrame.remove(intelligenceButton);

            myFrame.remove(wisdomCountPanel);
            myFrame.remove(wisdomPanel);
            myFrame.remove(wisdomSlider);
            myFrame.remove(wisdomButton);

            myFrame.remove(charismaCountPanel);
            myFrame.remove(charismaPanel);
            myFrame.remove(charismaSlider);
            myFrame.remove(charismaButton);

            myFrame.add(picturePanel);
            myFrame.add(projectName);
            myFrame.repaint();
            // System.exit(0);
        }

        /**
         * *starts the operation
         * !all operations are sequaciously, so when any starts the last need to be finished
         */
        if (e.getSource() == startButton) {
            startButton.setText("build");
            startButton.setEnabled(false);

            restartButton.setEnabled(true);
            System.out.println("\nstart");

            myFrame.remove(picturePanel);
            myFrame.remove(projectName);

            myFrame.add(classPanel);
            openButton(barbarianButton);
            openButton(mageButton);
            openButton(rogueButton);

            myFrame.repaint();
        }

        /**
         * *====================
         * *classButtons actions
         * *====================
         */
        if (e.getSource() == barbarianButton) {
            chosenClass = barbarianClassInt;
            closeClassButton(barbarianButton);

            openButton(furiousButton);
            openButton(totemicButton);
        }

        if (e.getSource() == mageButton) {
            chosenClass = mageClassInt;
            closeClassButton(mageButton);

            openButton(frostMageButton);
            openButton(fireMageButton);
            openButton(arcaneMageButton);
        }

        if (e.getSource() == rogueButton) {
            chosenClass = rogueClassInt;
            closeClassButton(rogueButton);

            openButton(assassinButton);
            openButton(trapperButton);
        }

        /**
         * *=======================
         * *subClassButtons actions
         * *=======================
         */
        if (e.getSource() == furiousButton) {
            chosenSubClass = furiousClassInt;
            closeSubClassButton(furiousButton, furiousButton, totemicButton);
        }

        if (e.getSource() == totemicButton) {
            chosenSubClass = totemicClassInt;
            closeSubClassButton(totemicButton, furiousButton, totemicButton);
        }

        if (e.getSource() == frostMageButton) {
            chosenSubClass = frostClassInt;
            closeSubClassButton(frostMageButton, fireMageButton, arcaneMageButton);
        }

        if (e.getSource() == fireMageButton) {
            chosenSubClass = fireClassInt;
            closeSubClassButton(fireMageButton, frostMageButton, arcaneMageButton);
        }

        if (e.getSource() == arcaneMageButton) {
            chosenSubClass = arcaneClassInt;
            closeSubClassButton(arcaneMageButton, frostMageButton, fireMageButton);
        }

        if (e.getSource() == assassinButton) {
            chosenSubClass = assassinClassInt;
            closeSubClassButton(assassinButton, trapperButton, assassinButton);
        }

        if (e.getSource() == trapperButton) {
            chosenSubClass = trapperClassInt;
            closeSubClassButton(trapperButton, trapperButton, assassinButton);
        }

        /**
         * *characterButton action
         */
        if (e.getSource() == characterButton) {
            characterName = characterField.getText().toLowerCase();
            closeField(characterField, characterButton);
            openField(playerField, playerPanel, playerButton);

            namesLabel.setText("write player name");
        }

        /**
         * *playerButton action
         */
        if (e.getSource() == playerButton) {
            playerName = playerField.getText().toLowerCase();
            closeField(playerField, playerButton);

            namesLabel.setText("character and player");


            myFrame.add(racePanel);
            addButtonArray(raceButtonArray, racePositionX, racePositionY + buttonY, raceColumns);

        }
        /**
         * *========================
         * *enums raceButton actions
         * *========================
         */
        if(raceButtonArray.contains(e.getSource())){
            int count = 0;
            for(JButton j : raceButtonArray)
            {
                if(e.getSource() == j)
                {
                    raceInt = count;
                    j.setText(j.getText().toUpperCase());
                    strengthInt = Race.values()[raceInt].getStrenght();
                    dexterityInt = Race.values()[raceInt].getDexterity();
                    constitutionInt = Race.values()[raceInt].getConstitution();
                    intelligenceInt = Race.values()[raceInt].getIntelligence();
                    wisdomInt = Race.values()[raceInt].getWisdom();
                    charismaInt = Race.values()[raceInt].getCharisma();
                }
                count++;
                j.setEnabled(false);
            }

            myFrame.add(skinPanel);
            addButtonArray(skinButtonArray, skinPositionX, skinPositionY + buttonY, skinColumns);
            myFrame.repaint();
            myFrame.revalidate();
        }

        if(skinButtonArray.contains(e.getSource())){
            int count = 0;
            for(JButton j : skinButtonArray)
            {
                if(e.getSource() == j)
                {
                    skinInt = count;
                    j.setText(j.getText().toUpperCase());
                }
                count++;
                j.setEnabled(false);
            }
            myFrame.add(eyesPanel);
            addButtonArray(eyeButtonArray, eyesPositionX, eyesPositionY + buttonY, eyesColumns);
            myFrame.repaint();
            myFrame.revalidate();
        }

        if(eyeButtonArray.contains(e.getSource())){
            int count = 0;
            for(JButton j : eyeButtonArray)
            {
                if(e.getSource() == j)
                {
                    eyesInt = count;
                    j.setText(j.getText().toUpperCase());
                }
                count++;
                j.setEnabled(false);
            }
            myFrame.add(hairPanel);
            addButtonArray(hairButtonArray, hairPositionX, hairPositionY + buttonY, hairColumns);
            myFrame.repaint();
            myFrame.revalidate();
        }

        if(hairButtonArray.contains(e.getSource())){
            int count = 0;
            for(JButton j : hairButtonArray)
            {
                if(e.getSource() == j)
                {
                    hairInt = count;
                    j.setText(j.getText().toUpperCase());
                }
                count++;
                j.setEnabled(false);
            }
            myFrame.add(sexPanel);
            addButtonArray(sexButtonArray, sexPositionX, sexPositionY + buttonY, sexColumns);
            myFrame.repaint();
            myFrame.revalidate();
        }

        if(sexButtonArray.contains(e.getSource())){
            int count = 0;
            for(JButton j : sexButtonArray){
                if(e.getSource() == j)
                {
                    sexInt = count;
                    j.setText(j.getText().toUpperCase());
                }
                count++;
                j.setEnabled(false);
            }
            atualAttributesLabel.setText("set strength: ");
            openSlider(strengthSlider, strengthPanel, strengthButton);
            myFrame.add(attributesPanel);
            myFrame.add(strengthCountPanel);
            myFrame.repaint();
            myFrame.revalidate();
        }

        /**
         * *=========================
         * *attributesButtons actions
         * *=========================
         */
        if (e.getSource() == strengthButton) {
            strengthInt += strengthSlider.getValue();

            if(valideAttribute(strengthInt))
            {
                atualAttributesLabel.setText("set dexterity: ");
                totalAttributesLabel
                        .setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - strengthSlider.getValue()));
                closeSlider(strengthSlider, strengthButton);
                openSlider(dexteritySlider, dexterityPanel, dexterityButton);
                myFrame.add(dexterityCountPanel);
            }
        }

        if (e.getSource() == dexterityButton) {
            dexterityInt += dexteritySlider.getValue();

            if(valideAttribute(dexterityInt)){
                atualAttributesLabel.setText("set constitution: ");
                totalAttributesLabel
                        .setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - dexteritySlider.getValue()));
                closeSlider(dexteritySlider, dexterityButton);
                openSlider(constitutionSlider, constitutionPanel, constitutionButton);
                myFrame.add(constitutionCountPanel);
            }
        }

        if (e.getSource() == constitutionButton) {
            constitutionInt += constitutionSlider.getValue();

            if(valideAttribute(constitutionInt))
            {
                atualAttributesLabel.setText("set intelligence: ");
                totalAttributesLabel
                        .setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - constitutionSlider.getValue()));
                closeSlider(constitutionSlider, constitutionButton);
                openSlider(intelligenceSlider, intelligencePanel, intelligenceButton);
                myFrame.add(intelligenceCountPanel);
            }
        }

        if (e.getSource() == intelligenceButton) {
            intelligenceInt += intelligenceSlider.getValue();

            if(valideAttribute(intelligenceInt))
            {
                atualAttributesLabel.setText("set wisdom: ");
                totalAttributesLabel
                        .setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - intelligenceSlider.getValue()));
                closeSlider(intelligenceSlider, intelligenceButton);
                openSlider(wisdomSlider, wisdomPanel, wisdomButton);
                myFrame.add(wisdomCountPanel);
            }
        }

        if (e.getSource() == wisdomButton) {
            wisdomInt += wisdomSlider.getValue();

            if(valideAttribute(wisdomInt))
            {
                atualAttributesLabel.setText("set charisma: ");
                totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - wisdomSlider.getValue()));
                closeSlider(wisdomSlider, wisdomButton);
                openSlider(charismaSlider, charismaPanel, charismaButton);
                myFrame.add(charismaCountPanel);
            }
        }

        if (e.getSource() == charismaButton) {
            charismaInt += charismaSlider.getValue();

            if(valideAttribute(charismaInt))
            {
                atualAttributesLabel.setText("");
                totalAttributesLabel
                        .setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - charismaSlider.getValue()));
                closeSlider(charismaSlider, charismaButton);
            }
        }
    }

    public static void main(String[] args) {

        new GraphicInterfaceUtil();
    }
}