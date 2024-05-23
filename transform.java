
public class transform {
	
	
	public String card(String a) {
        String numbercard = a;
        int nc = numbercard.length();
        int ncFinal = nc - 4;
        StringBuilder r = new StringBuilder();
        
        for (int i = 0; i < nc; i++) {
            char c = numbercard.charAt(i);
                        
            if (i < ncFinal) {
                r.append('#');
            } else {
                r.append(c);
            }
        }
        
        return r.toString();
    }
}	
	
