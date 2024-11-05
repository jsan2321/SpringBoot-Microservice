package com.app.course.client;

import com.app.course.controller.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8090") // microservice to query
public interface StudentClient {

    @GetMapping("/api/student/search-by-course/{courseId}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long courseId);
}