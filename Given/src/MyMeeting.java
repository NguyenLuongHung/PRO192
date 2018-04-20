import java.util.*;
//Your task is to complete this class 
public class MyMeeting implements IMeeting {    
    
    
    //write the definition of method f1 here 
    @Override
    public String f1(ArrayList<Meeting> a) {
      
        int dayMax = 0;
        int imax = 0;
//        String[] b = new String[a.size()];
//        for (int j = 0; j < a.size(); j++) {
//            b[j] = a.get(j).getDay();
//        }

        for (int i = 0; i < a.size(); i++) {
//            String dayCheck = a.get(i).getDay();
//            int freq = Collections.frequency(Arrays.asList(b), dayCheck);
              int freq = Collections.frequency(a, a.get(i));
            if (freq > dayMax){
                dayMax = freq;
                imax = i;
            }
        }
        return a.get(imax).getDay();
    }  
    
    //write the definition of method f2 here 
    @Override
    public int f2(ArrayList<Meeting> a, String day) { 
        String[] b = new String[a.size()];
        for (int j = 0; j < a.size(); j++) {
            b[j] = a.get(j).getDay();
        }
        return Collections.frequency(Arrays.asList(b), day);
    }    
    //add and complete you other methods (if needed) here   
     
}
