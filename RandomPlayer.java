/**
		Tin Vo
 **/
import java.util.Random;
public class RandomPlayer
{
    private Random rand;
	
    RandomPlayer () 
    {
        rand = new Random();
    }
    
    public int play ()
    {
        int play = 1 + rand.nextInt(3);
        return play;
    }
 
}