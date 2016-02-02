
package campominado;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Lizandra Ottmann
 */

/**
* Gera o Tabuleiro de acordo com o Nível Escolhido pelo Usuario
*/

public final class Tabuleiro {
    

    public static final int Inicial = 1;
    public static final int Intermediario = 2;
    public static final int Avancado = 3;
    private int[][] minas;
    private char[][] campo;
    private int linha, coluna;
    protected int nivel;
    public int _opcaoNivel;
    public int _opcaoLeitura;
    private Minas _ObjMina;
    Scanner entrada = new Scanner(System.in);
    Random random = new Random();
    Scanner ent;

    public Tabuleiro(ObjetoJogo _ObjJogo) {



        System.out.println("Escolha o Nível do Jogo: \n1 - Iniciante \n2 - Intermediário \n3 - Avançado\n");
        _opcaoNivel = entrada.nextInt();

        System.out.println("Escolha o opcao de distribucao das minas: \n1 - Arquivo \n2 - Aleatorio \n");
        _opcaoLeitura = entrada.nextInt();

        switch (_opcaoNivel) {
            case Inicial:
                
                minas = new int[_ObjJogo.getLinha()][_ObjJogo.getColuna()];
                campo = new char[_ObjJogo.getLinha()][_ObjJogo.getColuna()];

                //  _ObjJogo = new ObjetoJogo();
                _ObjJogo.setNivelJogo(_opcaoNivel);
                _ObjJogo.setTipoLeitura(_opcaoLeitura);
                _ObjJogo.setLinha(11);
                _ObjJogo.setColuna(11);
                _ObjJogo.setQt_Mina(10);
                _ObjJogo.setValor_Linha(11);
                _ObjMina = new Minas(_ObjJogo);

                break;

            case Intermediario:

                minas = new int[_ObjJogo.getLinha()][_ObjJogo.getColuna()];
                campo = new char[_ObjJogo.getLinha()][_ObjJogo.getColuna()];

                _ObjJogo.setNivelJogo(_opcaoNivel);
                _ObjJogo.setTipoLeitura(_opcaoLeitura);
                _ObjJogo.setLinha(18);
                _ObjJogo.setColuna(18);
                _ObjJogo.setQt_Mina(40);
                _ObjJogo.setValor_Linha(18);
                _ObjMina = new Minas(_ObjJogo);

                //  mina = new Minas();


                break;
            case Avancado:
                
                minas = new int[_ObjJogo.getLinha()][_ObjJogo.getColuna()];
                campo = new char[_ObjJogo.getLinha()][_ObjJogo.getColuna()];


                _ObjJogo.setNivelJogo(_opcaoNivel);
                _ObjJogo.setTipoLeitura(_opcaoLeitura);
                _ObjJogo.setLinha(24);
                _ObjJogo.setColuna(24);
                _ObjJogo.setQt_Mina(99);
                _ObjJogo.setValor_Linha(24);
                _ObjMina = new Minas(_ObjJogo);

                //  mina = new Minas();

                break;

        }


    }
}
