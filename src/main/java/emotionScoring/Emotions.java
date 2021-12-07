package emotionScoring;

import java.util.ArrayList;

public class Emotions {

    public Emotions() {

    }

    public Emotion[] initArray() {

        Emotion[] emotions = new Emotion[8];
        Emotion anger = new Emotion("Anger", 0);
        Emotion anticipation = new Emotion("Anticipation", 0);
        Emotion disgust = new Emotion("Disgust", 0);
        Emotion fear = new Emotion("Fear", 0);
        Emotion joy = new Emotion("Joy", 0);
        Emotion sadness = new Emotion("Sadness", 0);
        Emotion surprise = new Emotion("Surprise", 0);
        Emotion trust = new Emotion("Trust", 0);

        emotions[0] = anger;
        emotions[1] = anticipation;
        emotions[2] = disgust;
        emotions[3] = fear;
        emotions[4] = joy;
        emotions[5] = sadness;
        emotions[6] = surprise;
        emotions[7] = trust;

        return emotions;
    }

}
