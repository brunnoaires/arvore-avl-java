/*
 * Alunos: Brunno Aires & Luiz Fhellippe
 * Disciplina: Estrutura de Dados 2
 */

import java.util.Scanner;
public class AppArvore{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        ArvoreAVL arvore = new ArvoreAVL(new Elemento(teclado.nextInt()));
        arvore.calcularBalanceamento();
        arvore = arvore.verificaBalanceamento();
        System.out.println(arvore.printArvore(0));
        while(true){
            System.out.print("Digite um número: ");
            arvore = arvore.inserir(new Elemento(teclado.nextInt()));
            arvore.calcularBalanceamento();
            arvore = arvore.verificaBalanceamento();
            System.out.println(arvore.printArvore(0));
        }
    }
}