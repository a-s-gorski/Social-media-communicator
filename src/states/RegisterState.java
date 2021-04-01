package states;

import gui.FrameSkeleton;
import gui.RegisterFrame;

public class RegisterState extends State{
    FrameSkeleton frameSkeleton = new RegisterFrame();
    public void initiateGui(){
        frameSkeleton.initGui();
    }
    public void exitGui(){
        frameSkeleton.exitGui();
    }
}
