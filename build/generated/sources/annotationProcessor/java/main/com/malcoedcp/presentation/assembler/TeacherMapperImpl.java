package com.malcoedcp.presentation.assembler;

import com.malcoedcp.application.dto.TeacherRegisterDto;
import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.presentation.vo.TeacherRegisterVo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-08T10:31:57+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherRegisterDto toTeacherRegisterDto(TeacherRegisterVo requestVo) {
        if ( requestVo == null ) {
            return null;
        }

        TeacherRegisterDto teacherRegisterDto = new TeacherRegisterDto();

        teacherRegisterDto.setName( requestVo.getName() );
        teacherRegisterDto.setAge( requestVo.getAge() );
        teacherRegisterDto.setGender( requestVo.getGender() );
        teacherRegisterDto.setClassNo( requestVo.getClassNo() );

        return teacherRegisterDto;
    }
}
