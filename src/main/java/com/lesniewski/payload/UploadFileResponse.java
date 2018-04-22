package com.lesniewski.payload;

/**
 * Created by Adrian on 4/15/2018.
 */
public class UploadFileResponse {


    private String name;
    private String fileDownloadUri;
    private String fileType;
    private long size;


    public UploadFileResponse(String name, String fileDownloadUri, String fileType, long size) {
        this.name = name;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
