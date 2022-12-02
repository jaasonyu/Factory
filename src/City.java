public class City {
    int pop;
    String continent;
    String name;
    int avetemp;

    public City(){
        name = "Chicago";
        pop = 1000;
        continent = "Ohio";
        avetemp = 20;
        print();
    }
    public void print(){
        System.out.println("the city " + name + " in " + continent);
        System.out.println("with an average temp of " + avetemp + " and a pop of " + pop + " people");

    }
}
