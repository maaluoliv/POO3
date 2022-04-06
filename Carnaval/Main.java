package Carnaval;
    import java.util.Scanner;
public class Main {
    public static void Main(String[] args) {
        int menu = 0;
        double valor = 100;

        Scanner Scan = new Scanner(System.in);

        while (menu != 4) {
            System.out.println("Ingressos Carnaval");
            System.out.println("1 - Ingresso Normal");
            System.out.println("2 - Ingresso Vip");
            System.out.println("3 - Camarote");
            System.out.println("4 - Sair");
            System.out.println("              ");
            System.out.println("Escolha uma opção de [1-4]");
            System.out.println("              ");
            menu = Scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("               ");
                    Normal normal = new Normal(valor);
                    normal.ingressoNormal();
                    System.out.println("                ");
                    break;
                case 2:
                    System.out.println("               ");
                    Vip vip = new Vi
                    normal.ingressoNormal();
                    System.out.println("                ");
                    break;
                case 3:
                    System.out.println("               ");
                    Normal normal = new Normal(valor);
                    normal.ingressoNormal();
                    System.out.println("                ");






            }


        }
    }
}
