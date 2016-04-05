package networld.im.socket_interface;


public abstract interface IWebSocketOptions
{

	public boolean getMaskClientFrames();

	public int getMaxFramePayloadSize();

	
	public int getMaxMessagePayloadSize();

	
	public boolean getReceiveTextMessagesRaw();

	
	public int getSocketConnectTimeout();

	
	public int getSocketReceiveTimeout();

	
	public boolean getTcpNoDelay();

	
	public boolean getValidateIncomingUtf8();

	
	public void setMaskClientFrames(boolean enabled);

	
	public void setMaxFramePayloadSize(int size);

	
	public void setMaxMessagePayloadSize(int size);

	
	public void setReceiveTextMessagesRaw(boolean enabled);

	
	public void setSocketConnectTimeout(int timeoutMs);

	
	public void setSocketReceiveTimeout(int timeoutMs);

	
	public void setTcpNoDelay(boolean enabled);

	
	public void setValidateIncomingUtf8(boolean enabled);

}
