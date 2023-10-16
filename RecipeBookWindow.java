import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecipeBookWindow extends JFrame {
    
    //Main sections of GUI
    JPanel titleCard = new JPanel();
    JPanel searchRecipe = new JPanel();
    JPanel showRecipe = new JPanel();
    JPanel addRecipe = new JPanel();

    //Sub sections
    JLabel title = new JLabel("Recipe Book");

    //Other variables
    Border blackline = BorderFactory.createLineBorder(Color.black);

    public RecipeBookWindow(String text) {
        super(text);

        titleCard.setLayout(new FlowLayout());
        titleCard.setBorder(blackline);
        title.setFont(new Font("Arial", Font.BOLD, 50));
        titleCard.add(title, CENTER_ALIGNMENT);

        searchRecipe.setBorder(blackline);

        showRecipe.setBorder(blackline);

        addRecipe.setBorder(blackline);

        this.add(titleCard, BorderLayout.NORTH);
        this.add(searchRecipe, BorderLayout.WEST);
        this.add(showRecipe, BorderLayout.EAST);
        this.add(addRecipe, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

}
