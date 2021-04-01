package observers;

import gui.CheckInvitationsFrame;
import gui.FindFriendFrame;

import java.awt.event.ActionEvent;

public class CheckInvitationsObserver extends Observer{
    private CheckInvitationsFrame parentFrame;

    public CheckInvitationsObserver(CheckInvitationsFrame checkInvitationsFrame){
        this.parentFrame = checkInvitationsFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        char[] command = s.toCharArray();
        if(command[0] == 'A'){
            if(Character.isDigit(s.charAt(s.length()-1))){
                // TODO - continue from passing it to parent frame, then implement accapt/delete skeleton and finally remove invite and move further


            }


        }

    }
}
