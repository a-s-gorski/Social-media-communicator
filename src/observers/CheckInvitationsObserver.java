package observers;

import gui.CheckInvitationsFrame;
import gui.FindFriendFrame;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

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
            System.out.println("A");
            if(Character.isDigit(s.charAt(s.length()-1))){
                // TODO - continue from passing it to parent frame, then implement accapt/delete skeleton and finally remove invite and move further
                System.out.println("B");
///*
                int invitation_id = s.charAt(s.length() - 1) - 48;
//*/
                System.out.println(invitation_id);
                String invitation = this.parentFrame.getSelectedInvitations().get(invitation_id);
                this.parentFrame.deleteInvitation(invitation);
                this.parentFrame.updateInvitationsFeed();


            }


        }

    }
}
