CREATE TABLE `teacher_info`
(
    `id`          INT(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`        VARCHAR(30) NOT NULL COMMENT '姓名',
    `age`         INT(3) COMMENT '年龄',
    `gender`      VARCHAR(30) NOT NULL COMMENT '性别: MALE 男 FEMALE 女 OTHER 其他',
    `class_no`    VARCHAR(30) NOT NULL COMMENT '班级',
    `is_to_class` TINYINT     NOT NULL DEFAULT 1 COMMENT '是否需要分班',
    PRIMARY KEY (`id`)
)