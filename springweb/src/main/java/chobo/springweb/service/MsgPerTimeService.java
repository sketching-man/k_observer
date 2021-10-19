package chobo.springweb.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MsgPerTimeService extends BaseKafkaService {

    @Override
    @KafkaListener(topics = "mytopic", groupId = "mytopic")
    public void consume(String message) throws IOException {
        System.out.println(this.getClass().toString() + message);
    }
}
