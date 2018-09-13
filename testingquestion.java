import java.io.*;
 class testingquestion

{

	public static void main(String[] x)

	{

		File f = new File("hello.txt");

		

		try{

			FileInputStream fin = new FileInputStream(f);

			

			int i = fin.read();

			

			while(i!=-1)

			{

				System.out.println(i + " : " + (char)i);

				i = fin.read();

			}

				fin.close();

		}

	

		catch(IOException e)

		{

			System.out.println(e);

		}

		

		System.out.print("File path: " + f.getPath());

	}

}