package networld.im.impl;

import de.tavendo.autobahn.secure.WebSocketOptions;
import networld.im.socket_interface.IWebSocketOptions;


public class WebSocketOptionsWrapper extends WebSocketOptions
{
	
	IWebSocketOptions options;
	
	public WebSocketOptionsWrapper(IWebSocketOptions options)
	{
		this.options = options;
	}

	@Override
	public boolean getMaskClientFrames()
	{
		return options != null ? options.getMaskClientFrames() : super.getMaskClientFrames();
	}

	@Override
	public int getMaxFramePayloadSize()
	{
		return options != null ? options.getMaxFramePayloadSize() : super.getMaxFramePayloadSize();
	}

	@Override
	public int getMaxMessagePayloadSize()
	{
		return options != null ? options.getMaxMessagePayloadSize() : super.getMaxMessagePayloadSize();
	}

	@Override
	public boolean getReceiveTextMessagesRaw()
	{
		return options != null ? options.getReceiveTextMessagesRaw() : super.getReceiveTextMessagesRaw();
	}

	@Override
	public int getSocketConnectTimeout()
	{
		return options != null ? options.getSocketConnectTimeout() : super.getSocketConnectTimeout();
	}

	@Override
	public int getSocketReceiveTimeout()
	{
		return options != null ? options.getSocketReceiveTimeout() : super.getSocketReceiveTimeout();
	}

	@Override
	public boolean getTcpNoDelay()
	{
		return options != null ? options.getTcpNoDelay() : super.getTcpNoDelay();
	}

	@Override
	public boolean getValidateIncomingUtf8()
	{
		return options != null ? options.getValidateIncomingUtf8() : super.getValidateIncomingUtf8();
	}

	@Override
	public void setMaskClientFrames(boolean enabled)
	{
		if (options != null)
		{
			options.setMaskClientFrames(enabled);
			return;
		}
		
		super.setMaskClientFrames(enabled);
	}

	@Override
	public void setMaxFramePayloadSize(int size)
	{
		if (options != null)
		{
			options.setMaxFramePayloadSize(size);
			return;
		}
		
		super.setMaxFramePayloadSize(size);
	}

	@Override
	public void setMaxMessagePayloadSize(int size)
	{
		if (options != null)
		{
			options.setMaxMessagePayloadSize(size);
			return;
		}
		
		super.setMaxMessagePayloadSize(size);
	}

	@Override
	public void setReceiveTextMessagesRaw(boolean enabled)
	{
		if (options != null)
		{
			options.setReceiveTextMessagesRaw(enabled);
			return;
		}
		
		super.setReceiveTextMessagesRaw(enabled);
	}

	@Override
	public void setSocketConnectTimeout(int timeoutMs)
	{
		if (options != null)
		{
			options.setSocketConnectTimeout(timeoutMs);
			return;
		}
		
		super.setSocketConnectTimeout(timeoutMs);
	}

	@Override
	public void setSocketReceiveTimeout(int timeoutMs)
	{
		if (options != null)
		{
			options.setSocketReceiveTimeout(timeoutMs);
			return;
		}
		
		super.setSocketReceiveTimeout(timeoutMs);
	}

	@Override
	public void setTcpNoDelay(boolean enabled)
	{
		if (options != null)
		{
			options.setTcpNoDelay(enabled);
			return;
		}
		
		super.setTcpNoDelay(enabled);
	}

	@Override
	public void setValidateIncomingUtf8(boolean enabled)
	{
		if (options != null)
		{
			options.setValidateIncomingUtf8(enabled);
			return;
		}
		
		super.setValidateIncomingUtf8(enabled);
	}

}
