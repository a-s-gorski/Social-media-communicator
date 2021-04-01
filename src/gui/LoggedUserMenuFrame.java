package gui;

import observers.LoggedUserMenuObserver;
import observers.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class LoggedUserMenuFrame extends FrameSkeleton {
    private JLabel titleLabel = new JLabel("Please select next");
    private JButton findFriendButton = new JButton("Find friend");
    private JButton receiveInvitationButton = new JButton("Check invitations");
    private JButton selectMessageFeedButton = new JButton("Select Message Feed");
    private JButton logoutButton = new JButton("Logout");
    private Observer observer = new LoggedUserMenuObserver(this);

    public void initGui(){
        this.setLayout(new GridLayout(5, 1));
        this.add(titleLabel);
        this.add(findFriendButton);
        this.add(receiveInvitationButton);
        this.add(selectMessageFeedButton);
        this.add(logoutButton);
        this.logoutButton.addActionListener(observer);
        this.receiveInvitationButton.addActionListener(observer);
        this.findFriendButton.addActionListener(observer);
        this.selectMessageFeedButton.addActionListener(observer);
        this.setVisible(true);
    }
    public void exitGui(){
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

}
