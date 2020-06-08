package edu.iis.mto.multithread;

class PatriotLauncher {
    void launch(PatriotBattery battery, Scud enemyMissle, int numberOfRockets) {
        Runnable launchPatriotTask = () -> {
            for (int i = 0; i < numberOfRockets; i++) {
                battery.launchPatriot(enemyMissle);
            }
        };

        Thread launchingThread = new Thread(launchPatriotTask);
        launchingThread.start();
    }
}
