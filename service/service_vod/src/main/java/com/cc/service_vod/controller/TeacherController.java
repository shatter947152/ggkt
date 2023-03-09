package com.cc.service_vod.controller;


import com.cc.model.vod.Teacher;
import com.cc.service_vod.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author cc
 * @since 2022-07-05
 */
@Api(tags = "讲师管理接口")
@RestController
@RequestMapping("/vod/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //查询所有讲师列表
    @ApiOperation("所有讲师列表")
    @GetMapping("findAll")
    public List<Teacher> findAll(){
        List<Teacher> list = teacherService.list();
        return list;
    }

    @ApiOperation("逻辑删除讲师")
    @DeleteMapping("remove/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return teacherService.removeById(id);
    }
}

