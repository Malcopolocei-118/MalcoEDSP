package com.malcoedcp.application;

import com.malcoedcp.application.assembler.TeacherMapper;
import com.malcoedcp.application.dto.TeacherRegisterDto;
import com.malcoedcp.domain.teacher.entity.TeacherRegisterDo;
import com.malcoedcp.domain.teacher.service.TeacherDomainService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class TeacherApplicationService {

    private final TeacherDomainService teacherDomainService;

    public void saveStudent(TeacherRegisterDto requestDto) {
        TeacherRegisterDo registerDo = TeacherMapper.MAPPER.toTeacherRegisterDo(requestDto);
        teacherDomainService.saveTeacher(registerDo);
    }

    public void deleteTeacherById(String id) {
        teacherDomainService.deleteTeacherById(id);
    }
}
