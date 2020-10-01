
//Implementing hash map
import java.util.*;

class Main {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<String>();
        s.add("MyCollege");
        s.add("Neywork");
        s.add("MyCollege");
        s.add("MyCollegeians");
        System.out.println(s);
        System.out.println(s.remove("Neywork"));
        System.out.println(s.size());
        System.out.println(s.contains("MyCollege"));
        HashMap<String, String> school = new HashMap<String, String>();
        school.put("Building1", "SCOPE");
        school.put("Building1", "SITE");
        school.put("Buliding2", "SENSE");
        school.put("Building3", "SBST");
        Collection<String> val = school.values();
        System.out.println("Values:" + val);
        for (String i : val)
            System.out.println("Values:" + i);
        Collection<String> keys = school.keySet();
        System.out.println("Keys:" + keys);
        for (String j : keys) {
            System.out.println("Keys:" + j);
            System.out.println("Values of Key:" + j + " " + school.get(j));
        }
        System.out.println(school.remove("Building1"));
        System.out.println("Values:" + val);
    }
}