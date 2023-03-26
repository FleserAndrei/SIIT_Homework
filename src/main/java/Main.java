import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        TreeSet<Athlete> athletes = new TreeSet<Athlete>();

        StringBuilder builder = new StringBuilder();

        BufferedReader buffer = new BufferedReader(
                new FileReader("E:\\input.csv"));

        String reading;

        while ((reading = buffer.readLine()) != null) {
            builder.append(reading).append("\n");
        }

        System.out.println(builder);

        String athletes_file = builder.toString();

    }

}
