package cc.nozuch.controller;

import cc.nozuch.pojo.Msg;
import cc.nozuch.serviece.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msgs")
public class MsgController {

    @Autowired
    private MsgService msgService;

    @GetMapping("{id}")
    public Msg getById(@PathVariable Integer id) {
        return msgService.getById(id);
    }

    @PostMapping
    public Boolean save(@RequestBody Msg msg) {
        return msgService.save(msg);
    }
}
