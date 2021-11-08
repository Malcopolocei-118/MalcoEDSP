package com.malcoedcp.application.assembler;

import com.malcoedcp.application.dto.TeacherRegisterDto;
import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.domain.teacher.entity.TeacherRegisterDo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-08T10:31:57+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherRegisterDo toTeacherRegisterDo(TeacherRegisterDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        TeacherRegisterDo teacherRegisterDo = new TeacherRegisterDo();

        teacherRegisterDo.setName( requestDto.getName() );
        teacherRegisterDo.setAge( requestDto.getAge() );
        teacherRegisterDo.setGender( requestDto.getGender() );
        teacherRegisterDo.setClassNo( requestDto.getClassNo() );

        return teacherRegisterDo;
    }
}
