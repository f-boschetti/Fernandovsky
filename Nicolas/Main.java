import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner sf = new Scanner(System.in);
        System.out.println("Quantos numeros você deseja guardar?");
        int t = sf.nextInt();
        muitosInteiros v = new muitosInteiros(t);
        for(int j = 0; j <= t;j++){
            System.out.println("Qual numero você deseja guardar?");
            int n = sf.nextInt();
            System.out.println("Em qual indice você deseja guardar?");
            int p = sf.nextInt();
            v.guardaNumero(n, p);
        }
        System.out.println(v.Media());
        sf.close();

    }
}