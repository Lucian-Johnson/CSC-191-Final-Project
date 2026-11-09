import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu{
public static void main(String[] args){
    //Create Window
    JFrame frame = new JFrame("Main Menu");
    frame.setSize(800,800);
    
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets= new Insets(10, 10, 10, 10);
    //Create JPanel
    JPanel panel = new JPanel(new GridBagLayout());
    JPanel group = new JPanel(new GridBagLayout());
    JLabel label = new JLabel("Project Zorkmon");
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.weightx = 0.5;
    gbc.weighty = 0.0;
    gbc.anchor = GridBagConstraints.CENTER;
    group.add(label, gbc);

    JButton play = new JButton("Play");
    gbc.gridx = 1;
    gbc.gridy = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    gbc.weightx = 0.5;
    gbc.weighty = 0.0;
    group.add(play,gbc);
    panel.add(group, gbc);

    JButton exit = new JButton("X");
    gbc.gridx = 2;
    gbc.gridy = 0;
    gbc.weightx = 0.1;
    gbc.weighty = 1.0;
    gbc.anchor = GridBagConstraints.NORTHEAST;
    panel.add(exit, gbc);

    

    
    frame.add(panel);
    frame.setVisible(true);


    
    


}
}