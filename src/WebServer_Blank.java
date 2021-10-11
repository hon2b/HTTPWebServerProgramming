import java.io.* ;
import java.net.* ;
import java.util.* ;

public final class WebServer_Blank {
    public static void main(String argv[]) throws Exception {
    	
    	try {
    		// Could get the port number from the command line.
//    		int port = (new Integer(argv[0])).intValue();    		
    		
    		// Establish the listen socket.
    		ServerSocket serversocket = new ServerSocket(5878); // Mission 1		

    		
    		// Process HTTP service requests in an infinite loop.
    		while (true) {
    		    // Listen for a TCP connection request.
    			Socket socket = serversocket.accept(); // Mission 1 연결 요청이 수신되면 HttpRequest 개체를 만들고 설정된 연결을 나타내는 소켓 개체를 생성자에게 전달합니다.
    		    
    		    // Construct an object to process the HTTP request message.
    		    HttpRequest request = new HttpRequest (socket);
    		    
    		    // Create a new thread to process the request.
    		    Thread thread = new Thread(request); // mission 2    		    
    		    // Start the thread.
    		    thread.start();
    		}
    		
    		
    	}catch(IOException e) {
    		System.out.print(e.getMessage());
    	}catch(Exception e) {
    		System.out.print(e.getMessage());
    	}    	
		
    }
}