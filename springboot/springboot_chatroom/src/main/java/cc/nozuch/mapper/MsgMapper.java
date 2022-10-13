package cc.nozuch.mapper;

import cc.nozuch.pojo.Msg;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MsgMapper extends BaseMapper<Msg> {
    Msg getNewestMsg();
}
