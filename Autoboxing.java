import java.util.ArrayList; 
public class Autoboxing 
{ 
    public static void main(String[] args) 
    { 
        int ch = 'w'; 
  
        // Autoboxing- primitive to Character object conversion 
        Integer ab = ch; 
  
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
  
        // Autoboxing because ArrayList stores only objects 
        arrayList.add(25); 
  
        // printing the values from object 
        System.out.println(arrayList.get(0)); 
    } 
} 