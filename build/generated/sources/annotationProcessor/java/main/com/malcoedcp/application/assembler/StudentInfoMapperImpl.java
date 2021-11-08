package com.malcoedcp.application.assembler;

import com.malcoedcp.application.dto.StudentRegisterDto;
import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.domain.student.entity.StudentRegisterDo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-08T10:31:57+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class StudentInfoMapperImpl implements StudentInfoMapper {

    @Override
    public StudentRegisterDo toStudentRegisterDo(StudentRegisterDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        StudentRegisterDo studentRegisterDo = new StudentRegisterDo();

        studentRegisterDo.setName( requestDto.getName() );
        studentRegisterDo.setAge( requestDto.getAge() );
        studentRegisterDo.setGrade( requestDto.getGrade() );
        studentRegisterDo.setGender( requestDto.getGender() );
        studentRegisterDo.setClassNo( requestDto.getClassNo() );

        return studentRegisterDo;
    }
}
