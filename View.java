public class View {
    public static void afisTot(int n, Anvelopa A[]){
        FormatariT.capTabel22();
        for(int i=0;i<n;i++){
            FormatariT.Formatari22(n,i,A);
        }
        FormatariT.Linii(61,'-');
    }
    public static void afisEpuizate(int n, Anvelopa A[]){
        FormatariT.capTabel22();
        for(int i=0;i<n;i++)
            if(A[i].getStocI()==A[i].getVandut()){
                FormatariT.Formatari22(n,i,A);
            }
        FormatariT.Linii(61,'-');
    }
    public static void afisDisponibile(int n, Anvelopa A[]){
        FormatariT.capTabel33();
        for(int i=0;i<n;i++)
            if(A[i].getStocI()>A[i].getVandut()){
                FormatariT.Formatari33(n,i,A);
            }
        FormatariT.Linii(58,'-');
    }
    public static void afisProcTotal(int n, Anvelopa A[]){
        FormatariT.capTabel55();
        long Suma=0;
        for(int i=0;i<n;i++)
            Suma+=A[i].getVandut()*A[i].getPretUnit();
        for(int i=0;i<n;i++){
            FormatariT.Formatari55(n,i,A,Suma);
        }
        FormatariT.Linii(67,'=');
        System.out.println("\t\t\tValoare totala marfa vanduta:"+Suma);
    }
    public static void afisBineVandute(int n, Anvelopa A[]) {
        FormatariT.capTabel22();
        for(int i=0;i<n;i++){
            FormatariT.Formatari66(n,i,A);
        }
        FormatariT.Linii(61,'-');
    }
}

class FormatariT {
    public static void capTabel22(){
        String sir="Denumire\t|Tip\t\t |StocInit|Vandute |PretUnit|";
        Linii(61,'=');
        System.out.println(sir);
        Linii(61,'=');
    }
    public static void capTabel33(){
        String sir="Denumire\t|Tip\t\t |Disponibile| PretUnit  |";
        Linii(58,'=');
        System.out.println(sir);
        Linii(58,'=');
    }
    public static void capTabel55(){
        String sir="Denumire\t|Tip\t\t |StocInit|Vandute |PretUnit|  %  |";
        Linii(67,'=');
        System.out.println(sir);
        Linii(67,'=');
    }
    public static void Formatari22(int n,int i, Anvelopa A[] )
    {   String []s=new String[5];
        s[0]=A[i].getNume();
        s[1]=A[i].getTip();
        s[2]=Integer.toString(A[i].getStocI());
        s[3]=Integer.toString(A[i].getVandut());
        s[4]=Integer.toString(A[i].getPretUnit());
        System.out.printf("|%-16s|%-16s|%-10s|%-13s|%6s|\n",s);	//afisare formatata

    }

    public static void Formatari33(int n,int i, Anvelopa A[] )
    {
        String []s=new String[4];
        s[0]=A[i].getNume();
        s[1]=A[i].getTip();
       //String []sInt=new String[2];
        int disponibil=A[i].getStocI()-A[i].getVandut();
        s[2]=Integer.toString(disponibil);
        s[3]=Integer.toString(A[i].getPretUnit());
        System.out.printf("%-16s|%-16s|%11s|%11s|\n",s);
    }
    public static void Formatari(int n,int i, Anvelopa A[], int procent )
    {
        double proc=1.0*A[i].getVandut()/A[i].getStocI()*100;
        if(proc<=procent){
            String []s=new String[6];
            s[0]=A[i].getNume();
            s[1]=A[i].getTip();
            s[2]=Integer.toString(A[i].getStocI());
            s[3]=Integer.toString(A[i].getVandut());
            s[4]=Integer.toString(A[i].getPretUnit());
            long p=(long)(proc*100);
            proc=p/100.0;
            s[5]=Double.toString(proc);
            System.out.printf("%-16s|%-16s|%8s|%8s|%8s|%5s|\n",s);
        }

    }
    public static void Formatari55(int n,int i, Anvelopa A[], long Suma )
    {
        double proc=1.0*A[i].getVandut()*A[i].getPretUnit()/Suma*100;
        String []s=new String[6];
        s[0]=A[i].getNume();
        s[1]=A[i].getTip();
        s[2]=Integer.toString(A[i].getStocI());
        s[3]=Integer.toString(A[i].getVandut());
        s[4]=Integer.toString(A[i].getPretUnit());
        long p=(long)(proc*100);
        proc=p/100.0;
        s[5]=Double.toString(proc);
        System.out.printf("%-16s|%-16s|%8s|%8s|%8s|%5s|\n",s);
    }
    public static void Formatari66(int n,int i, Anvelopa A[] )
    {  if(2*A[i].getVandut()>A[i].getStocI()) {
        String []s=new String[5];
        s[0]=A[i].getNume();
        s[1]=A[i].getTip();
        s[2]=Integer.toString(A[i].getStocI());
        s[3]=Integer.toString(A[i].getVandut());
        s[4]=Integer.toString(A[i].getPretUnit());
        System.out.printf("%-16s|%-16s|%8s|%8s|%8s|\n",s);
    }

    }
    public static void Linii (int nrLinii,char c){
        for(int i=0;i<nrLinii;i++){
            System.out.print(c);
        }
        System.out.println();
    }

}
