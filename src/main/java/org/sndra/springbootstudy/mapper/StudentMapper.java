package org.sndra.springbootstudy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.sndra.springbootstudy.pojo.Student;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
