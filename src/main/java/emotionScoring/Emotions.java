package emotionScoring;

public class Emotions {
    Emotion[] emotions;
    String demRep;

    public Emotions(String foobar) {
        this.emotions = new Emotion[10];
        this.demRep = foobar;

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
    }

    public Emotion[] getEmotions() {
        return this.emotions;
    }

    public String[] getEmotionsStringArray() {
        String[] arr = new String[11];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = String.valueOf(emotions[i].count);
        }
        arr[10] = demRep;
        return arr;
    }
}
