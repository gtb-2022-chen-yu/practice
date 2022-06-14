package ass.Demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App {

    public static void main(String[] args) {
        throw new UnsupportedOperationException();
    }

    public List<String> run() {
        //不择手段实现1
        return List.of("Task 01", "Task 02");
//        try {
//            return Files.readAllLines(Path.of("/c/Users/John/.todo/tasks"));
//        } catch (IOException e) {
//            throw new TodoCannotReadFileException();
//        }
    }
}
