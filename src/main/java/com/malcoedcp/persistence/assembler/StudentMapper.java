package com.malcoedcp.persistence.assembler;

import com.malcoedcp.common.entity.GenderEnum;
import com.malcoedcp.domain.student.entity.StudentRegisterDo;
import com.malcoedcp.persistence.persistence.student.entity.StudentRegisterPo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface StudentMapper {

    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);


    StudentRegisterPo toStudentRegisterPo(StudentRegisterDo registerDo);
}
