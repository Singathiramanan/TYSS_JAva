package Iterview_pgm;

public class RecentList {
	public String[] Rearrange(String[] songs, String[] recent, String play) {
		boolean flag=true;
		for(int i=0;i<songs.length;i++) {
			if(play.equals(songs[i])) {
				flag=true;
				break;
			}
			else {
				flag=false;
			}
		}
		if(flag==true) {
		for (int j = 1; j < recent.length - 1; j++) {
			if (!(recent[j].equals(play))) {
				recent[j - 1] = recent[j];
				recent[j] = recent[j + 1];
			} else {
				String temp = recent[j];
				recent[j] = recent[j + 1];
				recent[j + 1] = temp;
			}
		}
		recent[recent.length - 1] = play;
		}else {
			System.out.println("song not present in the list");
		}
		return recent;

	}
}
