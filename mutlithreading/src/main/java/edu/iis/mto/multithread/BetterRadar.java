package edu.iis.mto.multithread;

public class BetterRadar {

    private PatriotBattery battery;
    private PatriotLauncher launcher;
    private int numberOfRockets;

    public BetterRadar(PatriotBattery battery, int numberOfRockets) {
        this.battery = battery;
        this.launcher = new PatriotLauncher();
        this.numberOfRockets = numberOfRockets;
    }

    public void notice(Scud enemyMissle) {
        launchPatriot(enemyMissle);
    }

    private void launchPatriot(Scud enemyMissle) {
        launcher.launch(battery, enemyMissle, numberOfRockets);
    }
}
