import config.RandomAdapter;
import config.RealDistributionAdapter;
import java.util.Arrays;

/**
 * @author Manoel Campos da Silva Filho
 */
public class Principal {
    public static void main(String[] args) {
        /*Seed (semente) é o valor inicial a ser utilizado pelos geradores de números aleatórios.
        * Se for utilizada uma mesma seed ao executar a aplicação várias vezes, os
        * mesmos exatos valores serão gerados. Alterando a seed, a sequência de valores muda.
        */
        final long seed = 123;

        

        

        RandomAdapter randomAdapter= new RandomAdapter();
        RealDistributionAdapter distributionAdapter = new RealDistributionAdapter();

        //Total de números a serem gerados em cada gerador
        final int TOTAL_NUMEROS = 4;
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.println("Número aleatório seguindo distribuição Normal usando biblioteca Apache Commons Math: " + distributionAdapter.GerarNumAleatorio(seed));
            System.out.println("10 números aleatórios seguindo distribuição Normal usando biblioteca Apache Commons Math: " + distributionAdapter.GerarConjuntoNumAleatorio(10));
            
            System.out.println("Número aleatório seguindo distribuição Uniforme usando classe Random: " + randomAdapter.GerarNumAleatorio(seed));
            
            double[] numeros = randomAdapter.GerarConjuntoNumAleatorio(4);
            System.out.println("10 números aleatórios seguindo distribuição Uniforme usando classe Random: " + Arrays.toString(numeros));
            
            System.out.println();
        }
    }

}
