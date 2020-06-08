package edu.iis.mto.multithread;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class RadarTest {

    PatriotBattery batteryMock;
    Scud enemyMissle;

    @BeforeEach
    void init() {
        batteryMock= mock(PatriotBattery.class);
        enemyMissle = new Scud();
    }

    @RepeatedTest(10)
    void launchPatriotOnceWhenNoticesAScudMissle() {
        BetterRadar radar = new BetterRadar(batteryMock, 1);
        radar.notice(enemyMissle);
        verify(batteryMock, timeout(100).times(1)).launchPatriot(enemyMissle);
    }

    @RepeatedTest(10)
    void launchPatriotTenTimesWhenNoticesAScudMissle() {
        BetterRadar radar = new BetterRadar(batteryMock, 10);
        radar.notice(enemyMissle);
        verify(batteryMock, timeout(100).times(10)).launchPatriot(enemyMissle);
    }

    @RepeatedTest(10)
    void launchPatriotZeroTimesWhenNoticesAScudMissle() {
        BetterRadar radar = new BetterRadar(batteryMock, 0);
        radar.notice(enemyMissle);
        verify(batteryMock, timeout(100).times(0)).launchPatriot(enemyMissle);
    }

}
