//put your program here
public class Main{
    
    public void smallStar(){
        System.out.println("    ********");
    }
    public void bigStar(){
        System.out.println("****************");
    }
    public void bannerStart(){
        smallStar();
        bigStar();
    }

    public void bannerEnd(){
        bigStar();
        smallStar();
        System.out.println();
    }
    public void makeBanner(String phrase){
        bannerStart();
        System.out.println(phrase);
        bannerEnd();
    }


    public static void main(String[] args){
        Main maker = new Main();
        maker.makeBanner("  WE LOVE JAVA!");
        maker.makeBanner("   GO EAGLES!");
        maker.makeBanner(" SCHOOL IS COOL!");

    }
}