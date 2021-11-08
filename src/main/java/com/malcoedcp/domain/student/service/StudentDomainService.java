package com.malcoedcp.domain.student.service;

import com.malcoedcp.domain.student.entity.StudentRegisterDo;
import com.malcoedcp.domain.student.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentDomainService {

    private final StudentRepository studentRepository;

    public void saveStudent(StudentRegisterDo registerDo) {
        studentRepository.saveStudent(registerDo);
    }

    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }
}
