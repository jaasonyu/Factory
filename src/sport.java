public class sport {
    int players;
    int record;
    String name;

    public void print(){
        System.out.println("the sport " + name + " has " + players + " with a record of " + record);
        rating();
    }
    public sport ( int pPlayers, int pRecord, String pName){
        name = pName;
        players = pPlayers;
        record = pRecord;
    }
    public void rating (){
        if(record>10){
            System.out.println("This is a good season");
        }
        else{
            System.out.println("This is a bad season");
        }
    }
}
