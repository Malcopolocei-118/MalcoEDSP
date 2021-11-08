package com.malcoedcp.domain.student.repository;

import com.malcoedcp.domain.student.entity.StudentRegisterDo;

public interface StudentRepository {

    void saveStudent(StudentRegisterDo requestDo);

    void deleteById(String studentId);
}
