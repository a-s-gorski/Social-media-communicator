package gui;

import observers.LoginObserver;
import observers.Observer;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends FrameSkeleton {
    private JLabel titleLabel = new JLabel("Please login");
    private JLabel usernameLabel = new JLabel("Username");
    private JLabel passwordLabel = new JLabel("Password");
    private JTextField usernameTextField = new JTextField();
    private JTextField passwordTextField = new JTextField();
    private JButton loginButton = new JButton("Login");
    private JButton moveBackButton = new JButton("Back");
    private Observer observer = new LoginObserver(this);

    public void initGui(){
        this.setLayout(new GridLayout(5,2));
        this.add(titleLabel);
        this.add(new JLabel());
        this.add(usernameLabel);
        this.add(usernameTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(loginButton);
        this.add(new JLabel());
        this.add(moveBackButton);
        this.loginButton.addActionListener(this.observer);
        this.moveBackButton.addActionListener(this.observer);

        this.setVisible(true);


    }

    public String getLogin(){
        return this.usernameTextField.getText();
    }
    public String getPassword(){
        return this.passwordTextField.getText();
    }


//    public void exitGui(){
//
//    }
}
