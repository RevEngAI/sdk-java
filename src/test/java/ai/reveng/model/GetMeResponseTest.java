package ai.reveng.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.junit.jupiter.api.Test;

/**
 * Tests for GetMeResponse deserialization.
 */
public class GetMeResponseTest {

    @Test
    public void testCreationFieldParsesRfc3339WithTimezone() throws IOException {
        String json = "{"
                + "\"username\": \"testuser\","
                + "\"user_id\": 1,"
                + "\"first_name\": \"Test\","
                + "\"last_name\": \"User\","
                + "\"email\": \"test@example.com\","
                + "\"creation\": \"2024-06-15T10:30:00+05:30\","
                + "\"tutorial_seen\": true,"
                + "\"role\": \"USER\""
                + "}";

        GetMeResponse response = GetMeResponse.fromJson(json);

        assertNotNull(response.getCreation());
        assertEquals(
                OffsetDateTime.of(2024, 6, 15, 10, 30, 0, 0, ZoneOffset.ofHoursMinutes(5, 30)),
                response.getCreation()
        );
    }

    @Test
    public void testCreationFieldParsesRfc3339WithUtcZ() throws IOException {
        String json = "{"
                + "\"username\": \"testuser\","
                + "\"user_id\": 1,"
                + "\"first_name\": \"Test\","
                + "\"last_name\": \"User\","
                + "\"email\": \"test@example.com\","
                + "\"creation\": \"2024-06-15T10:30:00Z\","
                + "\"tutorial_seen\": true,"
                + "\"role\": \"USER\""
                + "}";

        GetMeResponse response = GetMeResponse.fromJson(json);

        assertNotNull(response.getCreation());
        assertEquals(
                OffsetDateTime.of(2024, 6, 15, 10, 30, 0, 0, ZoneOffset.UTC),
                response.getCreation()
        );
    }

    @Test
    public void testCreationFieldParsesRfc3339WithNegativeOffset() throws IOException {
        String json = "{"
                + "\"username\": \"testuser\","
                + "\"user_id\": 1,"
                + "\"first_name\": \"Test\","
                + "\"last_name\": \"User\","
                + "\"email\": \"test@example.com\","
                + "\"creation\": \"2024-06-15T10:30:00-04:00\","
                + "\"tutorial_seen\": true,"
                + "\"role\": \"USER\""
                + "}";

        GetMeResponse response = GetMeResponse.fromJson(json);

        assertNotNull(response.getCreation());
        assertEquals(
                OffsetDateTime.of(2024, 6, 15, 10, 30, 0, 0, ZoneOffset.ofHours(-4)),
                response.getCreation()
        );
    }

    @Test
    public void testCreationFieldParsesRfc3339WithFractionalSecondsAndTimezone() throws IOException {
        String json = "{"
                + "\"username\": \"testuser\","
                + "\"user_id\": 1,"
                + "\"first_name\": \"Test\","
                + "\"last_name\": \"User\","
                + "\"email\": \"test@example.com\","
                + "\"creation\": \"2024-06-15T10:30:00.123456+02:00\","
                + "\"tutorial_seen\": true,"
                + "\"role\": \"USER\""
                + "}";

        GetMeResponse response = GetMeResponse.fromJson(json);

        assertNotNull(response.getCreation());
        assertEquals(
                OffsetDateTime.of(2024, 6, 15, 10, 30, 0, 123456000, ZoneOffset.ofHours(2)),
                response.getCreation()
        );
    }

    @Test
    public void testCreationFieldParsesRfc3339WithNanosecondPrecision() throws IOException {
        String json = "{"
                + "\"username\": \"testuser\","
                + "\"user_id\": 1,"
                + "\"first_name\": \"Test\","
                + "\"last_name\": \"User\","
                + "\"email\": \"test@example.com\","
                + "\"creation\": \"2024-06-15T10:30:00.123456789+03:00\","
                + "\"tutorial_seen\": true,"
                + "\"role\": \"USER\""
                + "}";

        GetMeResponse response = GetMeResponse.fromJson(json);

        assertNotNull(response.getCreation());
        assertEquals(
                OffsetDateTime.of(2024, 6, 15, 10, 30, 0, 123456789, ZoneOffset.ofHours(3)),
                response.getCreation()
        );
    }
}
