import com.testing.db_connection.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    private DatabaseConnection databaseConnection;

    @BeforeEach
    void setUp() {
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }

    @Test
    void testConnection() {
        assertTrue(databaseConnection.isConnected());
    }

    @AfterEach
    void tearDown() {
        databaseConnection.disconnect();
        assertFalse(databaseConnection.isConnected());
    }
}
