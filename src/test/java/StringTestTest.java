import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class StringTestTest {
    StringTest stringTest;

    @Test
    @DisplayName("요구사항1) ,로 잘 나뉘어지는지 테스트")
    void getSplitStringTest() {
        stringTest = new StringTest("1,2");
        String[] splitString = stringTest.getSplitString();
        Assertions.assertThat(splitString).contains("1", "2");
    }

    @Test
    @DisplayName("요구사항2) 괄호가 제거된 문자열 반환 테스트")
    void getRemoveParenthesisTest() {
        stringTest = new StringTest("(1,2)");
        String subString = stringTest.getRemoveParenthesis();
        Assertions.assertThat(subString).isEqualTo("1,2");
    }

    @Test
    @DisplayName("요구사항3) 특정 위치의 문자 반환 테스트")
    void getStringIndexTest() {
        int index = 1;
        stringTest = new StringTest("abc");
        char word = stringTest.getStringIndex(index);
        Assertions.assertThat(word).isEqualTo(stringTest.string.charAt(index));
    }

    @Test
    @DisplayName("요구사항3) index 범위 넘어가면 예외 (예외발생시 pass)")
    void returnIndexException() {
        int index = 10;
        stringTest = new StringTest("abc");

        Assertions.assertThatThrownBy(() -> {
            stringTest.getStringIndex(index);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("%d", index);
    }


}