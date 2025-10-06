import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calculadora;
    @BeforeEach
    public void setup(){
        calculadora = new Calculadora();
        System.out.println("Antes do teste.....");

    }
    @Test
    public void deveSomarDoisValores() {
        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.somar(valorA, valorB);

        Assertions.assertEquals(30.0, resultado);
    }
    @Test
    public void deveDividirDoisValores(){
        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.dividir(valorA, valorB);

        Assertions.assertEquals(0.5, resultado);
    }

    @Test
    public void deveMultiplicarDoisValores(){
        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.multiplicar(valorA, valorB);

        Assertions.assertEquals(200.0, resultado);
    }
    @Test
    public void deveDiminuirDoisValores(){
        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.diminuir(valorA, valorB);

        Assertions.assertEquals(-10.0, resultado);
    }
}