package utils;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class GraphicInterface extends JFrame implements ActionListener
{
    private static final long serialVersionUID = -2122161377842820073L;

    JButton startButton;

    GraphicInterface()
    {
        super("RPG Helper"); //frame name
        this.setSize(1080,720); //size of frame
        this.setLayout(null); //no layout
        this.getContentPane().setBackground(new Color(96, 85, 91)); //set color

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //screen size
        this.setLocation((dim.width-this.getWidth())/2, (dim.height-this.getHeight())/2); //center window


        // Container container = getContentPane();  //get container
        // container.setLayout(null); //set layout
        // container.setBackground(new Color(96, 85, 91)); //set color

        // JPanel panel = new JPanel();
        // panel.setBounds(50, 50, 960, 479); //position and size
        // panel.setLayout(null);
        // container.add(panel);

        Image image = new ImageIcon("RPG Git.png").getImage(); //get image
        image = image.getScaledInstance(960, 479, java.awt.Image.SCALE_AREA_AVERAGING); //transform it

        JLabel projectPicture = new JLabel("");
        projectPicture.setIcon(new ImageIcon(image)); //load image
        projectPicture.setBorder(BorderFactory.createLineBorder(Color.BLACK)); //set board with color
        projectPicture.setBounds(50, 50, 960, 479); //width height
        this.getContentPane().getParent().add(projectPicture);

        JLabel projectName = new JLabel("RPG HELPER");
        projectName.setFont(new Font("Impact", Font.BOLD, 60));
        projectName.setForeground(Color.BLACK);
        projectName.setBounds(50, 575, 500, 50);
        this.add(projectName);


        startButton = new JButton("Start");
        startButton.setFont(new Font("Impact", Font.BOLD, 20));
        startButton.setForeground(Color.BLACK);
        startButton.setBounds(910, 575, 100, 40);
        startButton.addActionListener(this);
        this.getContentPane().add(startButton);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(500, 50));

        this.add(textField);

        setDefaultCloseOperation(EXIT_ON_CLOSE); //close operation
        setVisible(true); //make visible
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == startButton)
        {
            startButton.setText("Done");
            System.out.println("Botão Prescionado");
        }
    }


    public static void main(String[] args)
    {
        GraphicInterface myFrame = new GraphicInterface();
        System.out.println(myFrame.startButton.getText());


    }
}
