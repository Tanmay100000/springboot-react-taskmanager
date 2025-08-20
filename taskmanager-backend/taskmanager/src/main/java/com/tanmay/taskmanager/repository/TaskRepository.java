package com.tanmay.taskmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanmay.taskmanager.entity.Task;
import com.tanmay.taskmanager.entity.User;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}
