package Examen;

import org.junit.jupiter.api.Test;

import static Examen.examen.ej9;
import static org.junit.jupiter.api.Assertions.*;

class examenTest {

    @Test
    public void testEj9() {
        char tipo = 'N';
        double sueldo = 1000;
        int antiguedad = 1;
        double resultadoEsperado = 1516.67;

        double resultadoObtenido = ej9(tipo, sueldo, antiguedad);

        assertEquals(resultadoEsperado, resultadoObtenido);

    }
    @Test
    public void tes2tej9() {
        char tipo = 'E';
        double sueldo = 1001;
        int antiguedad = 1;

        double resultadoEsperado = 2002.0;

        double resultadoCorrecto = ej9(tipo, sueldo, antiguedad);

        assertEquals(resultadoEsperado, resultadoCorrecto);
    }
    @Test
    public void test3ej9() {
        char tipo = 'R';
        double sueldo = 1000;
        int antiguedad = 1;

        double resultadoEsperado = 2002.0;

        double resultadoCorrecto = ej9(tipo, sueldo, antiguedad);

        assertNotEquals(resultadoEsperado, resultadoCorrecto);
    }
    @Test
    public void test4Ej9() {
        char tipo = 'R';
        double sueldo = 1000;
        int antiguedad = 1;

        double resultadoEsperado = 1000.0;

        double resultadoCorrecto = ej9(tipo, sueldo, antiguedad);

        assertNotEquals(resultadoEsperado, resultadoCorrecto);
    }
    @Test
    public void test5Ej9() {
        char tipo = 'N';
        double sueldo = 1000;
        int antiguedad = 0;

        double resultadoEsperado = 1100.0;

        double resultadoCorrecto = ej9(tipo, sueldo, antiguedad);

        assertNotEquals(resultadoEsperado, resultadoCorrecto, 0.0);
    }
    @Test
    public void test6Ej9() {
        char tipo = 'N';
        double sueldo = 999;
        int antiguedad = 1;

        double resultadoEsperado = 999.0;

        double resultadoCorrecto = ej9(tipo, sueldo, antiguedad);

        assertNotEquals(resultadoEsperado, resultadoCorrecto);
    }


}
