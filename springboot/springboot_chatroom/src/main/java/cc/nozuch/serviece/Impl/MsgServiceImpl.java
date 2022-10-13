package cc.nozuch.serviece.Impl;

import cc.nozuch.mapper.MsgMapper;
import cc.nozuch.pojo.Msg;
import cc.nozuch.serviece.MsgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MsgServiceImpl extends ServiceImpl<MsgMapper, Msg> implements MsgService {
    @Override
    public Msg getNewestMsg() {
        return this.baseMapper.getNewestMsg();
    }
}
