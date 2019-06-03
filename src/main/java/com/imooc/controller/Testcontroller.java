package com.imooc.controller;

import com.imooc.object.*;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

@Controller
public class Testcontroller {

    @RequestMapping(value = "baseType")
    @ResponseBody
    public String baseType(@RequestParam(required = false) int age){
        return "age:" + age;
    }
    @RequestMapping(value = "baseType2")
    @ResponseBody
    public String baseType2(Integer age){
        return "age2 : " + age;
    }

    @RequestMapping(value = "array")
    @ResponseBody
    public String array(String[] name){
        StringBuffer buffer = new StringBuffer();
        for (String item: name) {
            buffer.append(item).append(" ");
        }
        return buffer.toString();
    }

    @RequestMapping(value = "object")
    @ResponseBody
    public String object(User user, Admin admin){

        return user.toString() + "" + admin.toString();
    }

    @InitBinder("user")
    public void initUser(WebDataBinder binder){

        binder.setFieldDefaultPrefix("user.");
    }

    @InitBinder("admin")
    public void initAdmin(WebDataBinder binder){

        binder.setFieldDefaultPrefix("admin.");
    }

    @RequestMapping(value = "list")
    @ResponseBody
    public String list(UserListFrom userListFrom){
        return "UserList:" + userListFrom.getUserList().size() + " " +  userListFrom.toString();
    }

    @RequestMapping(value = "set")
    @ResponseBody
    public String set(UserSetFrom userSetFrom){
        return "UserSet:" + userSetFrom.getUsers();
    }

    @RequestMapping( value = "map")
    @ResponseBody
    public String map(UserMapFrom userMapFrom){
        return "UserMap:" + userMapFrom.toString();
    }

    @RequestMapping(value = "json")
    @ResponseBody
    public String json(@RequestBody User user){
        return "UserJson:" + user.toString();
    }

    @RequestMapping(value = "xml")
    @ResponseBody
    public String xml(@RequestBody Admin admin){
        return admin.toString();
    }

    @RequestMapping(value = "date1")
    @ResponseBody
    public String datel(Date date){
        return date.toString();
    }

    @InitBinder("date")
    public void initDate(WebDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }
    @RequestMapping("testJson")
// @ResponseBody
    public @ResponseBody Item testJson(@RequestBody Item item) {
        System.out.println(item.getId()+":"+item.getName()+":"+item.getSal());
        return item;
    }




    public static void main(String[] args) {
        HashSet<User> hashSet = new HashSet<User>();
        User user = new User();
        user.setName("aaaa");
        User user1 = new User();
        user1.setName("aaaa");
        hashSet.add(user);
        hashSet.add(user1);
        System.out.println("size:" + hashSet.size());
        System.out.println(hashSet);
    }
}
