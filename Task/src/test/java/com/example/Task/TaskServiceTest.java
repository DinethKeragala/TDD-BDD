package com.example.Task;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    @Test
    void shouldAddNewTask() {
        TaskService service = new TaskService();
        Task task = new Task("Learn TDD");

        Task saved = service.addTask(task);

        assertNotNull(saved.getId());
        assertEquals("Learn TDD", saved.getTitle());
        assertFalse(saved.isCompleted());
    }

    @Test
    void shouldReturnTaskById() {
        TaskService service = new TaskService();

        Task task = new Task("Learn TDD");
        Task saved = service.addTask(task);

        Task found = service.getTaskById(saved.getId());

        assertNotNull(found);                      // Task should exist
        assertEquals(saved.getId(), found.getId());
        assertEquals("Learn TDD", found.getTitle());
    }

}
