package emotionScoring;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadFile {

    public List<String[]> read() throws IOException {
        CSVParser csvParser = new CSVParserBuilder().withSeparator(' ').build();
        try (CSVReader reader = new CSVReaderBuilder(
                new FileReader("src/main/java/emotionScoring/republikaanit.csv"))
                .withCSVParser(csvParser)
                .build()) {
            return reader.readAll();
        } catch (CsvException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String[]> readLexicon() throws IOException {
        CSVParser csvParser = new CSVParserBuilder().withSeparator(',').build();
        try (CSVReader reader = new CSVReaderBuilder(
                new FileReader("src/main/java/emotionScoring/lexicon.csv"))
                .withCSVParser(csvParser)
                .build()) {
            return reader.readAll();
        } catch (CsvException e) {
            e.printStackTrace();
        }
        return null;
    }
}
