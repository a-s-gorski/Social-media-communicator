package dialog;

import serviceManager.MainInstance;
import states.*;

public class StateDialog {
//    protected MainInstance mainInstance = MainInstance.getInstance();
//
//    public StateDialog(){
//        this.mainInstance = MainInstance.getInstance();
//    }

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
    public void moveLoginToMainMenu(){
        MainInstance mainInstance = MainInstance.getInstance();
        mainInstance.getState().exitGui();
        mainInstance.setState(new MainMenuState());
        mainInstance.getState().initiateGui();
    }

    public void moveLoggedUserMenuToLogin() {
//        System.out.println("hello");
        MainInstance mainInstance = MainInstance.getInstance();
        mainInstance.setLogin("");
        mainInstance.setPassword("");
        mainInstance.getState().exitGui();
        mainInstance.setState(new LoginState());
        mainInstance.getState().initiateGui();

    }

    public void registerUser(String login, String password){
        // TODO - add user to batabase
        System.out.println(login + " " + password);
        //
        MainInstance mainInstance = MainInstance.getInstance();
        mainInstance.getState().exitGui();
        mainInstance.setState(new MainMenuState());
        mainInstance.getState().initiateGui();
    }

    public void registerMoveBack(){
        MainInstance mainInstance = MainInstance.getInstance();
        mainInstance.getState().exitGui();
        mainInstance.setState(new MainMenuState());
        mainInstance.getState().initiateGui();
    }

    public void moveMainMenuToRegister(){
        MainInstance mainInstance = MainInstance.getInstance();
        mainInstance.getState().exitGui();
        mainInstance.setState(new RegisterState());
        mainInstance.getState().initiateGui();
    }

    public void moveLoggedMainMenuToFindFriend(){
        MainInstance mainInstance = MainInstance.getInstance();
        mainInstance.getState().exitGui();
        mainInstance.setState(new FindFriendState());
        System.out.println("hello");
        mainInstance.getState().initiateGui();

    }

    public void moveFindFriendToLoggedUserMenu() {
        MainInstance mainInstance = MainInstance.getInstance();
        mainInstance.getState().exitGui();
        mainInstance.setState(new LoggedUserMenuState());
        mainInstance.getState().initiateGui();
    }

    public void moveLoggedMainMenuToCheckInvitations() {
        MainInstance mainInstance = MainInstance.getInstance();
        mainInstance.getState().exitGui();
        mainInstance.setState(new CheckInvitationsState());
        mainInstance.getState().initiateGui();
    }
}
