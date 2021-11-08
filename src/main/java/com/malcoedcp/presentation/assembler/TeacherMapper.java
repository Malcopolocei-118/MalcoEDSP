package com.malcoedcp.presentation.assembler;

import com.malcoedcp.application.dto.TeacherRegisterDto;
import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.presentation.vo.TeacherRegisterVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface TeacherMapper {

    TeacherMapper MAPPER = Mappers.getMapper(TeacherMapper.class);


    TeacherRegisterDto toTeacherRegisterDto(TeacherRegisterVo requestVo);
}
