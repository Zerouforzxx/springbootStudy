package org.sndra.springbootstudy.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.sndra.springbootstudy.mapper.StudentMapper;
import org.sndra.springbootstudy.pojo.Student;
import org.sndra.springbootstudy.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
