package Sony;

public class MatchRotate {

	public static void main(String[] args) {
		String s = "welcome to tyss";
		
		String[] str = s.split(" ");
		int key = str.length;
		while (key > 0) {
			String rev = "";
			String temp = str[0];
			for (int i = 0; i < str.length - 1; i++) {
				str[i] = str[i + 1];
			}
			str[str.length - 1] = temp;
			for (int i = 0; i < str.length; i++) {
				rev = rev + str[i] + " ";
			}
			key--;
			System.out.println(rev.trim());
			if (rev.trim().equals(s)) {
				System.out.println("equal");
				break;
			}
		}

	}

}
