package chobo.springweb.controller;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websockets")
public abstract class BaseWebSocketController {
    @OnOpen
    public void onOpen(Session session) {
        // do something
    }

    @OnClose
    public void onClose(Session session) {
        // do something
    }

    @OnError
    public void onError(Throwable e) {
        // do something
    }

    @OnMessage
    abstract void onMessage(String message);
}
