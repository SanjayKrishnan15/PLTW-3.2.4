import java.util.ArrayList;

/*
 * Activity 3.2.4
 */

public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> barnSpaces = new ArrayList<Horse>();
    barnSpaces.add(new Horse("Trigger", 1340));
    barnSpaces.add(new Horse("Silver", 1210));
    barnSpaces.add(new Horse("Lady", 1575));
    barnSpaces.add(new Horse("Patches", 1350));
    barnSpaces.add(new Horse("Duke", 1410));
    barnSpaces.add(new Horse("Major", 1495));
    barnSpaces.add(new Horse("Misty", 1425));
    barnSpaces.add(new Horse("Buddy", 1340));
    barnSpaces.add(new Horse("Autumn", 1460));
    barnSpaces.add(new Horse("Spirit", 1295));
/* 
    int numSpaces = barnSpaces.size();
    for (int i = 0; i < barnSpaces.size(); i++)
    {
      Horse h = barnSpaces.get(i);
      if (h.getName().equals("Lady"))
      {
          System.out.println("Bye bye " + barnSpaces.remove(i));
          i--;}
      if (h.getName().equals("Patches"))
      {
        System.out.println("Bye bye " +  barnSpaces.remove(i).getName());
        i--; 
      }
      
    }
        for (int h=0; h<barnSpaces.size(); h++) {

      System.out.println(barnSpaces.get(h).getName() + " " + barnSpaces.get(h).getWeight());
    } */
    

    int i = 0;
    while (i < barnSpaces.size()) {
      Horse h = barnSpaces.get(i);
      if (h.getName().equals("Lady")) {
        System.out.println("Bye bye " + barnSpaces.remove(i).getName());

        continue;
      }
      if (h.getName().equals("Patches")) {
        System.out.println("Bye bye " + barnSpaces.remove(i).getName());
        continue;
      }
      i++;
    }
    for (int j = 0; j < barnSpaces.size(); j++) {
      System.out.println(barnSpaces.get(j).getName() + " " + barnSpaces.get(j).getWeight());
    }
  }
}