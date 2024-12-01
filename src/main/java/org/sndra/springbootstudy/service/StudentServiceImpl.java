package org.sndra.springbootstudy.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mapper.StudentMapper;
import org.sndra.springbootstudy.pojo.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService{
}
