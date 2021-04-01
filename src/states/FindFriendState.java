package states;

import gui.FrameSkeleton;
import gui.LoggedUserMenuFrame;

public class FindFriendState extends State{
    private FrameSkeleton frameSkeleton = new LoggedUserMenuFrame();
    public void initiateGui(){frameSkeleton.initGui();}
    public void exitGui(){frameSkeleton.exitGui();}
}
