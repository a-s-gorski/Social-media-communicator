package gui;

import javax.swing.*;

public abstract class FrameSkeleton extends JFrame implements FrameMethods{
    public void initGui(){}
    public void exitGui(){}



    public FrameSkeleton(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(640, 480);

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (Exception e) {}
    }
    public static void main(String[] args){ }
}
