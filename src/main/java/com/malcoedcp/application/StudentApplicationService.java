package com.malcoedcp.application;

import com.malcoedcp.application.assembler.StudentInfoMapper;
import com.malcoedcp.application.dto.StudentRegisterDto;
import com.malcoedcp.domain.student.service.StudentDomainService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class StudentApplicationService {

    private final StudentDomainService studentDomainService;

    public void saveStudent(StudentRegisterDto registerDo) {
        studentDomainService.saveStudent(StudentInfoMapper.MAPPER.toStudentRegisterDo(registerDo));
    }

    public void deleteStudentById(String id) {
        studentDomainService.deleteStudentById(id);
    }
}
