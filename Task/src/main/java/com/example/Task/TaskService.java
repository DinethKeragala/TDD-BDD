package com.example.Task;

import java.util.concurrent.atomic.AtomicLong;
import java.util.HashMap;
import java.util.Map;

class TaskService {
    private final Map<Long, Task> tasks = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    Task addTask(Task task) {
        long id = idGenerator.incrementAndGet();
        task.setId(id);
        task.setCompleted(false);
        tasks.put(id, task);
        return task;
    }

    Task getTaskById(Long id) {
        return tasks.get(id);  // Retrieve task from map
    }
}
