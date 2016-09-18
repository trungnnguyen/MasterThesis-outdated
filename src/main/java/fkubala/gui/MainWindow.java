package fkubala.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Filip on 2016-07-21.
 */
public class MainWindow {
    private Container content;
    private static MainWindow mainWindow = null;
    private JFrame mainFrame;
    private JButton btnStartCAE;
    private static final Dimension frameSize = new Dimension(500,600);
    private static final Dimension startCAESize = new Dimension(20,60);

    private MainWindow(){

        mainFrame = new JFrame("Master thesis by F.Kubala");
        btnStartCAE = new JButton("Start CAE");

        content = mainFrame.getContentPane();
        content.setLayout(new BorderLayout());
        mainFrame.setSize(frameSize);

        addComponentsToPane(content);

        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public static MainWindow createMainWindow() {
        if (mainWindow == null)
            return new MainWindow();
        return mainWindow;
    }

    public void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        btnStartCAE = new JButton("Start CAE");
        btnStartCAE.setAlignmentX(Component.LEFT_ALIGNMENT);
        btnStartCAE.addActionListener(Actions.startCAEAction());
        pane.add(btnStartCAE);
    }


}
