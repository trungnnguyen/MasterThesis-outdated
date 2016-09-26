package fkubala.gui;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Filip on 2016-07-21.
 */
public class MainWindow {
    private Container content;
   // private static MainWindow mainWindow = null;
    private JFrame mainFrame;
    private JButton btnStartCAE;
    private JButton btnStartCAEWithScript;
    private JButton btnChooseFile;

    private JFileChooser jFCchooseScriptFile;
    private static final Dimension frameSize = new Dimension(500, 600);
    private static final Dimension startCAESize = new Dimension(20, 60);

    public MainWindow() {

        mainFrame = new JFrame("Master thesis by F.Kubala");

        content = mainFrame.getContentPane();
        content.setLayout(new BorderLayout());
        mainFrame.setSize(frameSize);

        addComponentsToPane(content);

        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public void addComponentsToPane(Container pane) {
        Actions actions = new Actions();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        btnStartCAE = new JButton("Start CAE");
        btnStartCAEWithScript = new JButton("Start CAE with script");
        btnChooseFile = new JButton("Choose script file");
        jFCchooseScriptFile = new JFileChooser();

        btnStartCAE.setAlignmentX(Component.LEFT_ALIGNMENT);
        btnStartCAE.addActionListener(Actions.startCAEAction());
        btnStartCAEWithScript.setAlignmentX(Component.LEFT_ALIGNMENT);
        btnStartCAEWithScript.addActionListener(actions.startCAEWithScriptAction(this));

        pane.add(btnStartCAE);
        pane.add(btnStartCAEWithScript);
    }

    public JFileChooser getjFCchooseScriptFile() {
        return jFCchooseScriptFile;
    }

    public Container getContent() {
        return content;
    }
}
