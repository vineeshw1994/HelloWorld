public class Constructor {
    int age;
    String name;
    public Constructor(int a,  String n){
        age = a ;
        name = n;

    }

    public  static void main(String[] args){
        Constructor c = new Constructor(1000, "vineesh");
        System.out.println(c.age + " " + c.name);
    }
}
