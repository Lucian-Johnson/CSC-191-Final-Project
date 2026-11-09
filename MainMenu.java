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

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    gbc.gridx = 0; 
    gbc.gridy = 0; // One cell that fills the whole panel, hence the 0s. 

    gbc.weightx = 1.0; // Fill the whole width of the panel
    gbc.weighty = 1.0; // Fill the whole height of the panel

    JButton play = new JButton("Play");
    gbc.anchor = GridBagConstraints.CENTER; // Center the button in the cell
    gbc.insets = new Insets(0, 0, 0, 0); // No padding around the button
    // top, left, bottom, right
    panel.add(play, gbc);

    // Now to add the title button and center it horizontally, but offset it vertically. 
    JLabel label = new JLabel("Project Zorkmon");
    gbc.anchor = GridBagConstraints.CENTER; // Anchor the title to the center of the cell
    gbc.insets = new Insets(0, 0, 120, 0); // Add some padding around the title
    panel.add(label, gbc); // Now that we have modified values for gbc, it will position the label object differently.

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