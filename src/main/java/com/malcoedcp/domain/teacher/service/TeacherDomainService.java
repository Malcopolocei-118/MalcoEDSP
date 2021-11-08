package com.malcoedcp.domain.teacher.service;

import com.malcoedcp.domain.teacher.entity.TeacherRegisterDo;
import com.malcoedcp.domain.teacher.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeacherDomainService {

    private final TeacherRepository teacherRepository;

    public void saveTeacher(TeacherRegisterDo registerDo) {
        teacherRepository.saveTeacher(registerDo);
    }

    public void deleteTeacherById(String id) {
        teacherRepository.deleteById(id);
    }
}
