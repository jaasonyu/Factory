public class RunMyProgram {
    public static void main(String[] args) {
        avatar joker = new avatar();
        joker.print();
        avatar batman = new avatar();
        batman.print();
        batman.power = "Fly";
        batman.role = "hero";
        batman.weakness = "his parents";
        batman.print();
        avatar greenlantern = new avatar();
        greenlantern.power = "Conjure things";
        greenlantern.role = "hero";
        greenlantern.weakness = "human";
        greenlantern.height = 177;
        greenlantern.width = 32;
        greenlantern.print();
        avatar starfire = new avatar(330,200,15,28,178,300,"Starbolt blast","hero","too many powers");
        //this parameter allows you to simplify what we did for green lantern
        starfire.print();
        avatar namor = new avatar (440,220,60,180,175,30,"super strength","villain","the sun");
        namor.print();

    }

}

