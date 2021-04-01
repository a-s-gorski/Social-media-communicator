package observers;

import gui.FindFriendFrame;

import java.awt.event.ActionEvent;

public class FindFriendObserver extends Observer{
    public FindFriendObserver(FindFriendFrame findFriendFrame){
        this.parentFrame = findFriendFrame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case "Search" -> this.parentFrame.updateFindFriend();
            case "Send invitation" -> this.parentFrame.sendInvitation();
            case "Move back" -> this.stateDialog.moveFindFriendToLoggedUserMenu();
        }

    }


}
