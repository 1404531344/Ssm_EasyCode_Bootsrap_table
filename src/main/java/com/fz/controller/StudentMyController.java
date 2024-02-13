package com.fz.controller;

import com.fz.entity.Student;
import com.fz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;
import java.util.List;

@Controller

public class StudentMyController {
    @Autowired
    private StudentService studentService;

//    查询所有
    @ResponseBody
    @RequestMapping("StudentFindAll")
    public List<Student> fingAll(){
        return studentService.queryByAll();
    }

//    根据名字，年龄模糊查询
    @ResponseBody
    @RequestMapping("studentQueryByLike")
    public List<Student> queryByLike(Student student){
        return studentService.queryByLike(student);
    }

    //    studentTest
    @ResponseBody
    @RequestMapping("studentTest")
    public String studentTest(Student student, HttpServletRequest request){
//        得到前端输入框输入的值
        System.out.println(request.getParameter("name"));
        return "studentTest";
    }


//    根据id删除
    @RequestMapping("StudentDeleteById")
    public String deleteById(Integer sid) {
        studentService.deleteById(sid);
        return "/studentMy.html";
    }

//  增加
    @RequestMapping("StudentAdd")
    public String add(Student student){
        studentService.insert(student);
        return "/studentMy.html";
    }



}
