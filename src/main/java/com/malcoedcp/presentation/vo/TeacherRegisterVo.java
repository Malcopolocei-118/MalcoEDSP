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
public class TeacherRegisterVo {
    @NotNull
    @ApiModelProperty("老师姓名")
    private String name;

    @NotNull
    @Min(1)
    @ApiModelProperty("老师年龄")
    private Integer age;

    @NotNull
    @ApiModelProperty("老师性别")
    private GenderEnum gender;

    @NotNull
    @ApiModelProperty("老师所属班级")
    private Integer classNo;
}
