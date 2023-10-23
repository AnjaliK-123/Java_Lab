package neu.edu.mgen;

import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //part 1 code
        System.out.println( "Hello World!" );
        int x [] = {1,7,3,9,5};
        int y [] = {6,2,8,4,10};
        int z [] = new int[5];
        System.out.print("Array x = { ");
        for(int i=0; i<5; i++)
        System.out.print(x[i]+", ");
        System.out.println("}");
        System.out.print("Array y = { ");
        for(int i=0; i<5; i++)
        System.out.print(y[i]+", ");
        System.out.println("}");
         System.out.print("Array z = x + y = { ");
        for(int i=0; i<5; i++)
        {
        z[i] = Math.max(x[i],y[i]);
        System.out.print(z[i] +", ");
       
        }
         System.out.println("}");

         //part 2 code
         ArrayList<String> names = new ArrayList<>();
        names.add("Anjali");
        names.add("Yashvi");
        names.add("Diya");
        names.add("Pranika");
        names.add("Rutuja");
        System.out.println("Names = " + names);

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.length() >= 2) {
                char firstLetter = name.charAt(0);
                char lastLetter = name.charAt(name.length() - 1);
                firstLetter = Character.toLowerCase(firstLetter);
                lastLetter = Character.toUpperCase(lastLetter);
                String switchedName = lastLetter + name.substring(1, name.length() - 1) + firstLetter;
                names.set(i, switchedName);
             
                 
        }
    }
System.out.print("Names = [");
for(String name : names){
 System.out.print(name+", ");
}
System.out.print("]");

    }
}

