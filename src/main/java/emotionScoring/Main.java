package emotionScoring;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Emotions emotions = new Emotions();
        emotions.initArray();

        for (Emotion em : emotions
             ) {

        }

        ReadFile rf = new ReadFile();
        try {
            rf.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
