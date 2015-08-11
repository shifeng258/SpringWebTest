package src.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by SHIFENG258 on 2015/8/10.
 */
@Repository
public class myDao {
    /*@Autowired
    private SqlMapClientTemplate sqlMapClientTemplate;

    public void testDataSource(){
        this.sqlMapClientTemplate.queryForObject("select *\n" +
                "  from sales_smpapp_activity a\n" +
                " where a.activity_no = '20141013000007'");
    }*/
}
