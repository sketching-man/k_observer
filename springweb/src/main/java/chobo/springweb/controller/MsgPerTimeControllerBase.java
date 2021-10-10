package chobo.springweb.controller;

import chobo.springweb.service.MsgPerTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MsgPerTimeControllerBase extends BaseWebSocketController {

    private final MsgPerTimeService service;

    @Autowired
    public MsgPerTimeControllerBase(MsgPerTimeService service) {
        this.service = service;
    }

    @Override
    void onMessage(String message) {
        this.service.handle(message);
    }
}
