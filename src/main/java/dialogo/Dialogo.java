/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialogo;

import java.util.Scanner;

/**
 *
 * @author Gabriel Porto
 */
public class Dialogo {
    private int[] novaAposta;
    private int[] resultadoSorteio;
    private int acertos = 0;
    Scanner ler = new Scanner(System.in);

    public void setNovaAposta(int[] novaAposta) {
        this.novaAposta = novaAposta;
    }

    public int[] getNovaAposta() {
        return novaAposta;
    }

    public int[] getResultadoSorteio() {
        return resultadoSorteio;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public void setResultadoSorteio(int[] resultadoSorteio) {
        this.resultadoSorteio = resultadoSorteio;
    }
    
    public int mostrarMenu() {
        System.out.println("\n\nMENU DE OPÇÕES");
        System.out.println("1. Fazer uma nova aposta");
        System.out.println("2. Simular um sorteio");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        return Integer.parseInt(ler.next());
    }
    
    public int[] lerAposta() {
        int[] aposta;
        aposta = new int[15];
        for(int i = 0; i < 15; ++i) {
            System.out.printf("%s. Escolha um número de 1 a 25: ", i+1);
            aposta[i] = Integer.parseInt(ler.next());
        }
        return aposta;
    }
        
    public void apresentarResultado() {
        System.out.println("\nSua aposta: ");
        for(int i = 0; i < 15; ++i) {
            System.out.printf("%s  ", this.novaAposta[i]);
        }
        
        System.out.println("\nSorteio: ");
        for(int i = 0; i < 15; ++i) {
            System.out.printf("%s  ", this.resultadoSorteio[i]);
        }
        
        System.out.printf("\nAcertos: %s", this.acertos);
    }      
}
    
