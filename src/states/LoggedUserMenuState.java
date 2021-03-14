package states;

import gui.FrameSkeleton;
import gui.LoggedUserMenuFrame;

public class LoggedUserMenuState extends State{
    private FrameSkeleton frameSkeleton = new LoggedUserMenuFrame();
    public void initiateGui() {
        frameSkeleton.initGui();
    }
}
