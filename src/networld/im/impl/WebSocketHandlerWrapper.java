package networld.im.impl;


import de.tavendo.autobahn.secure.WebSocketConnectionHandler;
import networld.im.socket_interface.IWebSocketHandler;


public class WebSocketHandlerWrapper extends WebSocketConnectionHandler
{
	IWebSocketHandler handler;
	
	public WebSocketHandlerWrapper(IWebSocketHandler handler)
	{
		this.handler = handler;
	}
	
	@Override
	public void onBinaryMessage(byte[] payload)
	{
		if (handler != null)
		{
			handler.onBinaryMessage(payload);
		}
	}

	@Override
	public void onClose(WebSocketCloseNotification code, String reason) {
		if (handler != null)
		{
			handler.onClose(code.ordinal(), reason);
		}
	}

	@Override
	public void onOpen()
	{
		if (handler != null)
		{
			handler.onOpen();
		}
	}

	@Override
	public void onRawTextMessage(byte[] payload)
	{
		if (handler != null)
		{
			handler.onRawTextMessage(payload);
		}
	}

	@Override
	public void onTextMessage(String payload)
	{
		if (handler != null)
		{
			handler.onTextMessage(payload);
		}
	}

}
