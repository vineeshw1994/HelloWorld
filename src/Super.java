public class Super {
    public void show(){
        System.out.println("Hello Guys");
    }

}

class Childerns extends Super{
    public void show(){
        super.show();
        System.out.println("Hello Childerns");
    }
}

class Mainer {
    public static void main(String[] args) {
        Childerns c = new Childerns();
        c.show();
    }
}