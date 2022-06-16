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
        final List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            //result.add(i + 1 + " " + lines.get(i));

            tasks.add(TaskFactory.creatTask(i + 1, lines.get(i)));
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
