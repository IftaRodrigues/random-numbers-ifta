/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;

/**
 *
 * @author aluno
 */
public class RealDistributionAdapter implements Aleatorio{
    
    RealDistribution normalRandom = new NormalDistribution();
    
    @Override
    public double GerarNumAleatorio(long seed) {  
        normalRandom.reseedRandomGenerator(seed);
        
        return normalRandom.sample();
    }

    @Override
    public double[] GerarConjuntoNumAleatorio(int size) {  
        return normalRandom.sample(size); 
    }
    
}
