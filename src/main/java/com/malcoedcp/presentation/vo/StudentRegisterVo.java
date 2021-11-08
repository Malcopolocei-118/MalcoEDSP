package com.malcoedcp.presentation.vo;

import com.malcoedcp.common.entity.GenderEnum;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRegisterVo {

    @NotNull
    @ApiModelProperty("学生姓名")
    private String name;

    @NotNull
    @Min(1)
    @ApiModelProperty("学生年龄")
    private Integer age;

    @NotNull
    @Min(1)
    @ApiModelProperty("学生年级")
    private Integer grade;

    @NotNull
    @ApiModelProperty("学生性别")
    private GenderEnum gender;

    @NotNull
    @ApiModelProperty("学生所属班级")
    private Integer classNo;

}
