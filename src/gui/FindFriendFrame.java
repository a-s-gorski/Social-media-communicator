package gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FindFriendFrame extends FrameSkeleton {
    private JLabel titleLabel = new JLabel("Find friends");
    private JLabel searchLabel = new JLabel("Insert search input");
    private JTextField searchTextField = new JTextField("src");
    private JLabel selectFriend = new JLabel("Select friend");
    private ArrayList example_friends = new ArrayList<String>();
    private JComboBox friendsComboBox = new JComboBox();
    private JButton sendInvitationButton = new JButton("Send invitation");

    public void initGui(){
        this.example_friends.add("John");
        this.example_friends.add("matilda");


        this.setLayout(new GridLayout(6,1));
        this.add(titleLabel);
        this.add(searchLabel);
        this.add(searchTextField);
        this.add(selectFriend);
        this.add(friendsComboBox);
        this.add(sendInvitationButton);
        this.setVisible(true);
    }

}
