package fkubala.gui;

import fkubala.logic.CmdOperations;

import javax.swing.*;
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

    public ActionListener startCAEWithScriptAction(final MainWindow mainWindowInstance) {
        return new ActionListener() {
            MainWindow mainWindow = mainWindowInstance;
            JFileChooser jfc = mainWindow.getjFCchooseScriptFile();
            String pathToScript = null;

            public void actionPerformed(ActionEvent e) {
                int returnVal = jfc.showDialog(mainWindow.getContent(), "Choose");
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    System.out.println(mainWindow.getjFCchooseScriptFile().getSelectedFile().getAbsolutePath());
                    pathToScript = jfc.getSelectedFile().getAbsolutePath();
                }
                try {
                    CmdOperations.startCAEWithScript(pathToScript);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        };
    }


}
