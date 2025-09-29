/*
 * Model for AnyOf. The generator is not creating this model automatically, so we create it manually.
 */
package ai.reveng.model;

import java.util.Objects;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.HashMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;

/**
 * AnyOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-26T17:18:42.237250+01:00[Europe/London]", comments = "Generator version: 7.15.0")
public class AnyOf extends AbstractOpenApiSchema {

    private static final Map<String, Class<?>> schemas;

    static {
        // Initialize the schemas for validation
        schemas = new HashMap<String, Class<?>>();
        schemas.put("Object", Object.class);
        schemas.put("String", String.class);
        schemas.put("Integer", Integer.class);
        schemas.put("Boolean", Boolean.class);
        schemas.put("Double", Double.class);
        schemas.put("Float", Float.class);
    }

    public AnyOf() {
        super("anyOf", Boolean.FALSE);
    }

    public AnyOf(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AnyOf.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check the instance parameter is valid against the anyOf child schemas
     *
     * @param instance the actual instance of the anyOf schema
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance == null) {
            super.setActualInstance(instance);
            return;
        }

        // The instance can be any type since this is anyOf
        super.setActualInstance(instance);
    }

    /**
     * Get the actual instance, which can be the following:
     * Object, String, Integer, Boolean, Double, Float, or any other type
     *
     * @return The actual instance (Object)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IllegalArgumentException if the JSON Element is invalid with respect to AnyOf
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IllegalArgumentException {
        // Since this is anyOf, we accept any valid JSON element
        if (jsonElement == null) {
            throw new IllegalArgumentException("JsonElement cannot be null");
        }
        // Any valid JSON element is acceptable for anyOf
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnyOf anyOf = (AnyOf) o;
        return Objects.equals(this.getActualInstance(), anyOf.getActualInstance()) &&
                Objects.equals(this.isNullable(), anyOf.isNullable()) &&
                Objects.equals(this.getSchemaType(), anyOf.getSchemaType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getActualInstance(), isNullable(), getSchemaType());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnyOf {\n");
        sb.append("    actualInstance: ").append(toIndentedString(getActualInstance())).append("\n");
        sb.append("    isNullable: ").append(toIndentedString(isNullable())).append("\n");
        sb.append("    schemaType: ").append(toIndentedString(getSchemaType())).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
