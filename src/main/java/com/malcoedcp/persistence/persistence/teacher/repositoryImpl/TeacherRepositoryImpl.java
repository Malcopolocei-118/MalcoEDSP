package com.malcoedcp.persistence.persistence.teacher.repositoryImpl;

import com.malcoedcp.domain.teacher.entity.TeacherRegisterDo;
import com.malcoedcp.domain.teacher.repository.TeacherRepository;
import com.malcoedcp.persistence.assembler.TeacherMapper;
import com.malcoedcp.persistence.persistence.teacher.entity.TeacherRegisterPo;
import com.malcoedcp.persistence.persistence.teacher.mapper.TeacherInfoMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepositoryImpl implements TeacherRepository {

    private final TeacherInfoMapper teacherInfoMapper;

    public TeacherRepositoryImpl(TeacherInfoMapper teacherInfoMapper) {
        this.teacherInfoMapper = teacherInfoMapper;
    }

    @Override
    public void saveTeacher(TeacherRegisterDo registerDo) {
        TeacherRegisterPo registerPo = TeacherMapper.MAPPER.toTeacherRegisterPo(registerDo);
        teacherInfoMapper.saveTeacher(registerPo);
    }

    @Override
    public void deleteById(String id) {
        teacherInfoMapper.deleteById(id);
    }
}
