package com.malcoedcp.application.dto;

import com.malcoedcp.common.entity.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TeacherRegisterDto {

    private String name;

    private Integer age;

    private GenderEnum gender;

    private Integer classNo;

}
