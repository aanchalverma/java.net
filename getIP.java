import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.Socket;

public class GetIP
{
	public static void main(String args[])
    {
    	InetAddress ipadd = null;
      	InetAddress add = null;
      	try
        {
        	//add = InetAddress.getByName("https://chilliteen.wordpress.com/2018/04/14/rapism");
          	ipadd = InetAddress.getLocalHost();
          
          
          // web socket
          Socket sock = new Socket("https://www.compilejava.net/",80);
          add = sock.getInetAddress();
          System.out.println("Connected to " + add);
         sock.close();

          

          	
        }
      	catch (UnknownHostException e)
        {
         System.exit(2);
      	}
      	catch (java.io.IOException e)
        {
         System.out.println("Can't connect to " + args[0]);
         System.out.println(e);
        }

      
      
		System.out.println(ipadd.getHostName() + "=" + ipadd.getHostAddress());
      	System.exit(0);
		
	// to get local ip and host addresses
		InetAddress addr = InetAddress.getLocalHost();
     		 System.out.println("Local HostAddress: "+addr.getHostAddress());
      		String hostname = addr.getHostName();
      		System.out.println("Local host name: "+hostname);


    
    }
}
