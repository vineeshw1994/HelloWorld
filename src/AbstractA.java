abstract class AbstractA {
    public String  name = "vineesh";
    public int age = 18;
    public  abstract void show();
}

class Student extends AbstractA {
    public  int  gratyear = 2020 ;
    public void show(){
        System.out.println("Good Student");
    }
}
