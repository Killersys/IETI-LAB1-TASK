package Lab1.Lab1.service;

import Lab1.Lab1.data.Task;
import java.util.List;

public interface TaskService {
    Task create(Task task );
    Task findById( String id );
    List<Task> all();
    void deleteById( String id );
    Task update( Task task, String id );
}
