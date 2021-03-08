package states;

import gui.FrameInterface;
import gui.LoginFrame;

public class LoginState extends State{
    private FrameInterface frameInterface = new LoginFrame();

    public void initiateGui(){
        frameInterface.initGui();

    }
    public void exitGui(){
        frameInterface.exitGui();
    }
}
