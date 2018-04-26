package club.ragdollhouse.LingFeng.mapper;

import club.ragdollhouse.LingFeng.entity.TestForSpring;
import org.springframework.stereotype.Component;
import java.util.List;

//Component注解的意思是“凝视层”，对于那些在业务中不是很好定位是哪一层的我们可以监视他，方便Autowired注入时引用
@Component(value = "ForSpringMapper")
public interface ForSpringMapper {

    List<TestForSpring> getAll();
}
