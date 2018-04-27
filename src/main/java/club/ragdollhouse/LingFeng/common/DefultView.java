package club.ragdollhouse.LingFeng.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/*
 * 写了一个登录欢迎的首页类
 * 用于根目录的访问
 */
@Configuration
public class DefultView extends WebMvcConfigurerAdapter {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("forward:/welcome.html");
        //Ordered内部已经定义好了最大值和最小值的全局变量。
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

}
