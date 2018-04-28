package club.ragdollhouse.LingFeng.controller;

import club.ragdollhouse.LingFeng.entity.TestForSpring;
import club.ragdollhouse.LingFeng.entity.User;
import club.ragdollhouse.LingFeng.server.TestForSpringService;
import org.apache.catalina.session.StandardSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.annotation.Target;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestForSpringService tf;

    //简单get请求，mysql返回一个list
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<TestForSpring> test() {
        return tf.getAll();
    }


    //不经过jdbc，直接返回字符串给get，用于测试。
    @RequestMapping(value = "/test-nosql", method = RequestMethod.GET)
    public String testNosql() {
        return "1321323213";
    }

    //测试session
    @RequestMapping(value = "/session", method = RequestMethod.POST)
    public String testSession(HttpServletRequest request, User user) {
        String id = request.getSession().getId();
        request.getSession().setAttribute("user", user.getUsername());
        String value = request.getSession().getAttribute("user").toString();
        //设置session有效期未3600秒---1小时
        request.getSession().setMaxInactiveInterval(3600);
        int time = request.getSession().getMaxInactiveInterval();
        String mess = id + value + "，时间：" + time;
        return mess;
    }
    @RequestMapping(value = "/globleSession",method = RequestMethod.GET)
    public String globleSession(HttpServletRequest request){
        return request.getSession().getId()+request.getSession().getAttribute("user").toString();
    }
    //测试关闭session
    @RequestMapping(value = "/disableSession")
    public void disableSession(HttpServletRequest request){
        request.getSession().invalidate();
    }

}
