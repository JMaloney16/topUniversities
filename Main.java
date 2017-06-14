import java.util.*;
public class Main
{
    public static void main(String args[]){
        ArrayList<University> table = new ArrayList<University>();
        
        University uniLondon = new University();
        uniLondon.setRanking(12);
        uniLondon.setName("University of London");
        uniLondon.setCountry("UK");
        uniLondon.setRequirements("AAA");
        
        table.add(uniLondon);
        System.out.println(table);
    }
}
