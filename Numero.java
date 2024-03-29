public class Numero {
    public int[] valor = new int[100];
    public int menor;

    public double calculaMedia() {
      double media = 0;
      for(int count = 0; valor.length; count++) {
        media += this.valor[count];
      }
    }

    public int maiorNumero() {
      int maior = 0;
      for(int count = 0; count < valor.length; count++) {
        if(valor[count] > maior) {
          maior = valor[count];
        }
      }
      return maior;
    }

    public int numerosPrimos() {
      int primos = 0;
      for(int count = valor.length; count < 0; count--) {
        if(valor[count] % count == 0) {
          continue;
        }
        else {
          primos++;
        }
      }
      return primos;
    }
}
