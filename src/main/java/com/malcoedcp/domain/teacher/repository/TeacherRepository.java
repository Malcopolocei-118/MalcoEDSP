package com.malcoedcp.domain.teacher.repository;

import com.malcoedcp.domain.teacher.entity.TeacherRegisterDo;

public interface TeacherRepository {

    void saveTeacher(TeacherRegisterDo teacherRegisterDo);

    void deleteById(String id);
}
