package states;

import gui.FindFriendFrame;
import gui.FrameSkeleton;
import gui.LoggedUserMenuFrame;

public class FindFriendState extends State{
    private FrameSkeleton frameSkeleton = new FindFriendFrame();
    public void initiateGui(){frameSkeleton.initGui();}
    public void exitGui(){frameSkeleton.exitGui();}
}
