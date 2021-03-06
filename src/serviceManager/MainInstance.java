package serviceManager;

import states.MainMenuState;
import states.State;

public class MainInstance {
    private static final MainInstance singletonInstance = new MainInstance();
    private State state = new MainMenuState();
    private String login;
    private String password;
//    private FrameInterface gui = new MainMenuFrame();




    synchronized public static MainInstance getInstance(){
        return singletonInstance;
    }
    public void setState(State new_state){
        this.state = new_state;
    }
    public State getState(){
        return this.state;
    }
    public void setLogin(String login){this.login=login;}
    public void setPassword(String password){this.password=password;}

    public boolean ifLogin(String login, String password){
        // TODO - implement login
        if(login.isEmpty() || password.isEmpty()){
            return false;
        }


        System.out.println(login + " " + password);
        return true;
    }

    private MainInstance(){
        state.initiateGui();

    }

}
