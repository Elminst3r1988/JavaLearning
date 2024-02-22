import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class JokeFileVisitor extends SimpleFileVisitor<Path> {
    private final String helloWorld = "public class Main {\n" +
            "    public static void main(String[] args) throws IOException {\n" +
            "        System.out.println(\"Hello World!\");\n" +
            "    }\n" +
            "}";

    private FileWriter fileWriter;

    @Override
    public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs) throws IOException {
        String fileName = file + File.separator + "joke.java";
        Files.write(Paths.get(fileName), helloWorld.getBytes());

        return FileVisitResult.CONTINUE;
    }
}


