package observers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class MainMenuObserver extends Observer{

    public MainMenuObserver(JFrame parentFrame) {
        super(parentFrame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame parentFrame;
        String s = e.getActionCommand();
        switch (s) {
            case "Login" -> System.out.println("log");
            case "Register" -> System.out.println("reg");
            case "Exit" -> this.parentFrame.dispatchEvent(new WindowEvent(this.parentFrame, WindowEvent.WINDOW_CLOSING));
        }

    }
}
