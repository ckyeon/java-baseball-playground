package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
    }

    @Test
    void substring() {
        String actual = "(1,2)";
        actual = actual.substring(1, actual.length() - 1);

        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("StringIndexOutOfBoundsException")
    void charAt() {
        assertThatThrownBy(() -> {
            char actual = "abc".charAt(5);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 5");
    }
}
