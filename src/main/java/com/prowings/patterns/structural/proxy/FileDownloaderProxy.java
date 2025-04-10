package com.prowings.patterns.structural.proxy;

public class FileDownloaderProxy implements FileDownloader {
	
    private RealFileDownloader realDownloader = new RealFileDownloader();

    @Override
    public void download(String fileName, String userType, long fileSizeInMB) throws Exception {
        System.out.println("User Type: " + userType + " is trying to download " + fileName);

        // Rule 1: Only premium users allowed
        if (!"premium".equalsIgnoreCase(userType)) {
            throw new Exception("Access Denied: Only premium users can download files.");
        }

        // Rule 2: Limit file size
        if (fileSizeInMB > 100) {
            throw new Exception("File too large to download (Limit: 100 MB)");
        }

        // Forward the request
        realDownloader.download(fileName, userType, fileSizeInMB);
    }
    

}
