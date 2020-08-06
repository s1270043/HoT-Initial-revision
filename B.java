import java.io.*;

public class B
{
  public static void main(String args[]) throws IOException
  {
    System.out.println("Who are you?");
    System.out.print("> ");

    BufferedReader br=
    new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();

    System.out.println("Hello, "+str+"!");

    System.out.println("Tossing a coin…");
    int count_a=0;
    int count_b=0;

    for(int i=1;i<4;i++)
    {
      int num=(int)(Math.random()*6)+1;


      if(num%2==0)
      {
        System.out.println("Round "+i+": Heads");
        count_a++;
      }
      else
      {
        System.out.println("Round "+i+": Tails");
        count_b++;
      }
    }

    System.out.println("Heads: "+count_a+", Tails: "+count_b+"");
  }
}
