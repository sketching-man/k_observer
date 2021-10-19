package chobo.springweb.service;

import java.io.IOException;

public abstract class BaseKafkaService {
    abstract void consume(String message) throws IOException;
}
