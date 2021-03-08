package observers;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class Observer implements ActionListener {
    protected JFrame parentFrame;
    public Observer(JFrame parentFrame){
        this.parentFrame = parentFrame;
    }

}
