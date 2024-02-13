package com.fz.controller;

import com.fz.entity.Student;
import com.fz.service.StudentService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2024-02-10 15:57:29
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    /**
     * 分页查询
     *
     * @param student 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Student>> queryByPage(Student student, PageRequest pageRequest) {
        return ResponseEntity.ok(this.studentService.queryByPage(student, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Student> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.studentService.queryById(id));
    }

    //    查询所有
    @GetMapping("queryByAll")
    public List<Student> queryByAll() {
        return ResponseEntity.ok(this.studentService.queryByAll()).getBody();
    }

    /**
     * 新增数据
     *
     * @param student 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Student> add(Student student) {
        return ResponseEntity.ok(this.studentService.insert(student));
    }

    /**
     * 编辑数据
     *
     * @param student 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Student> edit(Student student) {
        return ResponseEntity.ok(this.studentService.update(student));
    }




    //测试成功删除
    @GetMapping ("deleteById")
    public boolean deleteById(Integer sid) {
        return this.studentService.deleteById(sid);
    }




//    前端调用1
//    $.ajax({
//        url: '/student',
//                type: 'DELETE',
//                data: { id: 1 }, // Replace 1 with the actual ID of the student to be deleted
//        success: function(response) {
//            // Handle success response
//        },
//        error: function(xhr, status, error) {
//            // Handle error response
//        }
//    });
//
//    前端调用2
//    fetch('/student?id=1', {
//        method: 'DELETE'
//    })
//            .then(response => {
//        // Handle success response
//    })
//            .catch(error => {
//        // Handle error response
//    });

//    前端调用3
//    <form action="/student" method="DELETE">
//    <input type="hidden" name="id" value="1"> <!-- Replace 1 with the actual ID of the student to be deleted -->
//    <input type="submit" value="Delete">
//</form>

}

