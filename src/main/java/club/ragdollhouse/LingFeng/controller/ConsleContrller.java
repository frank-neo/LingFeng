package club.ragdollhouse.LingFeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConsleContrller {

    @RequestMapping(value = "/backConsole",method = RequestMethod.POST)
    public String backConsole(){


        return "UserConsole";
    }
}
