package com.malcoedcp.domain.teacher.entity;

import com.malcoedcp.common.entity.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherRegisterDo {

    private String name;

    private Integer age;

    private GenderEnum gender;

    private Integer classNo;

}
