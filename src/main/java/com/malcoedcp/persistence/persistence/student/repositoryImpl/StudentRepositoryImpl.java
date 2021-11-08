package com.malcoedcp.persistence.persistence.student.repositoryImpl;

import com.malcoedcp.domain.student.entity.StudentRegisterDo;
import com.malcoedcp.domain.student.repository.StudentRepository;
import com.malcoedcp.persistence.assembler.StudentMapper;
import com.malcoedcp.persistence.persistence.student.entity.StudentRegisterPo;
import com.malcoedcp.persistence.persistence.student.mapper.StudentInfoMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private final StudentInfoMapper studentInfoMapper;

    public StudentRepositoryImpl(StudentInfoMapper studentInfoMapper) {
        this.studentInfoMapper = studentInfoMapper;
    }

    @Override
    public void saveStudent(StudentRegisterDo registerDo) {
        StudentRegisterPo studentRegisterPo = StudentMapper.MAPPER.toStudentRegisterPo(registerDo);
        studentInfoMapper.saveStudent(studentRegisterPo);
    }

    @Override
    public void deleteById(String studentId) {
        studentInfoMapper.deleteById(studentId);
    }
}
