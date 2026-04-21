package com.example.taskmanager.controller;

import com.example.taskmanager.dto.TaskRequestDTO;
import com.example.taskmanager.dto.TaskResponseDTO;
import com.example.taskmanager.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "*")

public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public TaskResponseDTO create(@RequestBody @Valid TaskRequestDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<TaskResponseDTO> list() {
        return service.list();
    }

    @PutMapping("/{id}")
    public TaskResponseDTO update(@PathVariable Long id,
                                     @RequestBody @Valid TaskRequestDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
