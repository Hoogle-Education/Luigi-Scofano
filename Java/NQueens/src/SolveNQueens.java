public class SolveNQueens {

    public int[][] tabuleiro;
    public int n;
    public int queens;

    public SolveNQueens(int n, int queens) {
        this.n = n;
        this.queens = queens;
        tabuleiro = new int[n][n];
        // tem rainha = 1
        // vazio = 0
    }

    public boolean ehPosicaoValida(int linha, int coluna) {

        // valida linha
        for (int i = 0; i < n; i++) {
            if(tabuleiro[linha][i] == 1) {
                return false;
            }
        }

        // valida coluna
        for (int i = 0; i < n; i++) {
            if (tabuleiro[i][coluna] == 1) {
                return false;
            }
        }

        // valida diagonal esquerda superior
        for(int i = linha, j = coluna; i >= 0 && j >= 0; i--, j--) {
            if (tabuleiro[i][j] == 1) {
                return false;
            }
        }

        // valida diagonal esquerda inferior
        for(int i = linha, j = coluna; i < n && j >= 0; i++, j--) {
            if (tabuleiro[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public void solve() {
        solve(0);
    }

    private void solve(int coluna) {
        if(coluna == queens) {
            exibirTabuleiro();
            return;
        }

        for(int linha = 0; linha < n; linha++) {
            if(ehPosicaoValida(linha, coluna)) {
                tabuleiro[linha][coluna] = 1;
                solve(coluna + 1);
                tabuleiro[linha][coluna] = 0;
            }
        }
    }

    public void exibirTabuleiro() {
        for (int i = 0; i < n; i++) {
            boolean first = true;

            for (int j = 0; j < n; j++) {
                if (first) {
                    System.out.print("| " + tabuleiro[i][j]);
                    first = false;
                } else {
                    System.out.print(" | " + tabuleiro[i][j]);
                }
            }

            System.out.println(" |");
        }
        System.out.println("--------------------------------");
    }
}

// [0,0] [0,1] [0,2] [0,3]
// [1,0] [1,1] [1,2] [1,3]
// [2,0] [2,1] [2,2] [2,3]
// [3,0] [3,1] [3,2] [3,3]