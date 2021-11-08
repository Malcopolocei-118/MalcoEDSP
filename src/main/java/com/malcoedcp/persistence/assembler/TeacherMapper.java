package com.malcoedcp.persistence.assembler;

import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.domain.teacher.entity.TeacherRegisterDo;
import com.malcoedcp.persistence.persistence.teacher.entity.TeacherRegisterPo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface TeacherMapper {

    TeacherMapper MAPPER = Mappers.getMapper(TeacherMapper.class);

    TeacherRegisterPo toTeacherRegisterPo(TeacherRegisterDo registerDo);
}
