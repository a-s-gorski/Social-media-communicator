package gui;

import observers.FindFriendObserver;
import observers.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.LinkedList;

public class FindFriendFrame extends FrameSkeleton {
    private JLabel titleLabel = new JLabel("Find friends");
    private JLabel searchLabel = new JLabel("Insert search input");
    private JTextField searchTextField = new JTextField("src");
    private JTextField searchButton = new JTextField("Search");
    private JLabel selectFriend = new JLabel("Select friend");
    private JComboBox friendsComboBox = new JComboBox();
    private JButton sendInvitationButton = new JButton("Send invitation");
    private JButton updateButton = new JButton("Update");
    private JButton moveBackButton = new JButton("Move back");

    private Observer observer = new FindFriendObserver(this);
    private ArrayList<String> selectedFriends = new ArrayList<String>();

    public void updateFindFriend(){
        // TODO - get results from db

        this.friendsComboBox = new JComboBox(this.selectedFriends.toArray(new String[0]));

    }

    @Override
    public void sendInvitation(){
        // TODO - implement sending invitations

    }


    public void initGui(){
        this.selectedFriends.add("John");
        this.selectedFriends.add("matilda");


        this.setLayout(new GridLayout(9,1));
//        String[] temp = this.example_friends.toArray(new String[0]);
        this.friendsComboBox = new JComboBox(this.selectedFriends.toArray(new String[0]));


        this.add(titleLabel);
        this.add(searchLabel);
        this.add(searchTextField);
        this.add(searchButton);
        this.add(selectFriend);
        this.add(friendsComboBox);
        this.add(sendInvitationButton);
        this.add(updateButton);
        this.add(moveBackButton);

        this.searchButton.addActionListener(observer);
        this.sendInvitationButton.addActionListener(observer);
        this.moveBackButton.addActionListener(observer);


        this.setVisible(true);
    }

}
