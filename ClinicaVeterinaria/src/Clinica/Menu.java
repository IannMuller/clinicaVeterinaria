package Clinica;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean continuar=true;
        int opcao;
        Scanner entrada = new Scanner(System.in);
        do
        {
            System.out.println("\t\tBem vindo a nossa clinica veterinaria:");
            System.out.println("\t1. Consultar em Emergencia.");
            System.out.println("\t2. Pesquisar M�dicos, Agenda, Animais, Conv�nios.");
            System.out.println("\t3. Agendar um procedimento.");
            System.out.println("\t0. Sair");
            
            System.out.print("\nInsira a op��o desejada: ");
            opcao = entrada.nextInt();
            
            if(opcao == 0){
                continuar = false;
                System.out.println("Programa finalizado.");
            }
            else{
                System.out.printf("\n\n\n\n\n\n");
            }
            
        } while( continuar );
        
        //Puxar as fun��es Agendamento, Emergencia, PMedicos, PAgenda, PAanimais, PConvenios..
    }
}