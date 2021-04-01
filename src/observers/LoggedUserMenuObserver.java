package observers;

import gui.LoggedUserMenuFrame;
import gui.LoginFrame;
import serviceManager.MainInstance;

import java.awt.event.ActionEvent;

public class LoggedUserMenuObserver extends Observer{
    public LoggedUserMenuObserver(LoggedUserMenuFrame parent_Frame){
        this.parentFrame = parent_Frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MainInstance mainInstance = MainInstance.getInstance();
        switch (e.getActionCommand()){
            case "Find friend" -> stateDialog.moveLoggedMainMenuToFindFriend();
            case "Logout" -> stateDialog.moveLoggedUserMenuToLogin();

        }


    }
}
