package cc.nozuch.serviece;

import cc.nozuch.pojo.Msg;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

@Service
public interface MsgService extends IService<Msg>{
    Msg getNewestMsg();
}
