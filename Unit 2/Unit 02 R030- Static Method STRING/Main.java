//your code here



public class Main
  {
    public void goTeam()
    {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }

    public void bestWest()
    {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }

    public void blankLine()
    {
       System.out.println();
    }

    public void group1()
    {
        goTeam();
        blankLine();
    }

    public void group2()
    {
        goTeam();
        bestWest();
        goTeam();
        blankLine();
    }

    public static void main(String[] args)
    {
       Main s = new Main();
       
       s.group1();
       s.group2();
       s.group2();
       s.group1();

    }
}

