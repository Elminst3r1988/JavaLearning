import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class JokeFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs) throws IOException {
        String fileName = file + "\\joke.java";
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write("public class Main {\n" +
                    "    public static void main(String[] args) throws IOException {\n" +
                    "        System.out.println(\"Hello World!\");\n" +
                    "    }\n" +
                    "}");
        }

        return FileVisitResult.CONTINUE;
    }


}

