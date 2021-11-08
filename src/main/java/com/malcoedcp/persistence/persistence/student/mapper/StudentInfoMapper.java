package com.malcoedcp.persistence.persistence.student.mapper;

import com.malcoedcp.persistence.persistence.student.entity.StudentRegisterPo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface StudentInfoMapper {

    @Insert({
            "<script>",
            "insert into student_info "
                    + "(name, age, gender, grade, class_no) values ",
            "(#{name}, #{age}, #{gender}, #{grade}, #{classNo})",
            "</script>"
    })
    void saveStudent(StudentRegisterPo studentRegisterPo);

    @Delete({
            "<script>",
            "delete from student_info where id = #{studentId}",
            "</script>"
    })
    void deleteById(String studentId);
}
