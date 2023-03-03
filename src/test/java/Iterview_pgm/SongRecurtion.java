package Iterview_pgm;

import java.util.Scanner;

public class SongRecurtion {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		String[] songs=new String[sc.nextInt()];
		for(int i=0;i<songs.length;i++) {
			songs[i]=sc.next();
		}
		String[] recent=new String[songs.length-1];
		for(int i=0;i<recent.length;i++) {
			recent[i]=songs[i];
			System.out.print(recent[i]+" ");
		}
		System.out.println();
		System.out.println("Enter no of times changing the songs");
		int no = sc.nextInt();
		for(int i=0;i<no;i++) {
			System.out.println("Enter the song to play");
			String play=sc.next();
			for(int j=1;j<recent.length-1;j++) {
				if(!(recent[j].equals(play))) {
					recent[j-1]=recent[j];
					recent[j]=recent[j+1];
				}else {
					String temp=recent[j];
					recent[j]=recent[j+1];
					recent[j+1]=temp;	
				}
			}
			recent[recent.length-1]=play;
			for(int j=0;j<recent.length;j++) {
				System.out.print(recent[j]+" ");
			}
			System.out.println();
		}
	}
}
