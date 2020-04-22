import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Controller {
    public static int citIntreg(String sir){
        try{
            System.out.print(sir);
            Scanner S= new Scanner(System.in);
            int I=S.nextInt();
            return I;
        }
        catch(Exception E){
            System.out.println("Ai gresit, mai incearca");
            return citIntreg(sir);
        }
    }
    public static int citireDinFisier(Anvelopa A[]){
        int n=0;
        try {
            BufferedReader fisIn =
                    new BufferedReader(new FileReader("C:\\Users\\EliteBook\\IdeaProjects\\MagazinAnvelope\\src\\Magazin"));
            String s;
            while((s = fisIn.readLine())!= null){
                String felii[]=s.split(",");
                String nume=felii[0];
                String tip=felii[1];
                int stocI=Integer.parseInt(felii[2]);
                int vandute=Integer.parseInt(felii[3]);
                int pretU=Integer.parseInt(felii[4]);
                A[n]=new Anvelopa(nume,tip,stocI,pretU,vandute);
                n++;
            }
            fisIn.close();
        } // try
        catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } // catch									//citiri valorile vectorului
        return n;

    }
    public static int Meniu(){
        System.out.println();
        System.out.println("1.Citire date din fisier");
        System.out.println("2.Afisare toata marfa");
        System.out.println("3.Afisare disponibile");
        System.out.println("4.Afisare epuizate");
        System.out.println("5.Afisare dupa procent vanzare din total");
        System.out.println("6.Afisare vanzari bune(>=50% din stocInitial");
        System.out.println("0.Terminare program");
        int Opt=citIntreg("da optiunea ta:");
        return Opt;
    }



    public static void main(String[] args) {
        int opt=Meniu();
        Anvelopa A[] = new Anvelopa[100];
        int lung=0;	   //numarul de elemente al vectorului A

        while(opt!=0){
            switch(opt){
                case 1:lung=citireDinFisier(A);
                    System.out.println("am citit corect datele din fisier");
                    break;
                case 2:View.afisTot(lung,A); 		//Afiseaza tot tabelul
                    break;
                case 3:View.afisDisponibile(lung,A);	//Afiseaza marfa existenta
                    break;
                case 4:View.afisEpuizate(lung,A);	//Afisare marfa epuizata
                    break;
                case 5:View.afisProcTotal(lung,A);
                    break;
                case 6:View.afisBineVandute(lung,A);
                    break;
                default:
                    System.out.println("ai gresit optiunea, mai incearca!!!");
            }
            opt=Meniu();
        }
        System.out.println("Program terminat");
    }


}
