package gui;

import observers.MainMenuObserver;
import observers.Observer;

import javax.swing.*;
import java.awt.*;

public class MainMenuFrame extends FrameInterface{
    private JLabel tileLabel = new JLabel("Select Service");
    private JButton loginButton = new JButton("Login");
    private JButton registerButton = new JButton("Register");
    private JButton exitButton = new JButton("Exit");
    private Observer observer = new MainMenuObserver(this);

    public void initGui(){
        this.setLayout(new GridLayout(4,1));
        this.loginButton.addActionListener(observer);
        this.registerButton.addActionListener(observer);
        this.exitButton.addActionListener(observer);


        this.add(tileLabel);
        this.add(loginButton);
        this.add(registerButton);
        this.add(exitButton);
        this.setVisible(true);

        System.out.println("hello");
    }



}
