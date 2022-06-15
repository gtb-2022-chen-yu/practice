package ass.Demo;

import java.util.ArrayList;
import java.util.List;

public class App {

    private final TaskRepository taskRepository = new TaskRepository();

    public static void main(String[] args) {
        throw new UnsupportedOperationException();
    }

    public List<String> run() {
        //不择手段实现1
        //return List.of("Task 01", "Task 02");
        //return Files.readAllLines(Constants.TASKS_FILE_PATH);
        final List<Task> tasks = taskRepository.loadTasks();

        final List<String> result = new ArrayList<>();
        result.add("# To be done");
        for (var task : tasks) {
            result.add(task.format());
        }

        //result.addAll(lines);
        //lines.forEach(line -> result.add(line));
        return result;
    }

}
