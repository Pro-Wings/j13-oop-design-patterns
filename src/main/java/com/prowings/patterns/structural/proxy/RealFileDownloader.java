package com.prowings.patterns.structural.proxy;

public class RealFileDownloader implements FileDownloader{

	@Override
	public void download(String fileName, String userType, long fileSizeInMB) throws Exception {
		System.out.println("Downloading file: " + fileName);
		System.out.println("User Type: " + userType);
		System.out.println("File Size: " + fileSizeInMB + " MB");
		Thread.sleep(2000); // Simulate time taken to download
		System.out.println("Download complete.");
		System.out.println("File downloaded successfully.");
		System.out.println("File size: " + fileSizeInMB + " MB");
		System.out.println("File name: " + fileName);
		System.out.println("User type: " + userType);
		System.out.println("Download time: 2 seconds");
		System.out.println("------------------------------");
	}

}
