package at.sadra.java.junittest;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class CustomArgumentsConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        return String.valueOf(source).toLowerCase();
    }
}
