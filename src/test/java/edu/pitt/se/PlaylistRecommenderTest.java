package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    public void classifyEnergyTest() {
        String high = PlaylistRecommender.classifyEnergy(150);
        String medium = PlaylistRecommender.classifyEnergy(100);
        String low = PlaylistRecommender.classifyEnergy(50);

        assertTrue(high.equals("HIGH"));
        assertTrue(medium.equals("MEDIUM"));
        assertTrue(low.equals("LOW"));
    }


    @Test
    public void isValidTrackTitleTest() {
        boolean valid = PlaylistRecommender.isValidTrackTitle("Valid Title");
        boolean invalid = PlaylistRecommender.isValidTrackTitle("Invalid@Title!");

        assertTrue(valid);
        assertFalse(invalid);
    }

    @Test
    public void normalizeVolumeTest() {
        int normalizedLow = PlaylistRecommender.normalizeVolume(-10);
        int normalizedHigh = PlaylistRecommender.normalizeVolume(110);

        assertEquals(0, normalizedLow);
        assertEquals(100, normalizedHigh);
    }
}
