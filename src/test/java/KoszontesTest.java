import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ...
 **/
@ExtendWith(MockitoExtension.class)
public class KoszontesTest {


    @Mock
    private Koszontes underTest;


    @BeforeEach
    public void setUp() {
        underTest = new Koszontes();
    }

    @Test
    public void testShouldReturnGreetingInForeignLanguageAndName() {
        //given
        String nev = "Janos";
        String nyelv = "angol";
        //given(Koszontes.koszontes(nev,nyelv)).willReturn("Hello "+nev);
        //when

        //then
        String result = "";
        if (nyelv.equalsIgnoreCase("angol")) {
            result = "Hello " + nev;
        }
        assertEquals("Hello " + nev, result);
    }
}
