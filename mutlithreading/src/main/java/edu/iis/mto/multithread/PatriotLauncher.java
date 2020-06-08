package edu.iis.mto.multithread;

public class PatriotLauncher {
    void launch(PatriotBattery battery, Scud enemyMissle) {
        Runnable launchPatriotTask = () -> {
            for (int i = 0; i < 10; i++) {
                battery.launchPatriot(enemyMissle);
            }
        };

        Thread launchingThread = new Thread(launchPatriotTask);
        launchingThread.start();
    }
}
