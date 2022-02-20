public class GCD {
	public static int ebob(int sayi1, int sayi2) {
		int sayia=0;
		if(sayi1>sayi2)
		{
			for (int i=1; i<sayi1 ;i++)
			{
				if(sayi1%i==0 && sayi2%i==0)
				{
					sayia=i;
				}
			}
		}
		if(sayi2>sayi1)
		{
			for (int i=1; i<sayi1 ;i++)
			{
				if(sayi1%i==0 && sayi2%i==0)
				{
					 sayia=i;
				}
			}
		}
		return sayia;
	}
}
