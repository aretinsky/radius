package org.aretinsky.radius.controller;

import org.aretinsky.radius.model.Task;
import org.aretinsky.radius.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", taskService.findAll());
        return "index";
    }

    @GetMapping("/new")
    public String newTaskForm(Task task) {
        return "new-task";
    }

    @PostMapping("/new")
    public String newTask(Task task) {
        taskService.save(task);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id, Model model) {
        taskService.deleteById(id);
        model.addAttribute("task", taskService.findById(id));
        return "redirect:/"
    }
}





