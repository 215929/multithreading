package edu.iis.mto.multithread;

public class BetterRadar {

    private PatriotBattery battery;
    private PatriotLauncher launcher;

    public BetterRadar(PatriotBattery battery) {
        this.battery = battery;
        this.launcher = new PatriotLauncher();
    }

    public void notice(Scud enemyMissle) {
        launchPatriot(enemyMissle);
    }

    private void launchPatriot(Scud enemyMissle) {
        launcher.launch(battery, enemyMissle);
    }
}
