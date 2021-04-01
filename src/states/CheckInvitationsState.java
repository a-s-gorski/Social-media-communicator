package states;

import gui.CheckInvitationsFrame;
import gui.FrameSkeleton;

public class CheckInvitationsState extends State {
    private final FrameSkeleton frameSkeleton = new CheckInvitationsFrame();

    public void initiateGui() {
        frameSkeleton.initGui();
    }

    public void exitGui() {
        frameSkeleton.exitGui();
    }
}
