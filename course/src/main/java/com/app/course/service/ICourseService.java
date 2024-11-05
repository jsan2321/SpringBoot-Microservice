package com.app.course.service;

import com.app.course.entity.Course;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);

}
