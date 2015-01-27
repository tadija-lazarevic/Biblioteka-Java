/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

/**
 *
 * @author tadija
 */
public class ActionManager {

    private ExitProgramAction exitProgramAction;

    public ActionManager() {
        exitProgramAction = new ExitProgramAction();
    }

    public ExitProgramAction getExitProgramAction() {
        return exitProgramAction;
    }

}
