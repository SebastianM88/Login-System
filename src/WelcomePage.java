import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    /*  Our Welcome page through which we want that after successful access
     to the data, the user receive a greeting by the program
     */

    JFrame frame = new JFrame("Welcome Page");
    JLabel WelcomeLabel = new JLabel("Hello");

    WelcomePage(String userID) {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        WelcomeLabel.setBounds(0,0,200,35);
        WelcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        WelcomeLabel.setText("Hello " + userID) ;

        frame.add(WelcomeLabel);
    }
}
