package com.app.student.persistence;

import com.app.student.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.idCourse = :idCourse")
    List<Student> findAllStudents(Long idCourse);

    //List<Student> findAllByCourseId(Long idCourse);
}
