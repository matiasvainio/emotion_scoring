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

    public List read() throws IOException {
        CSVParser csvParser = new CSVParserBuilder().withSeparator(' ').build();
        try (CSVReader reader = new CSVReaderBuilder(
                new FileReader("src/main/java/emotionScoring/origin_of_species.csv"))
                .withCSVParser(csvParser)
                .build()) {
            return reader.readAll();
        } catch (CsvException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List readLexicon() throws IOException {
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
