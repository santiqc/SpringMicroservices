package com.microservice.student.repository;

import com.microservice.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByCourseId(Long idCourse);

    /*@Query(value = "SELECT * FROM Student WHERE course_id =:idCourse", nativeQuery = true)
    List<Student> findAllStudentForId(Long idCourse);*/
}
