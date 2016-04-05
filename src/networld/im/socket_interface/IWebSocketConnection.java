package networld.im.socket_interface;


public interface IWebSocketConnection
{

	
	public void connect(String wsUri, String[] wsSubprotocols, IWebSocketHandler wsHandler, IWebSocketOptions options) throws Exception;

	
	public void connect(String wsUri, IWebSocketHandler wsHandler, IWebSocketOptions options) throws Exception;

	
	public void connect(String wsUri, IWebSocketHandler wsHandler) throws Exception;

	public void reconnect();

	
//	protected void createHandler();

	
//	protected void createReader();

	
//	protected void createWriter();

	
	public void disconnect();

	
	public boolean isConnected();

	
//	protected void processAppMessage(Object message);

	
	public void sendBinaryMessage(byte[] payload);

	
	public void sendRawTextMessage(byte[] payload);

	
	public void sendTextMessage(String payload);
	
}
