package org.dti.bluecross;

public class FanControlInvoker {
    Cord currentCord;

    public void setCord(Cord cord) {
        this.currentCord = cord;
    }

    public void executeSelectedCommand() {
        currentCord.pull();
    }
}
