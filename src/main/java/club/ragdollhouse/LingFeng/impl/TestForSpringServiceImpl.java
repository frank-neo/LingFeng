package club.ragdollhouse.LingFeng.impl;

import club.ragdollhouse.LingFeng.entity.TestForSpring;
import club.ragdollhouse.LingFeng.mapper.ForSpringMapper;
import club.ragdollhouse.LingFeng.server.TestForSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestForSpringServiceImpl implements TestForSpringService {
    @Autowired
    ForSpringMapper fs;
    @Override
    public List<TestForSpring> getAll() {
        return fs.getAll();
    }
}
