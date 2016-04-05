package networld.im.impl;

import android.net.Uri;

import java.net.URI;

import de.tavendo.autobahn.secure.WebSocketConnection;
import networld.im.socket_interface.IWebSocketConnection;
import networld.im.socket_interface.IWebSocketHandler;
import networld.im.socket_interface.IWebSocketOptions;


public class WebSocketConnectionImpl implements IWebSocketConnection
{
	
	private WebSocketConnection mConnection;
	
	public WebSocketConnectionImpl()
	{
		mConnection = new WebSocketConnection();
	}
	
	@Override
	public void connect(String wsUri, String[] wsSubprotocols, IWebSocketHandler wsHandler, IWebSocketOptions options) throws Exception
	{
		mConnection.connect(URI.create(wsUri), wsSubprotocols, new WebSocketHandlerWrapper(wsHandler), new WebSocketOptionsWrapper(options));
	}

	@Override
	public void connect(String wsUri, IWebSocketHandler wsHandler, IWebSocketOptions options) throws Exception
	{
		mConnection.connect(URI.create(wsUri), new WebSocketHandlerWrapper(wsHandler), new WebSocketOptionsWrapper(options));
	}

	@Override
	public void connect(String wsUri, IWebSocketHandler wsHandler) throws Exception
	{
		mConnection.connect(URI.create(wsUri), new WebSocketHandlerWrapper(wsHandler));
	}

	public void reconnect()
	{
		mConnection.reconnect();
	}

	@Override
	public void disconnect()
	{
		mConnection.disconnect();
	}

	@Override
	public boolean isConnected()
	{
		return mConnection.isConnected();
	}

	@Override
	public void sendBinaryMessage(byte[] payload)
	{
		mConnection.sendBinaryMessage(payload);
	}

	@Override
	public void sendRawTextMessage(byte[] payload)
	{
		mConnection.sendRawTextMessage(payload);
	}

	@Override
	public void sendTextMessage(String payload)
	{
		mConnection.sendTextMessage(payload);
	};
	
}
