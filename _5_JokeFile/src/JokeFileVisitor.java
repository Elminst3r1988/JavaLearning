import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class JokeFileVisitor extends SimpleFileVisitor<Path> {
    private final String HELLO_WORLD_TEXT = "public class Main {\n" +
            "    public static void main(String[] args) throws IOException {\n" +
            "        System.out.println(\"Hello World!\");\n" +
            "    }\n" +
            "}";

    @Override
    public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs) throws IOException {
        Path fileName = Paths.get(file + File.separator + "joke.java");
        Files.write(fileName, HELLO_WORLD_TEXT.getBytes());

        return FileVisitResult.CONTINUE;
    }
}


