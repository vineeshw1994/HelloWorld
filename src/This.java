public class This {
    int year ;
    String carname ;

    public This(String name){
        this(2020, name);
    }

    public This(int year, String carname ){
        this.year = year;
        this.carname = carname ;
    }

    public void Printname(){
        System.out.println(carname + " " + year) ;
    }

    public static void main(String[] args){
        This a = new This("Benz");
        This b = new This(2025, "BMW");
        a.Printname();
        b.Printname();
    }
}
