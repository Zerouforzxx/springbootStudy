package org.sndra.springbootstudy.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@TableName("student")
public class Student {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("username")
    private String username;
    //此字段不参与查询
    @TableField(value="password", select=false )
    private String password;

    @TableField("email")
    private String email;
    //注意，此处应该编写相应的填充逻辑
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime  updateTime;

    @TableField(exist = false)
    private String tempField; // 临时字段，不在数据库中

}
