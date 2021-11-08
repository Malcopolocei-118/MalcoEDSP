package com.malcoedcp.presentation.assembler;

import com.malcoedcp.application.dto.StudentRegisterDto;
import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.presentation.vo.StudentRegisterVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface StudentInfoMapper {

    StudentInfoMapper MAPPER = Mappers.getMapper(StudentInfoMapper.class);

    StudentRegisterDto toStudentRegisterDto(StudentRegisterVo requestVo);
}
