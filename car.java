public class car {

   

    private String model;
    private String name;
    private int year;


    public  car(String model, String name, int year) {
        this.model = model;
        this.name = name;
        this.year = year;
    }

    void start(){
        System.out.println("car:"+model);
    }
    void display(){
        System.out.println("car:"+model+" name:"+name+" year:"+year);
    }}
    class sample{
    public static void main(String[] args) {
        car mycar=new car("bmw","m3",2024);

        mycar.start();
        mycar.display();

        car mycar2=new car("audi","m3",2024);

        mycar2.start();
        mycar2.display();

    }
}
