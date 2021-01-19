package utils;

import enums.*;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.security.KeyStore.Entry.Attribute;
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
    private static int totalAdventurersInt = 0; 
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

    private static int heightInt = 0;
    private static int weightInt = 0;

    private static int totalAttributesInt = 72;
    private static int strengthInt = 0;
    private static int dexterityInt = 0;
    private static int constitutionInt = 0;
    private static int intelligenceInt = 0;
    private static int wisdomInt = 0;
    private static int charismaInt = 0;


    /**
     * *===============
     * *interface stylo
     * *===============
     */
    private static String projectNameString = "RPG HELPER";
    private static String mainImageString = "rpg-helper/src/images/rpg0.png";
    private static String iconImageString = "rpg-helper/src/images/icon.png";

    private static Color backgroundColor = new Color(96, 85, 91);
    private static int myFrameWidth = 1080;
    private static int myFrameHeight = 720;

    private static int mainPictureWidth = 960;
    private static int mainPictureHeight = 450;
    private static int picturePanelX = 50;
    private static int picturePanelY = 50;

    private static int projectNameWidth = 500;
    private static int projectNameHeight = 50;
    private static int projectNameX = 50;
    private static int projectNameY = 560;

    private static String defaultFont = "Impact";
    private static int fontSmall = 10;
    private static int fontMedium = 15;
    private static int fontLarge = 20;
    private static int fontHuge = 60;
    private static int fontStyle = Font.BOLD;

    private static int fieldSize = 25;

    private static int panelX = 450;
    private static int panelY = 40;

    private static int labelX = panelX;
    private static int labelY = panelY;

    private static int buttonX = 150;
    private static int buttonY = 40;
    private static String confirmText = "confirm";


    /**
     * *================
     * *button positions
     * *================
     */
    
    private static String startButtonString = "start";
    private static String buildButtonString = "build";
    private static int startButtonX = 710;
    private static int startButtonY = 600;
    
    private static String restartButtonString = "restart";
    private static int restartButtonX = startButtonX + buttonX;
    private static int restartButtonY = startButtonY;
    
    private static String debugButtonString = "debug";
    private static int debugButtonX = restartButtonX;
    private static int debugButtonY = restartButtonY + buttonY;


    private static String classChooseString = "choose class";
    private static int classPanelX = 50;
    private static int classPanelY = 40;
    private static int classesPanelY = classPanelY + buttonY;
    private static int subClassesPanelY = classesPanelY + buttonY;

    private static String classCloseString = "class and subClass";
    private static int barbarianButtonX = classPanelX;
    private static int barbarianButtonY = classesPanelY;
    private static int mageButtonX = barbarianButtonX + buttonX;
    private static int mageButtonY = classesPanelY;
    private static int rogueButtonX = mageButtonX + buttonX;
    private static int rogueButtonY = classesPanelY;

    private static String subClassString = "choose subClass";
    private static int furiousButtonX = classPanelX;
    private static int furiousButtonY = subClassesPanelY;
    private static int totemicButtonX = furiousButtonX + buttonX;
    private static int totemicButtonY = subClassesPanelY;

    private static int frostMageButtonX = classPanelX;
    private static int frostMageButtonY = subClassesPanelY;
    private static int fireMageButtonX = frostMageButtonX + buttonX;
    private static int fireMageButtonY = subClassesPanelY;
    private static int arcaneMageButtonX = fireMageButtonX + buttonX;
    private static int arcaneMageButtonY = subClassesPanelY;

    private static int assassinButtonX = classPanelX;
    private static int assassinButtonY = subClassesPanelY;
    private static int trapperButtonX = assassinButtonX + buttonX;
    private static int trapperButtonY = subClassesPanelY;


    private static String nameCloseString = "character and player";
    private static int namesPanelX = 50;
    private static int namesPanelY = 170;

    private static String playerString = "write player name";
    private static int characterPanelX = namesPanelX;
    private static int characterPanelY = namesPanelY + labelY;

    private static String characterString = "write character name";
    private static int playerPanelX = namesPanelX;
    private static int playerPanelY = characterPanelY + labelY;


    private static String raceStartString = "choose race";
    private static String raceCloseString = "chosen race";
    private static int raceLabelX = 560;
    private static int raceLabelY = 40;
    private static int raceButtonX = raceLabelX;
    private static int raceButtonY = raceLabelY + buttonY;
    private static int raceColumns = 3;

    private static String skinStartString = "choose skin";
    private static String skinCloseString = "chosen skin";
    private static int skinLabelX = 710;
    private static int skinLabelY = 210;
    private static int skinButtonX = skinLabelX;
    private static int skinButtonY = skinLabelY + buttonY;
    private static int skinColumns = 2;
    
    private static String eyesStartString = "choose eyes";
    private static String eyesCloseString = "chosen eyes";
    private static int eyesLabelX = 710;
    private static int eyesLabelY = 340;
    private static int eyesButtonX = eyesLabelX;
    private static int eyesButtonY = eyesLabelY + buttonY;
    private static int eyesColumns = 2;

    private static String hairStartString = "choose hair";
    private static String hairCloseString = "chosen hair";
    private static int hairLabelX = 710;
    private static int hairLabelY = 470;
    private static int hairButtonX = hairLabelX;
    private static int hairButtonY = hairLabelY + buttonY;
    private static int hairColumns = 2;
    
    private static String sexStartString = "choose sex";
    private static String sexCloseString = "chosen sex";
    private static int sexLabelX = 560;
    private static int sexLabelY = 210;
    private static int sexButtonX = sexLabelX;
    private static int sexButtonY = sexLabelY + buttonY;
    private static int sexColumns = 1;
    

    private static String doubleString = "height weight";
    private static int doublesPanelX = 560;
    private static int doublesPanelY = 340;

    private static int heightSliderX = 75;
    private static int heightSliderY = 220;
    private static int heightSliderMin = 0;
    private static int heightSliderMax = 250;
    private static int heightSliderMajor = 50;
    private static int heightSliderMinor = 10;
    private static int heightSliderText = 15;

    private static String heightString = "height [cm]: ";
    private static int heightPanelX = doublesPanelX;
    private static int heightPanelY = doublesPanelY + labelY;
    private static int heightButtonX = heightPanelX;
    private static int heightButtonY = heightPanelY + heightSliderY;

    private static int weightSliderX = 75;
    private static int weightSliderY = 220;
    private static int weightSliderMin = 0;
    private static int weightSliderMax = 200;
    private static int weightSliderMajor = 25;
    private static int weightSliderMinor = 5;
    private static int weightSliderText = 15;

    private static String weightString = "weight [kg]: ";
    private static int weightPanelX = heightPanelX + heightSliderX;
    private static int weightPanelY = heightPanelY;
    private static int weightButtonX = heightButtonX + heightSliderX;
    private static int weightButtonY = heightButtonY;


    private static int attributeSliderX = 75;
    private static int attributeSliderY = 220;
    private static int attributeSliderMin = 0;
    private static int attributeSliderMax = 15;
    private static int attributeSliderMajor = 3;
    private static int attributeSliderMinor = 1;
    private static int attributeSliderText = 15;

    private static String attributesString = "attributes points left: ";
    private static String attributesErroString = "insert a valide value\nbelow ";
    private static int attributesPanelX = 50; 
    private static int attributesPanelY = 300; 
    
    private static String strengthString = " [ set strength ]";
    private static int strengthCountPanelX = attributesPanelX;
    private static int strengthCountPanelY = attributesPanelY + labelY;
    private static int strengthPanelX = strengthCountPanelX;
    private static int strengthPanelY = strengthCountPanelY + labelY;
    private static int strengthButtonX = strengthPanelX;
    private static int strengthButtonY = strengthPanelY + attributeSliderY;
    
    private static String dexterityString = " [ set dexterity ]";
    private static int dexterityCountPanelX = strengthPanelX + attributeSliderX;
    private static int dexterityCountPanelY = attributesPanelY + labelY;
    private static int dexterityPanelX = dexterityCountPanelX;
    private static int dexterityPanelY = dexterityCountPanelY + labelY;
    private static int dexterityButtonX = dexterityPanelX;
    private static int dexterityButtonY = dexterityPanelY + attributeSliderY;
    
    private static String constitutionString = " [ set constitution ]";
    private static int constitutionCountPanelX = dexterityPanelX + attributeSliderX;
    private static int constitutionCountPanelY = attributesPanelY + labelY;
    private static int constitutionPanelX = constitutionCountPanelX;
    private static int constitutionPanelY = constitutionCountPanelY + labelY;
    private static int constitutionButtonX = constitutionPanelX;
    private static int constitutionButtonY = constitutionPanelY + attributeSliderY;
    
    private static String intelligenceString = " [ set intelligence ]";
    private static int intelligenceCountPanelX = constitutionPanelX + attributeSliderX;
    private static int intelligenceCountPanelY = attributesPanelY + labelY;
    private static int intelligencePanelX = intelligenceCountPanelX;
    private static int intelligencePanelY = intelligenceCountPanelY + labelY;
    private static int intelligenceButtonX = intelligencePanelX;
    private static int intelligenceButtonY = intelligencePanelY + attributeSliderY;
    
    private static String wisdomString = " [ set wisdom ]";
    private static int wisdomCountPanelX = intelligencePanelX + attributeSliderX;
    private static int wisdomCountPanelY = attributesPanelY + labelY;
    private static int wisdomPanelX = wisdomCountPanelX;
    private static int wisdomPanelY = wisdomCountPanelY + labelY;
    private static int wisdomButtonX = wisdomPanelX;
    private static int wisdomButtonY = wisdomPanelY + attributeSliderY;
    
    private static String charismaString = " [ set charisma ]";
    private static int charismaCountPanelX = wisdomPanelX + attributeSliderX;
    private static int charismaCountPanelY = attributesPanelY + labelY;
    private static int charismaPanelX = charismaCountPanelX;
    private static int charismaPanelY = charismaCountPanelY + labelY;
    private static int charismaButtonX = charismaPanelX;
    private static int charismaButtonY = charismaPanelY + attributeSliderY;


    /**
     * *start frame
     */
    private static JFrame myFrame = new JFrame(projectNameString); // frame name
    private static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // screen size
    private static JPanel picturePanel = new JPanel();

    /**
     * *primary buttons
     * !debug button is for developers only
     */
    private static JButton startButton = new JButton(startButtonString); // starts routine button
    private static JButton restartButton = new JButton(restartButtonString); // restarts routine button
    private static JButton debugButton = new JButton(debugButtonString); // debug routine button

    /**
     * *primary page
     */
    private static JLabel projectName = new JLabel(projectNameString);
    private static JLabel projectPicture = new JLabel("");
    private static ImageIcon mainImage = new ImageIcon(mainImageString); // get image
    private static ImageIcon iconImage = new ImageIcon(iconImageString);// get iconImage


    /**
     * *================================
     * *classButtons and subClassButtons
     * *================================
     */
    private static JPanel classPanel = new JPanel();
    private static JLabel classLabel = new JLabel(classChooseString);

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
    private static JLabel raceLabel = new JLabel(raceStartString);
    private static ArrayList<JButton> raceButtonArray = new ArrayList<>();

    private static JPanel eyesPanel = new JPanel();
    private static JLabel eyesLabel = new JLabel(eyesStartString);
    private static ArrayList<JButton> eyeButtonArray = new ArrayList<>();

    private static JPanel hairPanel = new JPanel();
    private static JLabel hairLabel = new JLabel(hairStartString);
    private static ArrayList<JButton> hairButtonArray = new ArrayList<>();

    private static JPanel sexPanel = new JPanel();
    private static JLabel sexLabel = new JLabel(sexStartString);
    private static ArrayList<JButton> sexButtonArray = new ArrayList<>();

    private static JPanel skinPanel = new JPanel();
    private static JLabel skinLabel = new JLabel(skinStartString);
    private static ArrayList<JButton> skinButtonArray = new ArrayList<>();


    /**
     * *============================
     * *characterName and playerName
     * *============================
     */
    private static JPanel namesPanel = new JPanel();
    private static JLabel namesLabel = new JLabel(characterString);
    private static JPanel characterPanel = new JPanel();
    private static JTextField characterField = new JTextField(fieldSize);
    private static JButton characterButton = new JButton(confirmText);

    private static JPanel playerPanel = new JPanel();
    private static JTextField playerField = new JTextField(fieldSize);
    private static JButton playerButton = new JButton(confirmText);


    /**
     * *=======================
     * *heightInt and weightInt
     * *=======================
     */
    private static JPanel doublePanel = new JPanel();
    private static JLabel doubleLabel = new JLabel(heightString);
    private static JLabel doubleTotalLabel = new JLabel(String.valueOf(heightInt));

    private static JPanel heightPanel = new JPanel();
    private static JSlider heightSlider = new JSlider(JSlider.VERTICAL, heightSliderMin, heightSliderMax, heightSliderMin);
    private static JButton heightButton = new JButton(confirmText);

    private static JPanel weightPanel = new JPanel();
    private static JSlider weightSlider = new JSlider(JSlider.VERTICAL, weightSliderMin, weightSliderMax, weightSliderMin);
    private static JButton weightButton = new JButton(confirmText);


    /**
     * *=====================================
     * *attributesTotal and attributesSliders
     * *=====================================
     */
    private static JPanel attributesPanel = new JPanel();
    private static JLabel attributesLabel = new JLabel(attributesString);
    private static JLabel atualAttributesLabel = new JLabel();
    private static JLabel totalAttributesLabel = new JLabel(String.valueOf(totalAttributesInt));

    private static JPanel strengthCountPanel = new JPanel();
    private static JLabel strengthCountLabel = new JLabel(String.valueOf(strengthInt));
    private static JPanel strengthPanel = new JPanel();
    private static JSlider strengthSlider = new JSlider(JSlider.VERTICAL, attributeSliderMin, attributeSliderMax, attributeSliderMin);
    private static JButton strengthButton = new JButton(confirmText);

    private static JPanel dexterityCountPanel = new JPanel();
    private static JLabel dexterityCountLabel = new JLabel(String.valueOf(dexterityInt));
    private static JPanel dexterityPanel = new JPanel();
    private static JSlider dexteritySlider = new JSlider(JSlider.VERTICAL, attributeSliderMin, attributeSliderMax, attributeSliderMin);
    private static JButton dexterityButton = new JButton(confirmText);

    private static JPanel constitutionCountPanel = new JPanel();
    private static JLabel constitutionCountLabel = new JLabel(String.valueOf(constitutionInt));
    private static JPanel constitutionPanel = new JPanel();
    private static JSlider constitutionSlider = new JSlider(JSlider.VERTICAL, attributeSliderMin, attributeSliderMax, attributeSliderMin);
    private static JButton constitutionButton = new JButton(confirmText);

    private static JPanel intelligenceCountPanel = new JPanel();
    private static JLabel intelligenceCountLabel = new JLabel(String.valueOf(intelligenceInt));
    private static JPanel intelligencePanel = new JPanel();
    private static JSlider intelligenceSlider = new JSlider(JSlider.VERTICAL, attributeSliderMin, attributeSliderMax, attributeSliderMin);
    private static JButton intelligenceButton = new JButton(confirmText);

    private static JPanel wisdomCountPanel = new JPanel();
    private static JLabel wisdomCountLabel = new JLabel(String.valueOf(wisdomInt));
    private static JPanel wisdomPanel = new JPanel();
    private static JSlider wisdomSlider = new JSlider(JSlider.VERTICAL, attributeSliderMin, attributeSliderMax, attributeSliderMin);
    private static JButton wisdomButton = new JButton(confirmText);

    private static JPanel charismaCountPanel = new JPanel();
    private static JLabel charismaCountLabel = new JLabel(String.valueOf(charismaInt));
    private static JPanel charismaPanel = new JPanel();
    private static JSlider charismaSlider = new JSlider(JSlider.VERTICAL, attributeSliderMin, attributeSliderMax, attributeSliderMin);
    private static JButton charismaButton = new JButton(confirmText);

    public GraphicInterfaceUtil() 
    {
        /**
         * *create myFrame
         */
        myFrame.setSize(myFrameWidth, myFrameHeight); // size of frame
        myFrame.setLayout(null); // no layout
        myFrame.getContentPane().setBackground(backgroundColor); // set color
        myFrame.setLocation((dim.width - myFrame.getWidth()) / 2, (dim.height - myFrame.getHeight()) / 2); // center
        myFrame.setIconImage(iconImage.getImage()); //change icon of frame

        /**
         * *create picturePanel
         */
        picturePanel.setBounds(picturePanelX, picturePanelY, mainPictureWidth, mainPictureHeight); // position and size
        picturePanel.setLayout(null);
        myFrame.getContentPane().add(picturePanel);

        /**
         * *create projectImage
         */
        projectPicture.setIcon(mainImage); // load image
        projectPicture.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // set board with color
        projectPicture.setSize(mainPictureWidth, mainPictureHeight); // width height
        picturePanel.add(projectPicture);

        /**
         * *create projectName
         */
        projectName.setFont(new Font(defaultFont, fontStyle, fontHuge));
        projectName.setForeground(Color.BLACK);
        projectName.setBounds(projectNameX, projectNameY, projectNameWidth, projectNameHeight);
        myFrame.add(projectName);

        /**
         * *================================
         * *classButtons and subClassButtons
         * *================================
         */
        labelStyle(classLabel, classPanelX, classPanelY, labelX, labelY, fontLarge);
        panelStyle(classPanel, classPanelX, classPanelY, panelX, panelY, classLabel);

        buttonStyle(barbarianButton, barbarianButtonX, barbarianButtonY, buttonX, buttonY, this, fontLarge);
        buttonStyle(mageButton, mageButtonX, mageButtonY, buttonX, buttonY, this, fontLarge);
        buttonStyle(rogueButton, rogueButtonX, rogueButtonY, buttonX, buttonY, this, fontLarge);

        buttonStyle(furiousButton, furiousButtonX, furiousButtonY, buttonX, buttonY, this, fontLarge);
        buttonStyle(totemicButton, totemicButtonX, totemicButtonY, buttonX, buttonY, this, fontLarge);
        buttonStyle(frostMageButton, frostMageButtonX, frostMageButtonY, buttonX, buttonY, this, fontLarge);
        buttonStyle(fireMageButton, fireMageButtonX, fireMageButtonY, buttonX, buttonY, this, fontLarge);
        buttonStyle(arcaneMageButton, arcaneMageButtonX, arcaneMageButtonY, buttonX, buttonY, this, fontLarge);
        buttonStyle(assassinButton, assassinButtonX, assassinButtonY, buttonX, buttonY, this, fontLarge);
        buttonStyle(trapperButton, trapperButtonX, trapperButtonY, buttonX, buttonY, this, fontLarge);

        /**
         * *=============================
         * *characterPanel and playerName
         * *=============================
         */
        labelStyle(namesLabel, namesPanelX, namesPanelY, labelX, labelY, fontLarge);
        panelStyle(namesPanel, namesPanelX, namesPanelY, labelX, labelY, namesLabel);

        panelStyle(characterPanel, characterPanelX, characterPanelY, 2 * buttonX, buttonY, characterField);
        buttonStyle(characterButton, characterPanelX + 2 * buttonX, characterPanelY, buttonX, buttonY, this, fontLarge);

        panelStyle(playerPanel, playerPanelX, playerPanelY, 2 * buttonX, buttonY, playerField);
        buttonStyle(playerButton, playerPanelX + 2 * buttonX, playerPanelY, buttonX, buttonY, this, fontLarge);

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
         * *person attributes and enums
         * *=====================================
         */
        labelStyle(raceLabel, raceLabelX, raceLabelY, labelX, labelY, fontLarge);
        panelStyle(racePanel, raceLabelX, raceLabelY, labelX, labelY, raceLabel);

        labelStyle(skinLabel, skinLabelX, skinLabelY, labelX - buttonX, labelY, fontLarge);
        panelStyle(skinPanel, skinLabelX, skinLabelY, labelX - buttonX, labelY, skinLabel);

        labelStyle(eyesLabel, eyesLabelX, eyesLabelY, labelX - buttonX, labelY, fontLarge);
        panelStyle(eyesPanel, eyesLabelX, eyesLabelY, labelX - buttonX, labelY, eyesLabel);

        labelStyle(hairLabel, hairLabelX, hairLabelY, labelX - buttonX, labelY, fontLarge);
        panelStyle(hairPanel, hairLabelX, hairLabelY, labelX - buttonX, labelY, hairLabel);

        labelStyle(sexLabel, sexLabelX, sexLabelY, buttonX, labelY, fontLarge);
        panelStyle(sexPanel, sexLabelX, sexLabelY, buttonX, labelY, sexLabel);


        /**
         * *=======================
         * *heightInt and weightInt
         * *=======================
         */
        labelStyle(doubleTotalLabel, doublesPanelX, doublesPanelY, buttonX, labelY, fontLarge);
        labelStyle(doubleLabel, doublesPanelX, doublesPanelY, buttonX, labelY, fontMedium);
        panelStyle(doublePanel, doublesPanelX, doublesPanelY, buttonX, panelY, doubleLabel);
        doublePanel.add(doubleTotalLabel);

        panelStyle(heightPanel, heightPanelX, heightPanelY, heightSliderX, heightSliderY, heightSlider);
        sliderStylo(heightSlider, heightSliderMinor, heightSliderMajor, heightSliderText);
        buttonStyle(heightButton, heightButtonX, heightButtonY, heightSliderX, buttonY, this, fontSmall);
        heightSlider.addChangeListener((ChangeListener) this);

        panelStyle(weightPanel, weightPanelX, weightPanelY, weightSliderX, weightSliderY, weightSlider);
        sliderStylo(weightSlider, weightSliderMinor, weightSliderMajor, weightSliderText);
        buttonStyle(weightButton, weightButtonX, weightButtonY, weightSliderX, buttonY, this, fontSmall);
        weightSlider.addChangeListener((ChangeListener) this);


        /**
         * *=====================================
         * *attributesTotal and attributesSliders
         * *=====================================
         */
        labelStyle(attributesLabel, attributesPanelX, attributesPanelY, labelX, labelY, fontLarge);
        labelStyle(atualAttributesLabel, attributesPanelX, attributesPanelY, labelX, labelY, fontLarge);
        labelStyle(totalAttributesLabel, attributesPanelX, attributesPanelY, labelX, labelY, fontLarge);
        panelStyle(attributesPanel, attributesPanelX, attributesPanelY, panelX, panelY, attributesLabel);
        attributesPanel.add(totalAttributesLabel);
        attributesPanel.add(atualAttributesLabel);

        labelStyle(strengthCountLabel, strengthCountPanelX, strengthCountPanelY, attributeSliderX, labelY, fontLarge);
        panelStyle(strengthCountPanel, strengthCountPanelX, strengthCountPanelY, attributeSliderX, labelY, strengthCountLabel);
        panelStyle(strengthPanel, strengthPanelX, strengthPanelY, attributeSliderX, attributeSliderY, strengthSlider);
        sliderStylo(strengthSlider, attributeSliderMinor, attributeSliderMajor, attributeSliderText);
        buttonStyle(strengthButton, strengthButtonX, strengthButtonY, attributeSliderX, buttonY, this, fontSmall);
        strengthSlider.addChangeListener((ChangeListener) this);

        labelStyle(dexterityCountLabel, dexterityCountPanelX, dexterityCountPanelY, attributeSliderX, labelY, fontLarge);
        panelStyle(dexterityCountPanel, dexterityCountPanelX, dexterityCountPanelY, attributeSliderX, labelY, dexterityCountLabel);
        panelStyle(dexterityPanel, dexterityPanelX, dexterityPanelY, attributeSliderX, attributeSliderY, dexteritySlider);
        sliderStylo(dexteritySlider, attributeSliderMinor, attributeSliderMajor, attributeSliderText);
        buttonStyle(dexterityButton, dexterityButtonX, dexterityButtonY, attributeSliderX, buttonY, this, fontSmall);
        dexteritySlider.addChangeListener((ChangeListener) this);

        labelStyle(constitutionCountLabel, constitutionCountPanelX, constitutionCountPanelY, attributeSliderX, labelY, fontLarge);
        panelStyle(constitutionCountPanel, constitutionCountPanelX, constitutionCountPanelY, attributeSliderX, labelY, constitutionCountLabel);
        panelStyle(constitutionPanel, constitutionPanelX, constitutionPanelY, attributeSliderX, attributeSliderY, constitutionSlider);
        sliderStylo(constitutionSlider, attributeSliderMinor, attributeSliderMajor, attributeSliderText);
        buttonStyle(constitutionButton, constitutionButtonX, constitutionButtonY, attributeSliderX, buttonY, this, fontSmall);
        constitutionSlider.addChangeListener((ChangeListener) this);

        labelStyle(intelligenceCountLabel, intelligenceCountPanelX, intelligenceCountPanelY, attributeSliderX, labelY, fontLarge);
        panelStyle(intelligenceCountPanel, intelligenceCountPanelX, intelligenceCountPanelY, attributeSliderX, labelY, intelligenceCountLabel);
        panelStyle(intelligencePanel, intelligencePanelX, intelligencePanelY, attributeSliderX, attributeSliderY, intelligenceSlider);
        sliderStylo(intelligenceSlider, attributeSliderMinor, attributeSliderMajor, attributeSliderText);
        buttonStyle(intelligenceButton, intelligenceButtonX, intelligenceButtonY, attributeSliderX, buttonY, this, fontSmall);
        intelligenceSlider.addChangeListener((ChangeListener) this);

        labelStyle(wisdomCountLabel, wisdomCountPanelX, wisdomCountPanelY, attributeSliderX, labelY, fontLarge);
        panelStyle(wisdomCountPanel, wisdomCountPanelX, wisdomCountPanelY, attributeSliderX, labelY, wisdomCountLabel);
        panelStyle(wisdomPanel, wisdomPanelX, wisdomPanelY, attributeSliderX, attributeSliderY, wisdomSlider);
        sliderStylo(wisdomSlider, attributeSliderMinor, attributeSliderMajor, attributeSliderText);
        buttonStyle(wisdomButton, wisdomButtonX, wisdomButtonY, attributeSliderX, buttonY, this, fontSmall);
        wisdomSlider.addChangeListener((ChangeListener) this);

        labelStyle(charismaCountLabel, charismaCountPanelX, charismaCountPanelY, attributeSliderX, labelY, fontLarge);
        panelStyle(charismaCountPanel, charismaCountPanelX, charismaCountPanelY, attributeSliderX, labelY, charismaCountLabel);
        panelStyle(charismaPanel, charismaPanelX, charismaPanelY, attributeSliderX, attributeSliderY, charismaSlider);
        sliderStylo(charismaSlider, attributeSliderMinor, attributeSliderMajor, attributeSliderText);
        buttonStyle(charismaButton, charismaButtonX, charismaButtonY, attributeSliderX, buttonY, this, fontSmall);
        charismaSlider.addChangeListener((ChangeListener) this);

        /**
         * *===========
         * *mainButtons
         * *===========
         */
        buttonStyle(startButton, startButtonX, startButtonY, buttonX, buttonY, this, fontLarge);
        buttonStyle(restartButton, restartButtonX, restartButtonY, buttonX, buttonY, this, fontLarge);
        buttonStyle(debugButton, debugButtonX, debugButtonY, buttonX, buttonY, this, fontLarge);

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
        label.setFont(new Font(defaultFont, fontStyle, fontSize));
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
        button.setFont(new Font(defaultFont, fontStyle, fontSize));
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
        slider.setFont(new Font(defaultFont, Font.PLAIN, fontSize));
    }

    /**
     * *closes a classButton: desired button text is upper and the other classes are disabled
     * @param classButton
     */
    public void closeClassButton(JButton classButton) {
        classButton.setText(classButton.getText().toUpperCase());

        classLabel.setText(subClassString);

        barbarianButton.setEnabled(false);
        mageButton.setEnabled(false);
        rogueButton.setEnabled(false);

        //JOptionPane.showMessageDialog(myFrame, Arquivos.readString("Subclasses.txt"));

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

        classLabel.setText(classCloseString);

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

        JOptionPane.showMessageDialog(myFrame, attributesErroString + totalAttributesLabel.getText());
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
        if (e.getSource() == strengthSlider)
        {
            strengthCountLabel.setText(String.valueOf(strengthSlider.getValue()));
        }

        if (e.getSource() == dexteritySlider)
        {
            dexterityCountLabel.setText(String.valueOf(dexteritySlider.getValue()));
        }

        if (e.getSource() == constitutionSlider)
        {
            constitutionCountLabel.setText(String.valueOf(constitutionSlider.getValue()));
        }

        if (e.getSource() == intelligenceSlider)
        {
            intelligenceCountLabel.setText(String.valueOf(intelligenceSlider.getValue()));
        }

        if (e.getSource() == wisdomSlider)
        {
            wisdomCountLabel.setText(String.valueOf(wisdomSlider.getValue()));
        }

        if (e.getSource() == charismaSlider)
        {
            charismaCountLabel.setText(String.valueOf(charismaSlider.getValue()));
        }

        if (e.getSource() == heightSlider)
        {
            doubleTotalLabel.setText(String.valueOf(heightSlider.getValue()));
        }

        if (e.getSource() == weightSlider)
        {
            doubleTotalLabel.setText(String.valueOf(weightSlider.getValue()));
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
            System.out.println("heightInt: " + heightInt);
            System.out.println("weightInt: " + weightInt + "\n");
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
            heightInt = 0;
            weightInt = 0;
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
            
            myFrame.remove(doublePanel);
            myFrame.remove(heightPanel);
            myFrame.remove(heightButton);
            myFrame.remove(weightPanel);
            myFrame.remove(weightButton);

            myFrame.remove(attributesPanel);

            myFrame.remove(strengthCountPanel);
            myFrame.remove(strengthPanel);
            myFrame.remove(strengthSlider);
            myFrame.remove(strengthButton);

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
            startButton.setText(buildButtonString);
            startButton.setEnabled(false);

            restartButton.setEnabled(true);
            System.out.println("\nstart");

            myFrame.remove(picturePanel);
            myFrame.remove(projectName);

            myFrame.add(classPanel);
            openButton(barbarianButton);
            openButton(mageButton);
            openButton(rogueButton);

            JOptionPane.showMessageDialog(myFrame, Arquivos.readString("Classes.txt"));

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

            namesLabel.setText(playerString);
        }

        /**
         * *playerButton action
         */
        if (e.getSource() == playerButton) {
            playerName = playerField.getText().toLowerCase();
            closeField(playerField, playerButton);

            namesLabel.setText(nameCloseString);


            myFrame.add(racePanel);
            raceLabel.setText(raceStartString);
            addButtonArray(raceButtonArray, raceButtonX, raceButtonY, raceColumns);

        }
        /**
         * *========================
         * *enums raceButton actions
         * *========================
         */
        if(raceButtonArray.contains(e.getSource())){
            int count = 0;
            for(JButton button : raceButtonArray)
            {
                if(e.getSource() == button)
                {
                    raceInt = count;
                    raceLabel.setText(raceCloseString);
                    button.setText(button.getText().toUpperCase());
                    strengthInt = Race.values()[raceInt].getStrenght();
                    dexterityInt = Race.values()[raceInt].getDexterity();
                    constitutionInt = Race.values()[raceInt].getConstitution();
                    intelligenceInt = Race.values()[raceInt].getIntelligence();
                    wisdomInt = Race.values()[raceInt].getWisdom();
                    charismaInt = Race.values()[raceInt].getCharisma();
                }
                count++;
                button.setEnabled(false);
            }

            myFrame.add(skinPanel);
            skinLabel.setText(skinStartString);
            addButtonArray(skinButtonArray, skinButtonX, skinButtonY, skinColumns);
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
                    skinLabel.setText(skinCloseString);
                    j.setText(j.getText().toUpperCase());
                }
                count++;
                j.setEnabled(false);
            }
            myFrame.add(eyesPanel);
            eyesLabel.setText(eyesStartString);
            addButtonArray(eyeButtonArray, eyesButtonX, eyesButtonY, eyesColumns);
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
                    eyesLabel.setText(eyesCloseString);
                    j.setText(j.getText().toUpperCase());
                }
                count++;
                j.setEnabled(false);
            }
            myFrame.add(hairPanel);
            hairLabel.setText(hairStartString);
            addButtonArray(hairButtonArray, hairButtonX, hairButtonY, hairColumns);
            myFrame.repaint();
            myFrame.revalidate();
        }

        if(hairButtonArray.contains(e.getSource())){
            int count = 0;
            for(JButton button : hairButtonArray)
            {
                if(e.getSource() == button)
                {
                    hairInt = count;
                    hairLabel.setText(hairCloseString);
                    button.setText(button.getText().toUpperCase());
                }
                count++;
                button.setEnabled(false);
            }
            myFrame.add(sexPanel);
            sexLabel.setText(sexStartString);
            addButtonArray(sexButtonArray, sexButtonX, sexButtonY, sexColumns);
            myFrame.repaint();
            myFrame.revalidate();
        }

        if(sexButtonArray.contains(e.getSource())){
            int count = 0;
            for(JButton button : sexButtonArray){
                if(e.getSource() == button)
                {
                    sexInt = count;
                    sexLabel.setText(sexCloseString);
                    button.setText(button.getText().toUpperCase());
                }
                count++;
                button.setEnabled(false);
            }
            myFrame.add(doublePanel);
            myFrame.add(heightPanel);
            myFrame.add(heightButton);
            doubleLabel.setText(heightString);
            doubleLabel.setFont(new Font(defaultFont, fontStyle, fontMedium));
            doublePanel.add(doubleTotalLabel);
            heightPanel.setEnabled(true);
            heightButton.setEnabled(true);
            heightSlider.setEnabled(true);
            heightSlider.setValue(0);


            myFrame.repaint();
            myFrame.revalidate();
        }

        if(e.getSource() == heightButton)
        {
            heightInt += heightSlider.getValue();
            doubleLabel.setText(weightString);

            doubleTotalLabel.setText(String.valueOf(0));
            closeSlider(heightSlider, heightButton);

            myFrame.add(weightPanel);
            myFrame.add(weightButton);
            weightPanel.setEnabled(true);
            weightButton.setEnabled(true);
            weightSlider.setEnabled(true);
            weightSlider.setValue(0);

            myFrame.repaint();
            myFrame.revalidate();
        }

        if(e.getSource() == weightButton)
        {
            weightInt += weightSlider.getValue();
            doubleLabel.setText(doubleString);
            doubleLabel.setFont(new Font(defaultFont, fontStyle, fontLarge));
            doublePanel.remove(doubleTotalLabel);

            doubleTotalLabel.setText(String.valueOf(0));
            closeSlider(weightSlider, weightButton);

            atualAttributesLabel.setText(strengthString);
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

            if(valideAttribute(strengthSlider.getValue()))
            {
                atualAttributesLabel.setText(dexterityString);
                totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - strengthSlider.getValue()));
                closeSlider(strengthSlider, strengthButton);
                openSlider(dexteritySlider, dexterityPanel, dexterityButton);
                myFrame.add(dexterityCountPanel);
            }
        }

        if (e.getSource() == dexterityButton) {
            dexterityInt += dexteritySlider.getValue();

            if(valideAttribute(dexteritySlider.getValue()))
            {
                atualAttributesLabel.setText(constitutionString);
                totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - dexteritySlider.getValue()));
                closeSlider(dexteritySlider, dexterityButton);
                openSlider(constitutionSlider, constitutionPanel, constitutionButton);
                myFrame.add(constitutionCountPanel);
            }
        }

        if (e.getSource() == constitutionButton) {
            constitutionInt += constitutionSlider.getValue();

            if(valideAttribute(constitutionSlider.getValue()))
            {
                atualAttributesLabel.setText(intelligenceString);
                totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - constitutionSlider.getValue()));
                closeSlider(constitutionSlider, constitutionButton);
                openSlider(intelligenceSlider, intelligencePanel, intelligenceButton);
                myFrame.add(intelligenceCountPanel);
            }
        }

        if (e.getSource() == intelligenceButton) {
            intelligenceInt += intelligenceSlider.getValue();

            if(valideAttribute(intelligenceSlider.getValue()))
            {
                atualAttributesLabel.setText(wisdomString);
                totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - intelligenceSlider.getValue()));
                closeSlider(intelligenceSlider, intelligenceButton);
                openSlider(wisdomSlider, wisdomPanel, wisdomButton);
                myFrame.add(wisdomCountPanel);
            }
        }

        if (e.getSource() == wisdomButton) {
            wisdomInt += wisdomSlider.getValue();

            if(valideAttribute(wisdomSlider.getValue()))
            {
                atualAttributesLabel.setText(charismaString);
                totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - wisdomSlider.getValue()));
                closeSlider(wisdomSlider, wisdomButton);
                openSlider(charismaSlider, charismaPanel, charismaButton);
                myFrame.add(charismaCountPanel);
            }
        }

        if (e.getSource() == charismaButton) {
            charismaInt += charismaSlider.getValue();

            if(valideAttribute(charismaSlider.getValue()))
            {
                atualAttributesLabel.setText("");
                totalAttributesLabel.setText(String.valueOf(Integer.parseInt(totalAttributesLabel.getText()) - charismaSlider.getValue()));
                closeSlider(charismaSlider, charismaButton);
            }

            /**
             * !chamada dos métodos para criar o personagem
             */
            Attributes attributes = CharacterCreatorUtil.getAttributesPoints(
                raceInt,
                strengthInt,
                dexterityInt,
                constitutionInt,
                intelligenceInt,
                wisdomInt,
                charismaInt
            );

            Adventurer adventurer = CharacterCreatorUtil.createAdventurer(
                attributes,
                characterName,
                playerName,
                chosenClass,
                chosenSubClass,
                heightInt,
                weightInt,
                raceInt,
                eyesInt,
                skinInt,
                sexInt,
                hairInt);

            adventurer.getInventory().addWeapon(Weapon.TRIDENT);
            Arquivos.write("Adventurer [" + (++totalAdventurersInt) + "]", adventurer);
        }
    }

    public static void main(String[] args) {

        new GraphicInterfaceUtil();

        // NarratorUtil.greetings();
        // Scanner scanner = new Scanner(System.in);
        // Adventurer a  = CharacterCreatorUtil.startCharacterCreation(scanner);
        // a.getInventory().addWeapon(Weapon.TRIDENT);
        // System.out.println(a);
        // scanner.close();

        // Arquivos.write("Ladino", a);
        // Arquivos.read("teste.txt");
    }
}
