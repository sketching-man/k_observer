package chobo.springweb.controller;

import chobo.springweb.service.MsgPerTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class MsgPerTimeControllerBase extends BaseWebSocketController {

    private final MsgPerTimeService service;

    @Autowired
    public MsgPerTimeControllerBase(MsgPerTimeService service) {
        this.service = service;
    }

    @Override
    void onMessage(String message) {
        try {
            this.service.consume(message);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
