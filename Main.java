import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final String text = "Recipe Book";
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run () {
                final RecipeBookWindow window = new RecipeBookWindow(text);
                window.setVisible(true);
            }
        });
    }
}