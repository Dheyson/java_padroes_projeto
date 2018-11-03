package TestArea;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DHEYSON
 */
public class TestTime {
     
    public static void main(String[] args){
        
      Set<Aluno> collection = new TreeSet<Aluno>();
      
      collection.add(new Aluno("Jane","172091891",22));
      collection.add(new Aluno("Brock","314210320",41));
      collection.add(new Aluno("Gwen","698547432",12));
      
      Iterator<Aluno> it = collection.iterator();
      
      while(it.hasNext()) {
          System.out.println(it.next());
      }
    
    }
    }
            

