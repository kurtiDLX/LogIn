import javax.swing.*;

public class MainLogWindow {
    public static void main(String[] args) {
           ComponentsAndLogic window = new ComponentsAndLogic();
           window.setResizable(false);
           window.setSize(290, 170);
           window.setLocationRelativeTo(null);
           window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
           window.setVisible(true);
    }
}
