package com.malcoedcp.presentation;


import com.malcoedcp.application.TeacherApplicationService;
import com.malcoedcp.application.dto.TeacherRegisterDto;
import com.malcoedcp.presentation.assembler.TeacherMapper;
import com.malcoedcp.presentation.vo.TeacherRegisterVo;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherApplicationService teacherApplicationService;

    @ApiOperation("注册老师")
    @PostMapping
    public void saveStudent(@Validated @RequestBody TeacherRegisterVo requestVo) {
        TeacherRegisterDto requestDto = TeacherMapper.MAPPER.toTeacherRegisterDto(requestVo);
        teacherApplicationService.saveStudent(requestDto);
    }

    @ApiOperation("删除老师")
    @DeleteMapping("/{id}")
    public void deleteTeacherById(@PathVariable String id) {
        teacherApplicationService.deleteTeacherById(id);
    }
}
