package com.malcoedcp.persistence.assembler;

import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.domain.student.entity.StudentRegisterDo;
import com.malcoedcp.persistence.persistence.student.entity.StudentRegisterPo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-08T10:31:57+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentRegisterPo toStudentRegisterPo(StudentRegisterDo registerDo) {
        if ( registerDo == null ) {
            return null;
        }

        StudentRegisterPo studentRegisterPo = new StudentRegisterPo();

        studentRegisterPo.setName( registerDo.getName() );
        studentRegisterPo.setAge( registerDo.getAge() );
        studentRegisterPo.setGrade( registerDo.getGrade() );
        studentRegisterPo.setGender( registerDo.getGender() );
        studentRegisterPo.setClassNo( registerDo.getClassNo() );

        return studentRegisterPo;
    }
}
