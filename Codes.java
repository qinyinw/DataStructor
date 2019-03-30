package data_structor;
import java.util.LinkedList;
import java.util.Queue;
public class Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] key= {5,12,-3,8,-9,4,10};
		Integer KeyValue;
		String encoded="",decoded="";
		String message="all programmers are playwrights and all computers are lousy actors";
		Queue<Integer> encodingQueue=new LinkedList<Integer>();
		Queue<Integer> decodingQueue=new LinkedList<Integer>();
		for(int scan=0;scan<key.length;scan++) {
			encodingQueue.add(key[scan]);
			decodingQueue.add(key[scan]);
		}
		for(int scan=0;scan<message.length();scan++) {
			KeyValue=encodingQueue.remove();
			encoded+=(char)(message.charAt(scan)+KeyValue);
			encodingQueue.add(KeyValue);
		}
		System.out.println("encoder message :\n"+encoded+"\n");
		for(int scan=0;scan<encoded.length();scan++) {
			KeyValue=decodingQueue.remove();
			decoded+=(char)(encoded.charAt(scan)-KeyValue);
			decodingQueue.add(KeyValue);
		}
		System.out.println("Decoded Message:\n"+decoded);
		
	}

}
