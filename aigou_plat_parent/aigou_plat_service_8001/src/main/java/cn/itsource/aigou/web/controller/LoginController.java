package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController //和controller的区别
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("ll".equals(employee.getUsername())&&"12345".equals(employee.getPassword())){
            return  AjaxResult.me().setObject(null);
        }else{
            return  AjaxResult.me().setSuccess(false).setMsg("登录失败").setObject(null);
        }
    }

    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult tttt(){

        return AjaxResult.me();
    }
}
