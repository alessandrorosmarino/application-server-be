package com.alessandro.rosmarino.backend.applicationserverbe.task_reminder.web.repository;

import com.alessandro.rosmarino.backend.applicationserverbe.task_reminder.web.entities.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long>{

    Iterable<Reminder> findAllByCreationDate(LocalDate date);

    Iterable<Reminder> findAllByReminderWeekdayContaining(String weekday);
}