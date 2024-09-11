package collectionFramerwroks;

public class Missingnumber {

	public static void main(String[] args) {

		int[] numbers= {1,3,4,5,6,7,9,11};
		
		
		for(int i=0;i<numbers.length-1;i++)
		{
			int check=numbers[i];
			
			if(numbers[i+1] !=check+1)
			{
				System.out.println(check+1);
			}
		}
	}

}
