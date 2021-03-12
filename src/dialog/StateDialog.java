package dialog;

import serviceManager.MainInstance;
import states.LoggedUserMenuState;
import states.LoginState;

public class StateDialog {
    public void moveMainMenuToLogin(){
        MainInstance mainInstance = MainInstance.getInstance();
        mainInstance.getState().exitGui();
        mainInstance.setState(new LoginState());
        mainInstance.getState().initiateGui();
    }
    public void moveLoginToLoggedUserMenu(){
        MainInstance mainInstance = MainInstance.getInstance();
        mainInstance.getState().exitGui();
        mainInstance.setState(new LoggedUserMenuState());
        mainInstance.getState().initiateGui();

    }
}
