package campominado;
/**
* Essa Classe fora criada para facilitar o trafego dos dados pelas Classes.
* Usa-se também o conceito de  abstract que pode somente ter uma única instância
*/

public abstract class ObjetoJogo {
    

    private int Nivel_Jogo;
    private int Tipo_Leitura;
    private int Linha;
    private int Coluna;
    private int Qt_Mina;
    private int[][] Minas;
    private char[][] Campo;
    private int Valor_Linha;
     
    
   public char[][] getCampo() {
        return Campo;
    }

    public void setCampo(char[][] Campo) {
        this.Campo = Campo;
    }

    public int[][] getMinas() {
        return Minas;
    }

    public void setMinas(int[][] Minas) {
        this.Minas = Minas;
    }

    public int getQt_Mina() {
        return Qt_Mina;
    }

    public void setQt_Mina(int Qt_Mina) {
        this.Qt_Mina = Qt_Mina;
    }

    public int getColuna() {
        return Coluna;
    }

    public void setColuna(int Coluna) {
        this.Coluna = Coluna;
    }

    public int getLinha() {
        return Linha;
    }

    public void setLinha(int Linha) {
        this.Linha = Linha;
    }

    public int getNivelJogo() {
        return Nivel_Jogo;
    }

    public void setNivelJogo(int Nivel_Jogo) {
        this.Nivel_Jogo = Nivel_Jogo;
    }

    public int getTipoLeitura() {
        return Tipo_Leitura;
    }

    public void setTipoLeitura(int Tipo_Leitura) {
        this.Tipo_Leitura = Tipo_Leitura;
    }
     public int getValor_Linha() {
        return Valor_Linha;
    }

    public int setValor_Linha(int Valor_Linha) {
        this.Valor_Linha = Valor_Linha;
        return Valor_Linha;
    }
}
