/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import gui.GlavniProzor;

/**
 *
 * @author tadija
 */
public class ExitProgramAction {

    public void exitAction() {
        GlavniProzor.getInstance().dispose();
    }
}
