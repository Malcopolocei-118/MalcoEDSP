package com.malcoedcp.persistence.assembler;

import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.domain.teacher.entity.TeacherRegisterDo;
import com.malcoedcp.persistence.persistence.teacher.entity.TeacherRegisterPo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-08T10:31:57+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherRegisterPo toTeacherRegisterPo(TeacherRegisterDo registerDo) {
        if ( registerDo == null ) {
            return null;
        }

        TeacherRegisterPo teacherRegisterPo = new TeacherRegisterPo();

        teacherRegisterPo.setName( registerDo.getName() );
        teacherRegisterPo.setAge( registerDo.getAge() );
        teacherRegisterPo.setGender( registerDo.getGender() );
        teacherRegisterPo.setClassNo( registerDo.getClassNo() );

        return teacherRegisterPo;
    }
}
