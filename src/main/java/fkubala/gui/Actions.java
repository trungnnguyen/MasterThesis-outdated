package fkubala.gui;

import fkubala.logic.CmdOperations;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Filip on 2016-09-18.
 */
public class Actions {

    public static ActionListener startCAEAction() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    CmdOperations.startCAE();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        };
    }


}
