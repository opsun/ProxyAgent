package com.opsunv.proxyagent;

import com.opsunv.proxyagent.model.ProxyInfo;
import com.opsunv.proxyagent.model.SocksProxyLink;
import com.opsunv.proxyagent.socks.SocksProxyServer;

public class SocksProxyMain {
	public static void main(String[] args) throws Exception{
		SocksProxyLink link = new SocksProxyLink();
		link.add(new ProxyInfo("127.0.0.1", 1081));
		link.add(new ProxyInfo("127.0.0.1", 1080));
		
		SocksProxyServer server = new SocksProxyServer(new int[]{8888},link);
		server.start();
		
		Thread.sleep(10000000000L);
		
	}
}
