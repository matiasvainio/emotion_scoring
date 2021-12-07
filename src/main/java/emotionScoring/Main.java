package emotionScoring;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        ReadFile rf = new ReadFile();
        List<String[]> list = rf.read();
        // list.forEach(x -> System.out.println(Arrays.toString(x)));
        for (String s : list.get(0)) {
            System.out.println(s);
        }
    }
}
