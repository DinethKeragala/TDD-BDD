package com.example.Task;

class Task {
    private Long id;
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
