package ass.Demo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        throw new UnsupportedOperationException();
    }

    public List<String> run() {
        //不择手段实现1
        //return List.of("Task 01", "Task 02");
        try {
            final List<String> result = new ArrayList<>();
            result.add("# To be done");
            result.addAll(Files.readAllLines(Constants.TASKS_FILE_PATH));
            return result;
            //return Files.readAllLines(Constants.TASKS_FILE_PATH);
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }
}
