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

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public List<TestForSpring> test(){
        return tf.getAll();
    }
}
