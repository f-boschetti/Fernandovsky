public class Numero {
    public int[] valor = new int[100];
    public int maior;
    public int menor;

    public double calculaMedia() {
      double media = 0;
      for(int count = 0; valor.length; count++) {
        media += this.valor[count];
      }
    }

    public int numerosPrimos() {
      int primos = 0;
      for(int count = valor.length; count < 0; count++) {
        if(valor[count] % count != 0) {
          primos++;
        }
      }
    }
}
