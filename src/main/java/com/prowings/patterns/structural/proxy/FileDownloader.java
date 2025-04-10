package com.prowings.patterns.structural.proxy;

public interface FileDownloader {
	
    void download(String fileName, String userType, long fileSizeInMB) throws Exception;

}
