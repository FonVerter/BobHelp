import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class adn {



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Path sourceDirectory = Path.of(scanner.nextLine());
            Path targetDirectory = Path.of(scanner.nextLine());

            try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
                for (Path path : files) {
                    if (Files.isRegularFile(path)) {
                        Path resolve = targetDirectory.resolve(path.getFileName());
                        Files.move(path, resolve);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



}
