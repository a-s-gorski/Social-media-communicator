package gui;

import observers.Observer;

import javax.swing.*;
import java.awt.*;

public class LoggedUserMenuFrame extends FrameSkeleton {
    private JLabel titleLabel = new JLabel("Please select next");
    private JButton findFriendButton = new JButton("Find friend");
    private JButton receiveInvitationButton = new JButton("Check invitations");
    private JButton selectMessageFeedButton = new JButton("Select Message Feed");

    public void initGui(){
        this.setLayout(new GridLayout(4, 1));
        this.add(titleLabel);
        this.add(findFriendButton);
        this.add(receiveInvitationButton);
        this.add(selectMessageFeedButton);
        this.setVisible(true);
    }

}
