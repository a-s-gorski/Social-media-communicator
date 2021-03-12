package observers;

import dialog.StateDialog;
import gui.FrameSkeleton;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class Observer implements ActionListener {
    protected FrameSkeleton parentFrame;
    protected StateDialog stateDialog = new StateDialog();
    public Observer(FrameSkeleton parentFrame){
        this.parentFrame = parentFrame;
    }

    public Observer() {
    }
}
