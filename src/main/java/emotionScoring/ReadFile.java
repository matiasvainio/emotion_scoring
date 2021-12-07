package emotionScoring;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReadFile {

    public void read() throws IOException {
        try (CSVReader reader = new CSVReader(new FileReader("src/main/java/emotionScoring/lexicon.csv"))) {
            List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));
        } catch (CsvException e) {
            e.printStackTrace();
        }
    }
}
