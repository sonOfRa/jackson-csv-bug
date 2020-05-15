package de.slevermann.jackson.csv;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Demo {

    private static ObjectReader longReader;

    private static ObjectReader stringReader;

    @BeforeAll
    public static void before() {
        CsvMapper mapper = new CsvMapper();
        CsvSchema bootstrapSchema = mapper.schemaWithHeader()
                .withArrayElementSeparator(",")
                .withColumnSeparator(';')
                .withEscapeChar('"');
        longReader = mapper.readerFor(Model.class).with(bootstrapSchema);

        stringReader = mapper.readerFor(ModelWithString.class).with(bootstrapSchema);
    }

    @Test
    public void readLongs() throws IOException {
        Model model = longReader.readValue(getClass().getResource("/longs.csv"));
    }

    @Test
    public void readStrings() throws IOException {
        ModelWithString model = stringReader.readValue(getClass().getResource("/strings.csv"));
    }

}
