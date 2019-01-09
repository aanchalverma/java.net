import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP
{
	public static void main(String args[])
    {
    	InetAddress ipadd = null;
      	try
        {
        	//add = InetAddress.getByName("https://chilliteen.wordpress.com/2018/04/14/rapism");
          	ipadd = InetAddress.getLocalHost();

          	
        }
      	catch (UnknownHostException e)
        {
         System.exit(2);
      	}
		System.out.println(ipadd.getHostName() + "=" + ipadd.getHostAddress());
      System.exit(0);

    
    }
}
