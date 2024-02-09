package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = new byte[SEGMENTSIZE];
		byte[] data;
		
		data = message.getData();
		int byteLength = data.length;
		
		segment[0]=(byte) byteLength;
		// TODO - START
		
		for(int i=0;i<byteLength;i++) {
			segment[i+1]=data[i];
		}
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
		
		//if (true)
		//	throw new UnsupportedOperationException(TODO.method());
			
		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		
		int length = segment[0];
		byte[] data = Arrays.copyOfRange(segment, 1, length+1);
		message = new Message(data);
		
		return message;
		
	}
	
}
