public class Triangle {
    int a;
    int b;
    int c;
    public Triangle(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;


    }public void area(){
        int p = (a + b +c) / 2;
        double s = Math.sqrt( p * (p - a) * (p - b) * (p - c));
        System.out.println("Плошадь="+s);
    }
}
