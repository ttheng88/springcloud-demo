package com.liangsy.swagger.controller;

import com.liangsy.swagger.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/26
 */
@Api(tags = "用户管理")
@RestController
public class SwaggerController {

    private static ArrayList<User> list = new ArrayList<>();

    @ApiOperation(value = "保存用户信息",notes = "保存用户名和密码等信息")
    @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    @PostMapping("/swagger/saveUser")
    public String saveUser(@RequestBody User user){
        list.add(user);
        return "success";
    }


    @ApiOperation(value = "获取用户信息",notes = "根据索引获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户ID",required = true,dataType = "int"),
            @ApiImplicitParam(name = "name",value = "用户名称", dataType = "String")
    })
    @GetMapping("/swagger/getUser")
    public List<User> getUserList(@RequestParam(value = "id") int id, @RequestParam(value = "name",required = false,defaultValue = "") String name){
        List<User> userList = list.stream().filter(user -> id == user.getId()
                || name.equalsIgnoreCase(user.getUseName())).collect(Collectors.toList());
        return userList;
    }


    @GetMapping("/getUserList")
    public  ArrayList<User> getUserList(){
        return list;
    }

}
