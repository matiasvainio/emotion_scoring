package emotionScoring;

public class Emotion {
    String word;
    int count;

    public Emotion(String w, int c){
        word = w;
        count = c;
    }

    @Override
    public String toString() {
        return "Emotion{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
