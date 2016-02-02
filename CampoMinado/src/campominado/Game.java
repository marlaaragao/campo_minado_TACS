/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

/** Determina o Inicio e Encerramento das partidas */
public final class Game extends ObjetoJogo {

    private Minas mina;
    ObjetoJogo _ObjJogo = new ObjetoJogo() {};
    private Tabuleiro tabuleiro;
    boolean terminar = false;
    boolean ganhou = false;
    int[] jogada;
    int rodada = 0;
    protected int nivel;

    public Game() {
        tabuleiro = new Tabuleiro(_ObjJogo);
        mina = new Minas(_ObjJogo);

        Jogar(mina, _ObjJogo);
        jogada = new int[2];
    }

    public void Jogar(Minas m, ObjetoJogo _ObjJogo) {


        do {
            rodada++;
            System.out.println("\nRodada " + rodada);

            Observer _ObjObserver = new Observer() {
            };
            _ObjObserver.Update(_ObjJogo);
            terminar = m.Set_Posicao(_ObjJogo);

            if (!terminar) {

                m.Minas_Ao_Redor(_ObjJogo);
                terminar = m.Ganhou(_ObjJogo);
            }



        } while (!terminar);

        if (!m.Ganhou(_ObjJogo)) {
            m.Exibe_Minas(_ObjJogo);
            System.out.println("\n Havia uma mina!\n");
            System.out.println("*******************************");
            System.out.println("        Você perdeu!     ");
            System.out.println("*******************************\n\n");


        } else {
            System.out.println("\n\nParabéns, você deixou os 8 campos de minas livres em " + rodada + " rodadas\n\n");
            m.Exibe_Minas(_ObjJogo);
        }
    }
}
