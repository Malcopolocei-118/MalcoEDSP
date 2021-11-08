package com.malcoedcp.persistence.persistence.teacher.mapper;

import com.malcoedcp.persistence.persistence.teacher.entity.TeacherRegisterPo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface TeacherInfoMapper {

    @Insert({
            "<script>",
            "insert into teacher_info "
                    + "(name, age, gender, class_no) values ",
            "(#{name}, #{age}, #{gender}, #{classNo})",
            "</script>"
    })
    void saveTeacher(TeacherRegisterPo registerPo);

    @Delete({
            "<script>",
            "delete from teacher_info where id = #{id}",
            "</script>"
    })
    void deleteById(String id);
}
