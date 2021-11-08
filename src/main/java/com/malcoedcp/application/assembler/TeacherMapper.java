package com.malcoedcp.application.assembler;

import com.malcoedcp.application.dto.TeacherRegisterDto;
import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.domain.teacher.entity.TeacherRegisterDo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface TeacherMapper {

    TeacherMapper MAPPER = Mappers.getMapper(TeacherMapper.class);

    TeacherRegisterDo toTeacherRegisterDo(TeacherRegisterDto requestDto);
}
