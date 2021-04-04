package gui;

import observers.CheckInvitationsObserver;
import observers.Observer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CheckInvitationsFrame extends FrameSkeleton{
    private ArrayList<String> invitationSources = new ArrayList<>();
    private ArrayList<String> selectedInvitations = new ArrayList<>();
    private ArrayList<JButton> acceptButtons = new ArrayList<>();
    private ArrayList<JButton> declineButtons = new ArrayList<>();
    private JLabel totalInvitationsLabel = new JLabel("Total invitations : 0");
    private JButton refreshButton = new JButton("Update");
    private JButton moveBackButton = new JButton("Move Back");
    private Observer observer = new CheckInvitationsObserver(this);


    public void initGui(){
        for(int i = 0; i < 10; i++){
            invitationSources.add("user" + i);
        }


        for(int i = 0; i < 10; i++){
            acceptButtons.add(new JButton("Accept" + i));
            declineButtons.add(new JButton("Decline" + i));
        }

        this.updateSelectedMessages();

        System.out.println(selectedInvitations.size());

        this.updateInvitationsFeed();
        for(int i = 0; i < 10; i++){
            acceptButtons.get(i).addActionListener(observer);
            declineButtons.get(i).addActionListener(observer);
        }
        this.setVisible(true);



    }



    public void deleteInvitation(String sender){
        try{
            invitationSources.remove(sender);
            selectedInvitations.remove(sender);

        }catch (Exception temp_exception){
            // TODO - Exception handling
        }


    }


    private void updateSelectedMessages(){
        // using default copying constructor
        this.selectedInvitations = new ArrayList<>(invitationSources.stream().limit(10).collect(Collectors.toList()));

    }

    public ArrayList<String> getSelectedInvitations(){
        return this.selectedInvitations;
    }


    public void updateInvitationsFeed(){
        this.getContentPane().removeAll();
        this.repaint();
        this.setLayout(new GridLayout(24,1));

        this.updateSelectedMessages();


        for(int i = 0; i < selectedInvitations.size(); i++){
            this.add(new JLabel(selectedInvitations.get(i)));
            this.add(acceptButtons.get(i));
            this.add(declineButtons.get(i));

        }
        this.add(totalInvitationsLabel);
        this.add(refreshButton);
        this.add(moveBackButton);
        this.setVisible(true);

    }

}
