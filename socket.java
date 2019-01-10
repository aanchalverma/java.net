import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class sock
{
  public static void main(String args[])
  {
    
    try
    {
	ServerSocket ssock = new ServerSocket(1234);
      System.out.println("Listening");
      Socket sock = ssock.accept();
      ssock.close(); 
  PrintStream ps = new PrintStream(sock.getOutputStream());
	for (int i = 10; i >= 0; i--) 
    {
         ps.println(i + " from Java Source and Support.");
    }
      ps.close();
      sock.close();
    }
    catch(Exception e)
    {
    	System.out.print("caught");
    }
  }

  

}
