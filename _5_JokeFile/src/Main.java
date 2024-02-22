import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String rootFile = "F:\\Java";
        File dir = new File(rootFile);
        JokeCreator jokeCreator = new JokeCreator();
        jokeCreator.searchFiles(dir);
    }
}


