package com.tugalsan.tst.swingworker;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        var frame = new JFrame("diddly dialog");
        var button = new JButton("start");
        button.addActionListener(evt -> {
            var processDialog = new ProgressDialog();
            var sw = new SwingWorkerImpl(processDialog);
            sw.execute();
            processDialog.setVisible(true);
        });
        frame.add(button);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
