package emotionScoring;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ReadFile rf = new ReadFile();
        List<String[]> lexicon = rf.readLexicon();
        List<String[]> list = rf.read();

        List<String[]> arr = new ArrayList<>();
        for (String[] strings : list) {
            Emotions emotions = new Emotions("1");
            for (String s : strings) {
                lexicon.forEach(x -> {
                    if (x[0].equalsIgnoreCase(s)) {
                        for (int i = 1; i < x.length; i++) {
                            if (x[i].equals("1")) {
                                emotions.getEmotions()[i - 1].count++;
                            }
                        }
                    }
                });
            }
//            System.out.println(Arrays.toString(emotions.getEmotions()));
            for (int i = 0; i < emotions.getEmotions().length; i++)  {
                emotions.getEmotions()[i].count = emotions.getEmotions()[i].count * 1000 / strings.length;
            }
            arr.add(emotions.getEmotionsStringArray());
        }
        writeDataLineByLine(arr);
    }

    public static void writeDataLineByLine(List<String[]> data) {
        // first create file object for file placed at location
        // specified by filepath
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter("src/main/java/emotionScoring/output_rep.csv");

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // adding header to csv
            String[] header = {"Positive", "Negative", "Anger", "Anticipation", "Disgust", "Fear", "Joy", "Sadness", "Surprise", "Trust", "REP (1)/DEM (0)"};
            writer.writeNext(header);

            // add data to csv
            for (String[] datum : data) {
                System.out.println(Arrays.toString(datum));
                writer.writeNext(datum);
            }

            // closing writer connection
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
