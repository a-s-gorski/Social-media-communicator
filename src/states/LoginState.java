package states;

import gui.FrameSkeleton;
import gui.LoginFrame;

public class LoginState extends State{
    private FrameSkeleton frameSkeleton = new LoginFrame();

    public void initiateGui(){
        frameSkeleton.initGui();

    }
    public void exitGui(){
        frameSkeleton.exitGui();
    }
}
