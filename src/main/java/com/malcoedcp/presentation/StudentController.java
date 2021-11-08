package com.malcoedcp.presentation;

import com.malcoedcp.application.StudentApplicationService;
import com.malcoedcp.application.dto.StudentRegisterDto;
import com.malcoedcp.presentation.assembler.StudentInfoMapper;
import com.malcoedcp.presentation.vo.StudentRegisterVo;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/students")
public class StudentController {
    
    private final StudentApplicationService studentApplicationService;

    @ApiOperation("注册学生")
    @PostMapping
    public void saveStudent(@Validated @RequestBody StudentRegisterVo requestVo) {
        StudentRegisterDto requestDto = StudentInfoMapper.MAPPER.toStudentRegisterDto(requestVo);
        studentApplicationService.saveStudent(requestDto);
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable String id) {
        studentApplicationService.deleteStudentById(id);
    }

}
