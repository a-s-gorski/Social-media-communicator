package gui;

import javax.swing.*;
import java.awt.event.WindowEvent;

public abstract class FrameSkeleton extends JFrame implements FrameMethods{
    public void initGui(){}
    public void exitGui(){
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
    public String getLogin(){return null;}
    public String getPassword(){return null;}



    public FrameSkeleton(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(640, 480);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}
    }



    public static void main(String[] args){ }
}
