public class sport {
    int players;
    int record;
    static String name;

    public void print(){
        System.out.println("the sport " + name + " has " + players + " team members and has a winning record of " + record);
        rating();
    }
    public sport ( int pPlayers, int pRecord, String pName){
        players = pPlayers;
        record = pRecord;
        name = pName;
    }
    public void rating (){
        if(record>10){
            System.out.println("Compared to the past, this is a good season");
        }
        else{
            System.out.println("Compared to the past, this is a bad season");
        }
    }
}
