package emotionScoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> tunneSanat = new ArrayList<Object>(["Anger","Anticipation","Disgust","Fear","Joy","Sadness","Surprisem", "Trust"]);
        String s = "lorem ipsum dolor sit amet";

        List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));
        System.out.println(myList);
    }
}

class Emotion {
    String word;
    int count;

    public Emotion(String word, int count){
        word = word;
        count = count;
    }
}