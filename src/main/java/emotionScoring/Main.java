package emotionScoring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));
        //System.out.println(myList);

        ReadFile rf = new ReadFile();
        try {
            rf.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
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