package gui;

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


    public void initGui(){
        for(int i = 0; i < 100; i++){
            invitationSources.add("user" + i);
        }


        for(int i = 0; i < 10; i++){
            acceptButtons.add(new JButton("Accept" + i));
            declineButtons.add(new JButton("Decline" + i));
        }

        this.updateSelectedMessages();

        System.out.println(selectedInvitations.size());

        this.updateInvitationsFeed();
        this.setVisible(true);



    }



    private void deleteInvitation(String sender){
        try{
            invitationSources.remove(sender);
            selectedInvitations.remove(sender);

        }catch (Exception temp_exception){
            // TODO - Exception handling
        }


    }


    private void updateSelectedMessages(){
        // using default copying constructor
        selectedInvitations = new ArrayList<>(invitationSources.stream().limit(10).collect(Collectors.toList()));

    }

    private void updateInvitationsFeed(){
        this.getContentPane().removeAll();
        this.repaint();
        this.setLayout(new GridLayout(12,3));

        for(int i = 0; i < selectedInvitations.size(); i++){
            this.add(new JLabel(selectedInvitations.get(i)));
            this.add(acceptButtons.get(i));
            this.add(declineButtons.get(i));



        }
        this.add(totalInvitationsLabel);
        this.add(refreshButton);
        this.add(moveBackButton);

    }

}
