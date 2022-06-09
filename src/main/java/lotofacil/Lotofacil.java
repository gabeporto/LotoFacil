/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lotofacil;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 *
 * @author Gabriel Porto
 */
public class Lotofacil {
    private int[] novaAposta;
    private int[] resultadoSorteio;
    private int acertos = 0;
    Random rand = new Random();
    
    public int[] getNovaAposta() {
        return novaAposta;
    }

    public int[] getResultadoSorteio() {
        return resultadoSorteio;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setNovaAposta(int[] novaAposta) {
        this.novaAposta = novaAposta;
    }

    public void simularSorteio() {
                
        int valorSorteado;
        resultadoSorteio = new int[15];

        for(int i = 0; i< resultadoSorteio.length; i++){
             valorSorteado = rand.nextInt(25)+1;
             for(int j = 0; j < resultadoSorteio.length; j++){
                   if(valorSorteado == resultadoSorteio[j] && j != i){
                         valorSorteado = rand.nextInt(25) + 1;
                   }else{
                        resultadoSorteio[i] = valorSorteado;
                   }
             }
        }
    }
    
    public void odernarValores() {
        Arrays.sort(this.novaAposta);
        Arrays.sort(this.resultadoSorteio);  
    }
    
    public void calcularAcertos() {
        for (int i = 0; i < 15; ++i) {
            for (int j = 0; j < 15; ++j) {
                if (this.novaAposta[i] == this.resultadoSorteio[j]) {
                    this.acertos += 1;
                }
            }
        }
    }
}
