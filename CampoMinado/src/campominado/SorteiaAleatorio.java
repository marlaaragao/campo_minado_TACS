package campominado;

import java.util.Random;
import java.util.Scanner;


 /** Implementação da Estratégia de Distribuição de Bombas Aleatória 
 * tem como paramentro o objeto Linha da Classe Objeto
 */

public class SorteiaAleatorio implements StrategyMinas {

    private int[][] minas;
    private char[][] campo;
    Random random = new Random();
    Scanner entr;

    @Override
   
    public void novasMinas(ObjetoJogo _ObjJogo) {


        if (_ObjJogo.getLinha() == 11) {
            
            int[][] _Minas = _ObjJogo.getMinas();

            boolean sorteado;
            int linha, coluna;
            for (int i = 0; i < 11; i++) {

                do {
                    linha = random.nextInt(_ObjJogo.getLinha() - 1) + 1;
                    coluna = random.nextInt(_ObjJogo.getColuna() - 1) + 1;

                    if (_Minas[linha][coluna] == -1) {
                        sorteado = true;
                    } else {
                        sorteado = false;
                    }
                } while (sorteado);

                _Minas[linha][coluna] = -1;
            }

            _ObjJogo.setMinas(_Minas);

        }
        
       else if (_ObjJogo.getLinha() == 18) {
            int[][] _Minas = _ObjJogo.getMinas();

            boolean sorteado;
            int linha, coluna;
            for (int i = 0; i < 40; i++) {

                do {
                    linha = random.nextInt(_ObjJogo.getLinha() - 2) + 1;
                    coluna = random.nextInt(_ObjJogo.getColuna() -2) + 1;

                    if (_Minas[linha][coluna] == -1) {
                        sorteado = true;
                    } else {
                        sorteado = false;
                    }
                } while (sorteado);

                _Minas[linha][coluna] = -1;
            }

            _ObjJogo.setMinas(_Minas);

        }
       
       else if (_ObjJogo.getLinha() == 24) {
            int[][] _Minas = _ObjJogo.getMinas();

            boolean sorteado;
            int linha, coluna;
            for (int i = 0; i < 99; i++) {

                do {
                    linha = random.nextInt(_ObjJogo.getLinha() - 1) + 1;
                    coluna = random.nextInt(_ObjJogo.getColuna() - 1) + 1;

                    if (_Minas[linha][coluna] == -1) {
                        sorteado = true;
                    } else {
                        sorteado = false;
                    }
                } while (sorteado);

                _Minas[linha][coluna] = -1;
            }

            _ObjJogo.setMinas(_Minas);

        }

    }
}
