package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        
        if (bpms == null || bpms.size() == 0) {throw new UnsupportedOperationException("Invalid List");}

        int energy = 0;
        int count = 0;

        for (int bpm : bpms){
            energy += bpm;
            count++;}

        energy = energy/count;
        if (energy >= 140) {return "HIGH";}
        else if (energy >= 100) {return "MEDIUM";}
        else {return "LOW";}

    }

    public static boolean isValidTrackTitle(String title) {
        if (title == null || title.length() == 0) {return false;}
        if (title.length() > 30) {return false;}

        for (int i = 0; i < title.length(); i++){

            char letter = title.charAt(i);
            int ascii = (int) letter;

            if (!((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) || ascii == 32)) {return false;}
        }

        return true;

    }

    public static int normalizeVolume(int volumeDb) {
        if (volumeDb <= 0){return 0;}
        else if (volumeDb >= 100){return 100;}
        else {return volumeDb;}
    }
}
