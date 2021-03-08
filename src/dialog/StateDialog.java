package dialog;

import serviceManager.mainInstance;
import states.LoginState;
import states.State;

public class StateDialog {
    public void moveMainMenuToLogin(){
        mainInstance mainInstance = serviceManager.mainInstance.getInstance();
        mainInstance.getState().exitGui();
        mainInstance.setState(new LoginState());
        mainInstance.getState().initiateGui();
    }
}
