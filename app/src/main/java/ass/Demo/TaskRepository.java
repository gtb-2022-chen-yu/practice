package ass.Demo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public TaskRepository() {
    }

    List<Task> loadTasks() {
        final List<String> lines = readTaskLines();
        final List<Task> tasks = new ArrayList<Task>();
        for (int i = 0; i < lines.size(); i++) {
            //result.add(i + 1 + " " + lines.get(i));
            final var id = i + 1;
            final var line = lines.get(i);
            final var name = line;
            final var task = new Task(id, name);

            tasks.add(task);
            //result.add(task.format());
            //result.add(new Task(id, name).format());
        }
        return tasks;
    }

    List<String> readTaskLines() {
        final List<String> lines;
        try {
            lines = Files.readAllLines(Constants.TASKS_FILE_PATH);
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
        return lines;
    }
}
