package serviceManager;

import gui.FrameInterface;
import gui.MainMenuFrame;
import states.MainMenuState;
import states.State;

import javax.swing.*;

public class mainInstance {
    private static final mainInstance singletonInstance = new mainInstance();
    private State state = new MainMenuState();
    private FrameInterface gui = new MainMenuFrame();




    synchronized public static mainInstance getInstance(){
        return singletonInstance;
    }
    public void changeState(State new_state){
        this.state = new_state;
    }
    public State getState(){
        return this.state;
    }

    private mainInstance(){
        System.out.println("hello");
        gui.initGui();
    }

}
