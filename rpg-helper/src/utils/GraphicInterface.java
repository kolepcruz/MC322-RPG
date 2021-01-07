package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GraphicInterface
{

    public static void main(String[] args)
    {
        JButton startButton;
        JButton restartButton;
        JLabel projectName;
        JLabel projectPicture;
        Image mainImage;


        JFrame myFrame = new JFrame("RPG Helper"); //frame name
        myFrame.setSize(1080,720); //size of frame
        myFrame.setLayout(null); //no layout
        myFrame.getContentPane().setBackground(new Color(96, 85, 91)); //set color

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //screen size
        myFrame.setLocation((dim.width-myFrame.getWidth())/2, (dim.height-myFrame.getHeight())/2); //center window

        Container myContainer = myFrame.getContentPane();  //get container
        myContainer.setLayout(null); //set layout
        myContainer.setBackground(new Color(96, 85, 91)); //set color

        JPanel myPanel = new JPanel();
        myPanel.setBounds(50, 50, 960, 479); //position and size
        myPanel.setLayout(null);
        myContainer.add(myPanel);

        mainImage = new ImageIcon("/rpg-helper/src/utils/RPG Git.png").getImage(); //get image
        mainImage = mainImage.getScaledInstance(960, 479, java.awt.Image.SCALE_AREA_AVERAGING); //transform it

        projectPicture = new JLabel("");
        projectPicture.setIcon(new ImageIcon(mainImage)); //load image
        projectPicture.setBorder(BorderFactory.createLineBorder(Color.BLACK)); //set board with color
        projectPicture.setBounds(50, 50, 960, 479); //width height
        myContainer.add(projectPicture);

        projectName = new JLabel("RPG HELPER");
        projectName.setFont(new Font("Impact", Font.BOLD, 60));
        projectName.setForeground(Color.BLACK);
        projectName.setBounds(50, 575, 500, 50);
        myFrame.add(projectName);


        startButton = new JButton("Start");
        startButton.setFont(new Font("Impact", Font.BOLD, 20));
        startButton.setForeground(Color.BLACK);
        startButton.setBounds(810, 575, 100, 40);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == startButton)
                {
                    startButton.setText("Done");
                    System.out.println("Botão Start");
                    myFrame.remove(myPanel);
                    myFrame.remove(projectName);
                    myFrame.repaint();
                }
            }
        });
        myFrame.getContentPane().add(startButton);

        restartButton = new JButton("Restart");
        restartButton.setFont(new Font("Impact", Font.BOLD, 20));
        restartButton.setForeground(Color.BLACK);
        restartButton.setBounds(910, 575, 100, 40);
        restartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == restartButton)
                {
                    startButton.setText("Start");
                    System.out.println("Botão Restart");
                    System.exit(0);
                }
            }
        });
        myFrame.getContentPane().add(restartButton);

        myFrame.setDefaultCloseOperation(0); //close operation
        myFrame.setVisible(true); //make visible
    }
}
