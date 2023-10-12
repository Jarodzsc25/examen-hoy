public class suma {
    int sument1,sument2,sument3;
    double sumdou1,sumdou2,sumdou3,total,total1;

    public suma() {

    }

    public int getSument3() {
        return sument3;
    }

    public void setSument3(int sument3) {
        this.sument3 = sument3;
    }

    public double getTotal1() {
        return total1;
    }

    public void setTotal1(double total1) {
        this.total1 = total1;
    }

    public double getTotal() {

        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getSument1() {
        return sument1;
    }

    public void setSument1(int sument1) {
        this.sument1 = sument1;
    }

    public int getSument2() {
        return sument2;
    }

    public void setSument2(int sument2) {
        this.sument2 = sument2;
    }

    public double getSumdou1() {
        return sumdou1;
    }

    public void setSumdou1(double sumdou1) {
        this.sumdou1 = sumdou1;
    }

    public double getSumdou2() {
        return sumdou2;
    }

    public void setSumdou2(double sumdou2) {
        this.sumdou2 = sumdou2;
    }

    public double getSumdou3() {
        return sumdou3;
    }

    public void setSumdou3(double sumdou3) {
        this.sumdou3 = sumdou3;
    }

    public suma(int sument1, int sument2, double sumdou1, double sumdou2, double sumdou3,double total,double total1) {
        this.sument1 = sument1;
        this.sument2 = sument2;
        this.sument3=sument3;
        this.sumdou1 = sumdou1;
        this.sumdou2 = sumdou2;
        this.sumdou3 = sumdou3;
        this.total= total;
        this.total1= total1;
    }

    public void calcularSuma(int sument1,int sument2){
        total=sument1+sument2;
        System.out.println("La suma de los 2 valores enteros es: "+ total);
    }
    public void calcularSuma(int sument1,int sument2,int sument3){
        total1=sument1+sument2+sument3;
        System.out.println("la suma de los 3 valores enteros es: "+total1);
    }
    public void calcularSuma(double sumdou1,double sumdou2){
        total=sumdou1+sumdou2;


        System.out.println("La suma de los 2 valores doubles es: "+total);
    }
    public void calcularSuma(double sumdou1,double sumdou2,double sumdou3){
        total1=sumdou1+sumdou2+sumdou3;
        System.out.println("la suma de 3 valores double es: "+total1);
    }
}
