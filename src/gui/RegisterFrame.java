package gui;

import observers.Observer;
import observers.RegisterObserver;

import javax.swing.*;
import java.awt.*;

public class RegisterFrame extends FrameSkeleton {
    private JLabel registerLabel = new JLabel("please register");
    private JTextField loginTextField = new JTextField("insert login");
    private JTextField passwordTextField = new JTextField("insert password");
    private JButton registerButton = new JButton("Register");
    private JButton moveBackButton = new JButton("Move back");
    private Observer observer = new RegisterObserver(this);

    public void initGui(){
        this.setLayout(new GridLayout(5, 1));
        this.add(registerLabel);
        this.add(loginTextField);
        this.add(passwordTextField);
        this.add(registerButton);
        this.add(moveBackButton);
        this.setVisible(true);
        this.registerButton.addActionListener(this.observer);
        this.moveBackButton.addActionListener(this.observer);
    }

    @Override
    public String getLogin(){
        return this.loginTextField.getText();
    }

    @Override
    public String getPassword(){
        return this.passwordTextField.getText();
    }
//    public void exitGui(){
//
//    }

}
