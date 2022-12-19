//testeunitário
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestPessoa {

    @Test
    public void testaPessoa() {
        Contrato contrato = new Contrato();
        contrato.setId("123");

        assertEquals("123", contrato.getId());

    }
    }
