package designpatterns.creational.singleton;

public class Client {
    private static Client instance;

    private Client() {}

    public static Client getInstance() {
        if (instance == null) {
            synchronized(Client.class) {
                if (instance == null) {
                    instance = new Client();
                }
            }
        }
        return instance;
    }
}
