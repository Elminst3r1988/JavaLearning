import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JokeCreator {
    public void searchFolders(File rootFolder) throws IOException {
        if (rootFolder.isDirectory()) {
            createJokeFile(rootFolder);
            File[] directoryFiles = rootFolder.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFolders(file);
                        createJokeFile(file);
                    }
                }
            }
        }
    }

    public void createJokeFile(File folder) throws IOException {
        String fileName = folder.getAbsolutePath() + File.separator + "joke.java";

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write("public class Main {\n" +
                    "    public static void main(String[] args) throws IOException {\n" +
                    "        System.out.println(\"Hello World!\");\n" +
                    "    }\n" +
                    "}");
        }
    }
}
