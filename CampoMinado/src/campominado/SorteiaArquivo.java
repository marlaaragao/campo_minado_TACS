package campominado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Lizandra Ottmann
 */

 /** Implementação da Estratégia de Distribuição de Bombas que lê a partir de um arquivo 
 * tem como paramentro o objeto Linha da Classe Objeto
 */

public class SorteiaArquivo implements StrategyMinas {

    private int[][] minas;
    private char[][] campo;
    private int linha, coluna;

    @Override
   
    public void novasMinas(ObjetoJogo _ObjJogo) {

        if (_ObjJogo.getLinha() == 11) {
            try {
                int[][] _Minas = _ObjJogo.getMinas();

                _Minas[linha][coluna] = -1;

                File Arquivo = new File("MinasNivelInicial.txt");
                FileReader leitor = new FileReader(Arquivo);
                BufferedReader leitorBuf = new BufferedReader(leitor);
                String _Linha = "";

                while ((_Linha = leitorBuf.readLine()) != null) {

                    String colunas[] = _Linha.split(",");
                    linha = Integer.parseInt(colunas[0].substring(0, colunas[0].indexOf(";")));/* Indexof pega as posições antes do ;*/
                    coluna = Integer.parseInt(colunas[0].substring(colunas[0].indexOf(";") + 1, colunas[0].length())); /*aqui pegara o tamanho total depois do ;*/

                    _Minas[linha][coluna] = -1;
                }
                leitorBuf.close();
                _ObjJogo.setMinas(_Minas);
            } catch (Exception ex) {
                System.out.println("Erro ao sortear uma palavra para o jogo : " + ex.toString());
            };
        } else if (_ObjJogo.getLinha() == 18) {
            try {
                int[][] _Minas = _ObjJogo.getMinas();

                _Minas[linha][coluna] = -1;

                File Arquivo = new File("MinasNivelIntermediario.txt");
                FileReader leitor = new FileReader(Arquivo);
                BufferedReader leitorBuf = new BufferedReader(leitor);
                String _Linha = "";

                while ((_Linha = leitorBuf.readLine()) != null) {

                    String colunas[] = _Linha.split(",");
                   
                    linha = Integer.parseInt(colunas[0].substring(0, colunas[0].indexOf(";")));// Indexof pega as posições antes do ;
                    coluna = Integer.parseInt(colunas[0].substring(colunas[0].indexOf(";") + 1, colunas[0].length())); //aqui pegara o tamanho total depois do ;

                    _Minas[linha][coluna] = -1;
                }
                leitorBuf.close();
                _ObjJogo.setMinas(_Minas);
            } catch (Exception ex) {
                System.out.println("Erro ao sortear uma palavra para o jogo : " + ex.toString());
            };
        } else if (_ObjJogo.getLinha() == 24) {
            try {
                int[][] _Minas = _ObjJogo.getMinas();

                _Minas[linha][coluna] = -1;
                
                File Arquivo = new File("MinasNivelAvancado.txt");
                FileReader leitor = new FileReader(Arquivo);
                BufferedReader leitorBuf = new BufferedReader(leitor);
                String _Linha = "";

                while ((_Linha = leitorBuf.readLine()) != null) {

                    String colunas[] = _Linha.split(",");
                   
                    linha = Integer.parseInt(colunas[0].substring(0, colunas[0].indexOf(";")));// Indexof pega as posições antes do ;
                    coluna = Integer.parseInt(colunas[0].substring(colunas[0].indexOf(";") + 1, colunas[0].length())); //aqui pegara o tamanho total depois do ;

                    _Minas[linha][coluna] = -1;
                }
                leitorBuf.close();
                _ObjJogo.setMinas(_Minas);
            } catch (Exception ex) {
                System.out.println("Erro ao sortear uma palavra para o jogo : " + ex.toString());
            };
        }
    }
}
