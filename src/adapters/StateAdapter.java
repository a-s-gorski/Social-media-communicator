package adapters;

import states.LoginState;
import states.State;

public class StateAdapter {
    public State MainMenuToLogin(State MainMenuState){
//        State loginState = new LoginState();
        return new LoginState();
    }
}
