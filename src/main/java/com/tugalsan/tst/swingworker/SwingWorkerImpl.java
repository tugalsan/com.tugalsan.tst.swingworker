package com.tugalsan.tst.swingworker;

import java.util.List;
import javax.swing.SwingWorker;

public class SwingWorkerImpl extends SwingWorker<Void, Integer> {

    public SwingWorkerImpl(ProgressDialog processDialog) {
        this.processDialog = processDialog;
    }
    private ProgressDialog processDialog;

    @Override
    public Void doInBackground() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
                publish(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void done() {
        processDialog.setVisible(false);
        processDialog.dispose();
    }

    @Override
    protected void process(List<Integer> ints) {
        processDialog.setProgress(ints.get(0));
    }
}
