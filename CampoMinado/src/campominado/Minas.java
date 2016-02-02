package campominado;


import java.util.Scanner;

/**
 *
 * @author Lizandra Ottmann
 */

/**
 * Esta Classe utiliza objeto da Interface StrategyMinas
 * que é instanciado em momento de execução e de acordo com 
 * a escolha do usuário para gerar as minas será utilizado
 * 
 */

public class Minas {

    public static final int arquivo = 1;
    public static final int aleatorio = 2;
    protected int linha,coluna;
   
    public int[][] _Minas;
    public char[][] _Campo;
    
    protected StrategyMinas strategyMinas;
    public Scanner entrada = new Scanner(System.in);
    Scanner entr;

    public Minas(ObjetoJogo _ObjJogo) {

        if (_ObjJogo != null) {

            switch (_ObjJogo.getTipoLeitura()) {

                case arquivo:

                    _Minas = new int[_ObjJogo.getLinha()][_ObjJogo.getColuna()];
                    _Campo = new char[_ObjJogo.getLinha()][_ObjJogo.getColuna()];

                    strategyMinas = new SorteiaArquivo();

                    this.entr = new Scanner(System.in);

                    Seta_Minas(_ObjJogo); // coloca 0 em todas as posições do tabuleiro de minas

                    strategyMinas.novasMinas(_ObjJogo);

                    Preenche_Dicas(_ObjJogo);//preenche o tabuleiro de minas com o número de minas ao redor
                    Seta_Campo(_ObjJogo);

                    _ObjJogo.setCampo(_Campo);
                    _ObjJogo.setMinas(_Minas);


                    break;

                case aleatorio:
                    _Minas = new int[_ObjJogo.getLinha()][_ObjJogo.getColuna()];
                    _Campo = new char[_ObjJogo.getLinha()][_ObjJogo.getColuna()];

                    if (_ObjJogo.getMinas() == null && _ObjJogo.getCampo() == null) {

                        _Minas = new int[_ObjJogo.getLinha()][_ObjJogo.getColuna()];
                        _Campo = new char[_ObjJogo.getLinha()][_ObjJogo.getColuna()];


                        Seta_Minas(_ObjJogo);
                        strategyMinas = new SorteiaAleatorio();
                        strategyMinas.novasMinas(_ObjJogo);

                        Preenche_Dicas(_ObjJogo);
                        Seta_Campo(_ObjJogo);

                        break;
                    }
            }

        }

    }

    public Minas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean Ganhou(ObjetoJogo _ObjJogo) {
        _Campo = _ObjJogo.getCampo();

        int count = 0;
        for (int line = 1; line < _ObjJogo.getLinha() - 1; line++) {
            for (int column = 1; column < _ObjJogo.getColuna() - 1; column++) {
                if (_Campo[line][column] == '_') {
                    count++;
                }
            }
        }

        _ObjJogo.setCampo(_Campo);

        if (count == _ObjJogo.getLinha()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param _ObjJogo
     */
    public void Minas_Ao_Redor(ObjetoJogo _ObjJogo) {

        _Minas = _ObjJogo.getMinas();
        _Campo = _ObjJogo.getCampo();

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if ((_Minas[linha + i][coluna + j] != -1) && (linha != 0 && linha != _ObjJogo.getLinha() - 1 && coluna != 0 && coluna != _ObjJogo.getColuna() - 1)) {
                    _Campo[linha + i][coluna + j] = Character.forDigit(_Minas[linha + i][coluna + j], _ObjJogo.getLinha());
                }
            }
        }

        _ObjJogo.setMinas(_Minas);
        _ObjJogo.setCampo(_Campo);

    }

    /**
     *
     * @param _ObjJogo
     * @return
     */
    public boolean Set_Posicao(ObjetoJogo _ObjJogo) {

        _Campo = _ObjJogo.getCampo();

        do {
            System.out.print("\nLinha: ");
            linha = entrada.nextInt();
            System.out.print("Coluna: ");
            coluna = entrada.nextInt();

            if ((_Campo[linha][coluna] != '_') && ((linha < _ObjJogo.getLinha() - 1 && linha > 0) && (coluna < _ObjJogo.getColuna() - 1 && coluna > 0))) {
                System.out.println("Esse campo já está sendo exibido");
            }
            if (_ObjJogo.getValor_Linha() == 11) {
                if (linha < 1 || linha > _ObjJogo.getLinha() - 2 || coluna < 1 || coluna > _ObjJogo.getColuna() - 2) {
                    System.out.println("Escolha números de 1 até 11");
                }
            } else if (_ObjJogo.getValor_Linha() == 18) {
                if (linha < 1 || linha > _ObjJogo.getLinha() - 2 || coluna < 1 || coluna > _ObjJogo.getColuna() - 2) {
                    System.out.println("Escolha números de 1 até 16");
                }
            } else if (_ObjJogo.getValor_Linha() == 24) {
                if (linha < 1 || linha > _ObjJogo.getLinha() - 2 || coluna < 1 || coluna > _ObjJogo.getColuna() - 2) {
                    System.out.println("Escolha números de 1 até 22");
                }
            }

        } while ((linha < 1 && linha > _ObjJogo.getLinha() - 2) && (coluna < 1 && coluna > _ObjJogo.getColuna() - 2) || (_Campo[linha][coluna] != '_'));

        _ObjJogo.setCampo(_Campo);

        if (_ObjJogo.getMinas()[linha][coluna] == -1) {
            return true;
        } else {
            return false;
        }

    }

    public void Preenche_Dicas(ObjetoJogo _ObjJogo) {

        _Minas = _ObjJogo.getMinas();

        for (int line = 1; line < _ObjJogo.getLinha() - 1; line++) {
            for (int column = 1; column < _ObjJogo.getColuna() - 1; column++) {

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (_Minas[line][column] != -1) {
                            if (_Minas[line + i][column + j] == -1) {
                                _Minas[line][column]++;
                            }
                        }
                    }
                }

                _ObjJogo.setMinas(_Minas);
            }
        }

    }

    public void Exibe_Minas(ObjetoJogo _ObjJogo) {
        /*
         * Este Metodo utiliza objeto da Interface Iterator
         * que é instanciado em momento de execução
         * 
         */
        MinasIterator iterator;

        _Minas = _ObjJogo.getMinas();
        _Campo = _ObjJogo.getCampo();
        iterator = new MinasIterator(_Minas, _ObjJogo);

        while (iterator.temProximo()) {
            if ((int) iterator.proximo() == -1) {
                _Campo[iterator.getLinha()][iterator.getColuna()] = '*';
            }
        }

        _ObjJogo.setMinas(_Minas);
        _ObjJogo.setCampo(_Campo);
/*
 * Chama o Construtor da Classe Observer
 * e executa o metodo Update
 */
        Observer _ObjObserver = new Observer() {};
        _ObjObserver.Update(_ObjJogo);
       
    }

    /**
     *
     * @param _ObjJogo
     */
    public void Seta_Campo(ObjetoJogo _ObjJogo) {

        _Minas = _ObjJogo.getMinas();


        for (int i = 1; i < _Minas.length; i++) {
            for (int j = 1; j < _Minas.length; j++) {
                _Campo[i][j] = '_';
            }
        }

        _ObjJogo.setCampo(_Campo);
        _ObjJogo.setMinas(_Minas);

    }

    public void Seta_Minas(ObjetoJogo _ObjJogo) {


        for (int i = 0; i < _Minas.length; i++) {
            for (int j = 0; j < _Minas.length; j++) {
                _Minas[i][j] = 0;
            }
        }

        _ObjJogo.setMinas(_Minas);
    }
}