package com.malcoedcp.presentation.assembler;

import com.malcoedcp.application.dto.StudentRegisterDto;
import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.presentation.vo.StudentRegisterVo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-08T10:31:57+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class StudentInfoMapperImpl implements StudentInfoMapper {

    @Override
    public StudentRegisterDto toStudentRegisterDto(StudentRegisterVo requestVo) {
        if ( requestVo == null ) {
            return null;
        }

        StudentRegisterDto studentRegisterDto = new StudentRegisterDto();

        studentRegisterDto.setName( requestVo.getName() );
        studentRegisterDto.setAge( requestVo.getAge() );
        studentRegisterDto.setGrade( requestVo.getGrade() );
        studentRegisterDto.setGender( requestVo.getGender() );
        studentRegisterDto.setClassNo( requestVo.getClassNo() );

        return studentRegisterDto;
    }
}
