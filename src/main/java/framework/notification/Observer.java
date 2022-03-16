package framework.notification;

public interface Observer {
    void send(String destination, String message);
}
