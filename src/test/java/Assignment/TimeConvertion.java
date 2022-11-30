package Assignment;

public class TimeConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12:01:00AM";
		String[] str=s.split(":");
	    String ampm=str[2].substring(2, 4);
	    int ho=Integer.valueOf(str[0]);
	    int mi=Integer.valueOf(str[1]);
	    int se=Integer.valueOf(str[2].substring(0, 2));
	    if(ampm.equals("AM") && ho==12){
	        ho=0;
	    }
	    else if(ampm.equals("PM") && ho<12){
	        ho+=12;
	    }
	    String time=String.format("%02d:%02d:%02d",ho,mi,se);
	    System.out.println(time);
	    }

}
