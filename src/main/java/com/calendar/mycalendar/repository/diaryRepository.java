package com.calendar.mycalendar.repository;


import com.calendar.mycalendar.entity.calendarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface diaryRepository extends JpaRepository<calendarEntity,Long> {
}
