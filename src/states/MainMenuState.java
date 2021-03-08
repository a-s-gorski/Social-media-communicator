package states;

import gui.FrameInterface;
import gui.MainMenuFrame;

import javax.swing.*;

public class MainMenuState extends State{
    FrameInterface frameInterface = new MainMenuFrame();
    public void initiateGui(){
        frameInterface.initGui();
    };

    public void exitGui(){
        frameInterface.exitGui();
    }
//    public void changeState(){};
}
