package chobo.springweb.controller;

import chobo.springweb.service.SizePerMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class SizePerMsgControllerBase extends BaseWebSocketController {

    private final SizePerMsgService service;

    @Autowired
    public SizePerMsgControllerBase(SizePerMsgService service) {
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
