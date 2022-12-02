public class avatar {
    int posX;
    int posY;
    int dX;
    int dY;
    int height;
    int width;
    String power;
    String role;
    String weakness;
    //constructors are methods
    public avatar(){
        posX = 400;
        posY = 600;
        dX = 20;
        dY = 70;
        height = 175;
        width = 220;
        power = "run";
        role = "villain";
        weakness = "pride";
    }
    public void print(){
        System.out.println("the " + role + " can " + power + " and their weakness is " + weakness );
        System.out.println("They are " + height + " cm tall and " + width + " wide.");
        System.out.println("They are at location (" + posX + "," + posY + ")");
    }
    public avatar(int pposX, int pposY, int pdX, int pdY, int pheight,int pwidth, String ppower, String prole, String pweakness)
    {
        posX = pposX;
        posY = pposY;
        dX = pdX;
        dY = pdY;
        height = pheight;
        width = pwidth;
        power = ppower;
        role = prole;
        weakness = pweakness;
        
    }

}
