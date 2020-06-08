package edu.iis.mto.multithread;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class RadarTest {

    @Test
    void launchPatriotOnceWhenNoticesAScudMissle() {
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        BetterRadar radar = new BetterRadar(batteryMock, 1);
        Scud enemyMissle = new Scud();
        radar.notice(enemyMissle);
        verify(batteryMock, timeout(100).times(1)).launchPatriot(enemyMissle);
    }
}
