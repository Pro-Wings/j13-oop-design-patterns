package com.prowings.patterns.structural.proxy;

public class TestProxyFileDownloader {
	
	public static void main(String[] args) {
		
        FileDownloader downloader = new FileDownloaderProxy();

        try {
//			downloader.download("tutorial.pdf", "premium", 50);
			downloader.download("tutorial.pdf", "basic", 50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
