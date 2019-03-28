package at.sadra.java.junittest;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CustomArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext){
        return Stream.of(
                Arguments.of("Sadra", 28),
                Arguments.of("Sara", 18),
                Arguments.of("Nana", 33),
                Arguments.of("Nini", 6)
        );
    }
}
