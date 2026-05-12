package ai.reveng.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Verifies enumUnknownDefaultCase=true: unknown enum values from the API are
 * mapped to UNKNOWN_DEFAULT_OPEN_API instead of throwing, so the SDK can
 * deserialize responses that introduce new enum values before the SDK is
 * regenerated.
 */
public class EnumUnknownDefaultTest {

    @Test
    public void unknownValueMapsToUnknownDefaultOpenApi() {
        Order order = Order.fromValue("a_value_that_does_not_exist");

        assertEquals("UNKNOWN_DEFAULT_OPEN_API", order.name());
        assertEquals("unknown_default_open_api", order.getValue());
    }
}
