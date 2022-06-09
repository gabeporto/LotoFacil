/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teste;

import dialogo.Dialogo;
import lotofacil.Lotofacil;

/**
 *
 * @author Gabriel Porto
 */
public class Testador {

    public static void main(String[] args) {
        boolean sair = false;
        int[] novaAposta;
        int[] resultadoSorteio;
        Dialogo dialog = new Dialogo();
        Lotofacil loto = new Lotofacil();
        novaAposta = new int[15];
        resultadoSorteio = new int[15];
        
        
        while(sair == false) {
            int opcao = dialog.mostrarMenu();
        
            if(opcao == 1) {
                novaAposta = dialog.lerAposta();
                dialog.setNovaAposta(novaAposta);
                loto.setNovaAposta(dialog.getNovaAposta());
            } else if(opcao == 2) {
                loto.simularSorteio();
                dialog.setResultadoSorteio(loto.getResultadoSorteio());
                loto.odernarValores();
                loto.calcularAcertos();
                dialog.setAcertos(loto.getAcertos());
                dialog.apresentarResultado();
            } else if(opcao == 3) {
                sair = true;
            }
        }  
    }
}
