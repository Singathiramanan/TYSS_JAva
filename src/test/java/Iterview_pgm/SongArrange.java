package Iterview_pgm;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SongArrange extends RecentList{

	@SuppressWarnings("resource")
	@Test
	public void SongList() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		String[] songs=new String[sc.nextInt()];
		for(int i=0;i<songs.length;i++) {
			songs[i]=sc.next();
		}
		String[] recent=new String[3];
		System.out.println("Initial songs played");
		for(int i=0;i<recent.length;i++) {
			recent[i]=songs[i];
			System.out.print(recent[i]+" ");
		}
		System.out.println("Enter no of times changing the songs");
		int no = sc.nextInt();
		for(int i=0;i<no;i++) {
			System.out.println("Enter the song to play");
			String play=sc.next();
			String[] result = Rearrange(songs,recent,play);
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[j] + " ");
			}
			System.out.println();
		}
	}
}
