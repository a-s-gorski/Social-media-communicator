package observers;

import dialog.StateDialog;
import gui.MainMenuFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class MainMenuObserver extends Observer{
    public MainMenuObserver(MainMenuFrame mainMenuFrame) {
        this.parentFrame = mainMenuFrame;
    }

//    public MainMenuObserver(JFrame parentFrame) {
//        super(parentFrame);
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        switch (s) {
            case "Login" -> stateDialog.moveMainMenuToLogin();
            case "Register" -> stateDialog.moveMainMenuToRegister();
            case "Exit" -> this.parentFrame.dispatchEvent(new WindowEvent(this.parentFrame, WindowEvent.WINDOW_CLOSING));
        }

    }
}
