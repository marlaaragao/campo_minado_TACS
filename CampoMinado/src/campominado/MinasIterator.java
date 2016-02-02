package campominado;

/**
 *
 * @author Thaisa
 */

/**
 *Classe criada para encapsular uma iteração para a Busca de Minas,
 *É o iterador, que contém a Matriz do Campo, buscada a partir da classe ObjetoJogo.
 */

public class MinasIterator implements Iterator {

    private final int[][] minas;
    private int linha, coluna;
    private int linhaMaximo, colunaMaximo;
    
    public MinasIterator(int[][] minas, ObjetoJogo _ObjJogo) {
        this.minas = minas;
        this.linhaMaximo = _ObjJogo.getLinha() - 1;
        this.colunaMaximo = _ObjJogo.getColuna() - 1;
    }
    
    @Override
    public boolean temProximo() {
        
        return !(linha == linhaMaximo && coluna == colunaMaximo);
    }

    @Override
    public Object proximo() {
        int proximaMina = minas[linha][coluna];
        
        linha++;
        if (linha > linhaMaximo) {
            linha = 0;
            coluna++;
        }
        
        return proximaMina;
    }
    
    public int getLinha() {
        return linha;
    }
    
    public int getColuna() {
        return coluna;
    }
    
}