package gui;

import javax.swing.*;

public abstract class FrameInterface extends JFrame {
    public void initGui(){}
    public void exitGui(){}



    public FrameInterface(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640, 480);

        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}
    }
    public static void main(String[] args){ }
}
