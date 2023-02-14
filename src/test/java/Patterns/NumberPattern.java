package Patterns;

public class NumberPattern {

	public static void main(String[] args) {
		int input=3;
		for (int i = 1; i <= input; i++)
        {
            for (int j = input - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = input-1; i >= 1; i--)
        {
            for (int j = input - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
	}

}
