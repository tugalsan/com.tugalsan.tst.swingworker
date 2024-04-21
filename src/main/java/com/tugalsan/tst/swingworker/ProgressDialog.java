package com.tugalsan.tst.swingworker;

import javax.swing.JDialog;
import javax.swing.JProgressBar;

public class ProgressDialog extends JDialog {

    public ProgressDialog() {
        setModal(true);
        bar = new JProgressBar();
        add(bar);
        pack();
    }
    private final JProgressBar bar;

    public void setProgress(int i) {
        bar.setValue(i);
    }
}
