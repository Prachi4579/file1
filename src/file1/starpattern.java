package file1;

public class starpattern {
	public static void main(String[] args) {
//		pattern 1
//		for(int i=1;i<=5;i++)
//			
//		{for(int j=0;j<i;j++)
//			System.out.print("*");
//		System.out.println();
//		}
//	}
//		pattern 3
//		for(int i=1;i<=5;i++)
//			
//		{for(int j=5;j>=i;j--)
//		{
//			System.out.print("*");}
//		System.out.println();
//		}
//	}}
//		//pattern 2
//		for(int i=1;i<=5;i++)
//			{for(int k=5;k>i;k--)
//			{ System.out.print(" ");
//			}
//		
//		for(int j=0;j<i;j++)
//		{	System.out.print("*");
//		}
//		System.out.println();
//	}}}

		//pattern 4
//		for(int i=1;i<=5;i++)
//			{for(int j=0;j<=i;j++)
//			{ System.out.print(" ");
//			}
//			for(int k=5;k>=i;k--)
//		
//		{	System.out.print("*");
//		}
//		System.out.println();
//	}}}
//pattern 12
//		for(int i=1;i<=5;i++)
//		
//	{for(int j=5;j>=i;j--)
//	{
//		System.out.print("*");}
//	System.out.println();
//	}
//
//		
//		for(int i=2;i<=5;i++)
//			
//		{for(int j=1;j<=i;j++)
//			{System.out.print("*");
//			}
//		System.out.println();
//		}}}
//pattern 5
		
		for(int i=1;i<=5;i++)
			{for(int k=5;k>=i;k--)
			{ System.out.print(" ");
			}
		
		for(int j=1;j<=(i*2)-1;j++)
		{	System.out.print("*");
		}
		System.out.println();
	}

	}}
/* 1 - 1
   2 - 3
   3 - 5
   4 - 7
   5 - 9
   */