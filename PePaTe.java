import java.util.*;
public class PePaTe {
    public static void main(String [] args){

    Scanner tentativa = new Scanner(System.in);
    Random possibilidade = new Random();

    int PC = 0, user = 0, EMPATE = 0, tentativas; boolean win = false;

    System.out.println(Cores.CYAN + "\nBEM VINDO A LOTERIA JOKENPO, CADA FICHA CUSTA R$ 2 REIAS, CASO GANHE LEVA O DOBRO\n" + Cores.RESET);
    System.out.println("Digite seu nome: ");
    String nome = tentativa.nextLine();
    System.out.println("Quantas fichas ira querer? ");
    tentativas = tentativa.nextInt();

    while(tentativas > 0 && win == false) {
        System.out.println(Cores.CYAN + "\nEscolha: (1) para Tesoura, (2) para Papel e (3) para Pedra. \nQual a sua escolha? "+ Cores.RESET);
        int A = tentativa.nextInt();
        int B = possibilidade.nextInt(3)+1;
        if(A == B){
            System.out.println("Infelizmente deu empate. \n" );  // EMPATE
            EMPATE++;--tentativas;
        }if(A == 3 && B == 1){
            System.out.println(nome+", Ganhou!. \n" ); // PEDRA > TESOURA
            user++;--tentativas;
        }else if (A == 3 && B == 2){
            System.out.println("PC, Ganhou!. \n" ); // PEDRA < PAPEL
            PC++;--tentativas;
        }if(A == 1 && B == 2){
            System.out.println(nome+", Ganhou!. \n" ); // TESOURA > PAPEL
            user++;--tentativas;
        }else if (A == 1 && B == 3){
            System.out.println("PC, Ganhou!. \n" ); // TESOURA < PEDRA
            PC++;--tentativas;
        }if(A == 2 && B == 3){
            System.out.println(nome+", Ganhou!. \n" ); // PAPEL > PEDRA
            user++;--tentativas;
        }else if (A == 2 && B == 1){
            System.out.println("PC, Ganhou!. \n" ); // PAPEL < TEROURA
            PC++;--tentativas;
        } 
        System.out.println("Pc ganhou " + PC + " vezes\n");
        System.out.println(nome +" ganhou " + user + " vezes\n");
        System.out.println("Empatou " + EMPATE + " vezes\n");
        System.out.println("Resta " + tentativas + " Tentativas\n");
        System.out.println("\nPARABENS "+nome+", VOCE GANHOU R$ " +user*2+" REAIS" );
        }
    }
}
