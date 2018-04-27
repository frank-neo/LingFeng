package club.ragdollhouse.LingFeng.controller;

import club.ragdollhouse.LingFeng.entity.TestForSpring;
import club.ragdollhouse.LingFeng.server.TestForSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestForSpringService tf;

    //简单get请求，mysql返回一个list
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public List<TestForSpring> test(){
        return tf.getAll();
    }


    //不经过jdbc，直接返回字符串给get，用于测试。
    @RequestMapping(value = "/test-nosql",method = RequestMethod.GET)
    public String testNosql(){
        return "1321323213";
    }

}
