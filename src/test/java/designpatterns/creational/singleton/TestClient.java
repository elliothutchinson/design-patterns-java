package designpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestClient {

    @Test
	@DisplayName("single instance")
	void singleInstance() {
        Client client1 = Client.getInstance();
        Client client2 = Client.getInstance();

        assertSame(client1, client2, "Instances should be same object");
	}
}
