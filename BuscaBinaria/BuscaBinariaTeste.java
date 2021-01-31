import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BuscaBinariaTeste {
    

    @Test 
    public void entradaDeValoresInteirosOrdenadosCrescente(){
        int [] arrayValoresDeEntrada = {1,2,3,4,5};

        BuscaBinaria buscador = new BuscaBinaria();

        // assertEquals ( VALOR ESPERADO, VALOR DE ENTRADA, DELTA (0.0001) )
        assertEquals(1, buscador.busca(arrayValoresDeEntrada, 2), 0.0001);
    }


    @Test 
    public void entradaDeValoresInteirosOrdenadosDecrescente(){
        int [] arrayValoresDeEntrada = {5,4,2,3,1};

        BuscaBinaria buscador = new BuscaBinaria();

        // assertEquals ( VALOR ESPERADO, VALOR DE ENTRADA, DELTA (0.0001) )
        assertEquals(3, buscador.busca(arrayValoresDeEntrada, 3), 0.0001);
    }

    @Test 
    public void entradaDeValoresInteirosOrdenadosAleatorios(){
        int [] arrayValoresDeEntrada = {2,5,4,8,1,3};

        BuscaBinaria buscador = new BuscaBinaria();

        // assertEquals ( VALOR ESPERADO, VALOR DE ENTRADA, DELTA (0.0001) )
        assertEquals(5, buscador.busca(arrayValoresDeEntrada, 3), 0.0001);
    }


}
