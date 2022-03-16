package framework.NotificationSystem;

public interface Observer {
    void send(String destination, String message);
}
