package gui;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends FrameSkeleton {
    private JLabel titleLabel = new JLabel("Please login");
    private JLabel usernameLabel = new JLabel("Username");
    private JLabel passwordLabel = new JLabel("Password");
    private JTextField usernameTextField = new JTextField();
    private JTextField passwordTextField = new JTextField();
    private JButton loginButton = new JButton("Login");

    public void initGui(){
        this.setLayout(new GridLayout(4,2));
        this.add(titleLabel);
        this.add(new JLabel());
        this.add(usernameLabel);
        this.add(usernameTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(loginButton);
        this.setVisible(true);


    }

    public String getLogin(){
        return this.usernameTextField.getText();
    }
    public String getPassword(){
        return this.passwordTextField.getText();
    }


    public void exitGui(){}
}
