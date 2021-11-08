package com.malcoedcp.domain.student.entity;

import com.malcoedcp.common.entity.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRegisterDo {

    private String name;

    private Integer age;

    private Integer grade;

    private GenderEnum gender;

    private Integer classNo;

}
