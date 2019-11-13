public class Data{

    private int dia;
    private int mes;
    private int ano;

    public void setDia(int d) {
      if(d > 0) {
        this.dia = d;
      }
      else {
        return;
      }
    }

    public int getDia(){
        return this.dia;
    }

    public void setMes(int m){
      if(d > 0) {
        this.mes = m;
      }
      else {
        return;
      }
    }

    public int getMes(){
        return this.mes;
    }
    public void setAno(int a){
      if(d > 0) {
        this.ano = a;
      }
      else {
        return;
      }
    }
    public int getAno(){
        return this.ano;
    }
}
