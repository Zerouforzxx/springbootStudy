CREATE TABLE `student` (
                         `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                         `username` VARCHAR(50) NOT NULL COMMENT '用户名',
                         `password` VARCHAR(100) NOT NULL COMMENT '密码',
                         `email` VARCHAR(100) DEFAULT NULL COMMENT '电子邮件',
                         `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                         `update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学生信息表';

INSERT INTO `student` (`username`, `password`, `email`) VALUES
                                                          ('张三', 'hashed_password_for_zhangsan', 'zhangsan@example.com'),
                                                          ('李四', 'hashed_password_for_lisi', 'lisi@example.com'),
                                                          ('王五', 'hashed_password_for_wangwu', 'wangwu@example.com');