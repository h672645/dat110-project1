package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class DisplayStub extends RPCLocalStub {

	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (String message) {
		
		// TODO - START
		
		// implement marshalling, call and unmarshalling for write RPC method
		
		byte[] data=RPCUtils.marshallString(message);
		byte[] array = rpcclient.call((byte)Common.WRITE_RPCID ,data);
		RPCUtils.unmarshallVoid(array);

		//if (true)throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
		
	}
}
