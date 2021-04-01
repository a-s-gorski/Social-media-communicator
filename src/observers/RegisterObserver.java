package observers;

import gui.FrameSkeleton;
import gui.RegisterFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RegisterObserver extends Observer{
//    private FrameSkeleton parentFrame = new RegisterFrame();

    public RegisterObserver(RegisterFrame registerFrame){
        this.parentFrame = registerFrame;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Register" -> stateDialog.registerUser(this.parentFrame.getLogin(), this.parentFrame.getPassword());
            case "Move back" -> stateDialog.registerMoveBack();
        }
    }
}
