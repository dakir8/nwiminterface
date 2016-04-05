package networld.im.socket_interface;


public interface IWebSocketHandler
{

	public void onClose(int code, String reason);

	public void onOpen();

	public void onTextMessage(String payload);
	
	public void onConnectionError();
	
	public void onRawTextMessage(byte[] payload);
	
	public void onBinaryMessage(byte[] payload);
	
}
