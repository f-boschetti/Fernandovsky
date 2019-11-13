class muitosInteiros {
    private double m;
    int vetorNumeros[];

    public muitosInteiros(int t) {
        this.vetorNumeros = new int[t];
    }

    public void guardaNumero(int n, int p) {
        this.vetorNumeros[p] = n;
    }

    public int retornaNumero(int p) {
        return vetorNumeros[p];
    }

    public double Media() {
        for (int i = 0; i < this.vetorNumeros.length; i++) {
            m += vetorNumeros[i];
        }
        return (m / this.vetorNumeros.length);
    }
}