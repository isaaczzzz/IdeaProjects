package cc.nozuch.mapper;

import cc.nozuch.pojo.Msg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootTest
public class MsgMapperTest {
    @Autowired
    private MsgMapper msgMapper;

    @Test
    public void testGetById() {
        System.out.println(msgMapper.selectById(1));
    }

    @Test
    public void testInsert() {
        //获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new java.util.Date());
        java.util.Date timeDate = null;
        try {
            timeDate = sdf.parse(time);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        java.sql.Timestamp timestamp = new java.sql.Timestamp(timeDate.getTime());

        Msg msg = new Msg();
        msg.setMessage("test save");
        msg.setTime(timestamp);
        msgMapper.insert(msg);
    }

}
