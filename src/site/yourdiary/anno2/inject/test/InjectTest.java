package site.yourdiary.anno2.inject.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.yourdiary.anno2.inject.bean.SimpleMovieLister;
import site.yourdiary.anno2.inject.config.InjectConfig;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {InjectConfig.class})
public class InjectTest {
    @Inject
    private SimpleMovieLister simpleMovieLister;

    @Test
    public void demoTest(){
        simpleMovieLister.listMovies();
    }
}
