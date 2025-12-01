package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    public void classifyEnergyTest() {
        String high = PlaylistRecommender.classifyEnergy(java.util.List.of(140, 150, 160));
        String medium = PlaylistRecommender.classifyEnergy(java.util.List.of(90, 100, 110));
        String low = PlaylistRecommender.classifyEnergy(java.util.List.of(40, 50, 60));
        assertTrue(high.equals("HIGH"));
        assertTrue(medium.equals("MEDIUM"));
        assertTrue(low.equals("LOW"));
    }


    @Test
    public void isValidTrackTitleTest() {
        boolean valid = PlaylistRecommender.isValidTrackTitle("Valid Title");
        boolean invalid = PlaylistRecommender.isValidTrackTitle("Invalid@Title!");
        boolean empty = PlaylistRecommender.isValidTrackTitle("");
        boolean nullTitle = PlaylistRecommender.isValidTrackTitle(null);

        assertTrue(valid);
        assertFalse(invalid);
        assertFalse(empty);
        assertFalse(nullTitle);
    }

    @Test
    public void normalizeVolumeTest() {
        int normalizedLow = PlaylistRecommender.normalizeVolume(-10);
        int normalizedHigh = PlaylistRecommender.normalizeVolume(110);

        assertEquals(0, normalizedLow);
        assertEquals(100, normalizedHigh);
    }
}
