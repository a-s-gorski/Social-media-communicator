package states;

import gui.FrameSkeleton;
import gui.MainMenuFrame;

public class MainMenuState extends State{
    FrameSkeleton frameSkeleton = new MainMenuFrame();
    public void initiateGui(){
        frameSkeleton.initGui();
    };

    public void exitGui(){
        frameSkeleton.exitGui();
    }
//    public void changeState(){};
}
