import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class LoginPage implements ActionListener{

    // Defining each element present in the login page interface
    JFrame frame = new JFrame("Login System");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password:");
    JLabel messageLabel = new JLabel();
    HashMap<String,String> loginInfo;

    // Defining our constructor
    LoginPage(HashMap<String,String> loginInfoOriginal){

        // Define the frame on which the page elements will be located
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        /* The code to connect the login information provided in
        a class adjacent to the login one. */
        loginInfo = loginInfoOriginal;

        // Resizing used labels
        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        // Resizing used fields
        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        // Creating our login button and accessing it at press
        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        // Creating our reset button and accessing it at press
        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        // The code written for defining the aspect of our message
        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        // The code for initialise every element for our frame
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messageLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Code designed to create the functionality of our login button
        if(e.getSource()==loginButton) {

            // Code that aims to access information from the class where the login data are located
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            /* Code used to provide a positive response in case of correct data access
            and negative in case of wrong access of these */
            if(loginInfo.containsKey(userID)){

                if(loginInfo.get(userID).equals((password))){

                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful");
                    frame.dispose();

                    // Automatic transition to our next interface
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                else {

                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password");
                }
            }
            else {

                messageLabel.setForeground(Color.red);
                messageLabel.setText("Your name is wrong");
            }
        }

        // Code designed to create the functionality of our reset button
        if(e.getSource()==resetButton) {

            userIDField.setText("");
            userPasswordField.setText("");
        }
    }
}

