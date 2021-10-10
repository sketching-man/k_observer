package chobo.springweb.controller;

import chobo.springweb.service.SizePerMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SizePerMsgControllerBase extends BaseWebSocketController {

    private final SizePerMsgService service;

    @Autowired
    public SizePerMsgControllerBase(SizePerMsgService service) {
        this.service = service;
    }

    @Override
    void onMessage(String message) {
        this.service.handle(message);
    }
}
