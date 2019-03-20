package cn.bdqn.gao.exam;

import cn.bdqn.gao.exam.dao.FriendsMapper;
import cn.bdqn.gao.exam.service.FriendsServices;
import cn.bdqn.gao.exam.service.SelfServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamApplicationTests {
    @Resource
    private SelfServices services;
    @Resource
    private FriendsServices servicesa;

    @Test
    public void contextLoads() {
    }

    @Test
    public void querySelf() {
        System.out.println(this.services.queryself());
    }
    @Test
    public void queryFriend(){
        System.out.println(this.servicesa.queryfriends());
    }
    @Test
    public void delete(){
        System.out.println(this.servicesa.deleteFriendByName("gaojingyu123"));
}

}
