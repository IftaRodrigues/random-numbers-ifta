/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class RandomAdapter implements Aleatorio{
    
    Random random;

    @Override
    public double GerarNumAleatorio(long seed) {
        random=new Random(seed);
        
        return random.nextDouble();
        
    }

    @Override
    public double[] GerarConjuntoNumAleatorio(int size) {
        random= new Random();
        long streamSize = (long) size;
        double[] numeros = random.doubles(streamSize).toArray();
        
        return numeros;
    }
    
}
