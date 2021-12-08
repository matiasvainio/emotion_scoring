package emotionScoring;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Emotion[] emotions = new Emotion[10];


        Emotion positive = new Emotion("Positive", 0);
        Emotion negative = new Emotion("Negative", 0);
        Emotion anger = new Emotion("Anger", 0);
        Emotion anticipation = new Emotion("Anticipation", 0);
        Emotion disgust = new Emotion("Disgust", 0);
        Emotion fear = new Emotion("Fear", 0);
        Emotion joy = new Emotion("Joy", 0);
        Emotion sadness = new Emotion("Sadness", 0);
        Emotion surprise = new Emotion("Surprise", 0);
        Emotion trust = new Emotion("Trust", 0);

        emotions[0] = positive;
        emotions[1] = negative;
        emotions[2] = anger;
        emotions[3] = anticipation;
        emotions[4] = disgust;
        emotions[5] = fear;
        emotions[6] = joy;
        emotions[7] = sadness;
        emotions[8] = surprise;
        emotions[9] = trust;

        ReadFile rf = new ReadFile();
        List<String[]> lexicon = rf.readLexicon();
        List<String[]> list = rf.read();


        for (String s : list.get(0)) {
            lexicon.forEach(x -> {
                if (x[0].equalsIgnoreCase(s)) {
                    for (int i = 1; i < x.length; i++) {
                        if (x[i].equals("1")) {
                            emotions[i - 1].count++;
                        }
                    }
                }
            });
        }

        System.out.println(Arrays.toString(emotions));
    }
}
