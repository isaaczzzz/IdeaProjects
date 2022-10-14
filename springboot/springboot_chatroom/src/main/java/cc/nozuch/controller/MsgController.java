package cc.nozuch.controller;

import cc.nozuch.pojo.Msg;
import cc.nozuch.serviece.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
public class MsgController {

    @Autowired
    private MsgService msgService;

    @RequestMapping("/get")
    public Msg get() {
        return msgService.getNewestMsg();
    }

    @RequestMapping("/send")
    public String save(@RequestParam("message") String message) {
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
        msg.setMessage(message);
        msg.setTime(timestamp);
        boolean flag = msgService.save(msg);
        if(flag)
            return "发送成功";
        else return "发送失败";
    }
}
