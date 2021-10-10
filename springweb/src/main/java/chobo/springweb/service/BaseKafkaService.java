package chobo.springweb.service;

public abstract class BaseKafkaService {
    abstract void handle(String message);
}
