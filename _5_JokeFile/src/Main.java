import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String rootFolder = "F:\\Java";
        File dir = new File(rootFolder);
        JokeCreator jokeCreator = new JokeCreator();
        jokeCreator.searchFolders(dir);
    }
}


