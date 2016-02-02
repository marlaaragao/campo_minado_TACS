
package campominado;

/**
 *
 * @author Lizandra Ottmann
 */

/** Classe Abstrata que Observa o Objeto */

public abstract class Observer {
   
   public void Update(ObjetoJogo _ObjJogo) {

        System.out.println("\n     Linhas");
        for (int linha = _ObjJogo.getLinha() - 2; linha > 0; linha--) {

            System.out.print("      " + linha + "  ");

            for (int coluna = 1; coluna < _ObjJogo.getColuna() - 1; coluna++) {
                System.out.print("   " + _ObjJogo.getCampo()[linha][coluna]);
            }

            System.out.println();
        }
        if (_ObjJogo.getValor_Linha() == 11) {
            System.out.println("\n            1   2   3   4   5   6   7   8   9");
            System.out.println("      Colunas");
        } else if (_ObjJogo.getValor_Linha() == 18) {
            System.out.println("\n            1   2   3   4   5   6   7   8   9   10  11  12   13  14  15  16");
            System.out.println("      Colunas");
        } else if (_ObjJogo.getValor_Linha() == 24) {
            System.out.println("\n            1   2   3   4   5   6   7   8  9   10  11  12   13  14  15  16  17  18  19  20  21  22");
            System.out.println("      Colunas");
        }
    }
}
