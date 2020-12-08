import java.util.Scanner;

public class Kykru extends Haramkhor {
    public static void main(String[] args) {

        System.out.println("please enter the level of haramkhorta");

        Scanner s = new Scanner(System.in);
        int level = s.nextInt();
        Kykru kk = new Kykru();
        kk.setLevelofhk(level);
        System.out.println("you are this " + kk.getLevelofhk() +" % haramkhor");
        }
}


class Haramkhor{
    int levelofhk;

    void setLevelofhk(int levelofhk){
        this.levelofhk=levelofhk;
    }

    int getLevelofhk(){
        return this.levelofhk;
    }
}
