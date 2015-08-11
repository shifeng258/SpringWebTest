import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import src.DAO.ActivityDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class myBatisTest {
    @Autowired
    ApplicationContext context;

    @Test
    public void queryActNameById() throws Exception {
        ActivityDAO activityDAO = (ActivityDAO) context.getBean(ActivityDAO.class);
        org.junit.Assert.assertNotNull("shoud not be null",activityDAO.sqlSessionTemplate.toString());
        String actName = activityDAO.queryActNameById("82015033100001946");
        System.out.println(actName);
    }
}
