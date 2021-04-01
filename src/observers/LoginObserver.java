package observers;

import dialog.StateDialog;
import gui.LoginFrame;
import serviceManager.MainInstance;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class LoginObserver extends Observer{
    public LoginObserver(LoginFrame parent_Frame){
        this.parentFrame = parent_Frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        MainInstance mainInstance = MainInstance.getInstance();
        switch (e.getActionCommand()) {
            case "Back":
                stateDialog.moveLoginToMainMenu();
                break;

            case "Login":
                mainInstance.setLogin(this.parentFrame.getLogin());
                mainInstance.setPassword(this.parentFrame.getPassword());
                stateDialog.moveLoginToLoggedUserMenu();
                break;


        }

    }}
