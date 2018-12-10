package org.csource.init;

/**
 * @author jcy
 * @description: 构建fastdfs客户端配置
 * @date 2018/12/10
 */
public class FdfsClientSetting {

    private int connectTimeout;
    private int networkTimeout;
    private String charset;
    private String[] trackerServers;
    private int trackerHttpPort;
    private boolean antiStealToken = false;
    private String secretKey;


    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getNetworkTimeout() {
        return networkTimeout;
    }

    public void setNetworkTimeout(int networkTimeout) {
        this.networkTimeout = networkTimeout;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String[] getTrackerServers() {
        return trackerServers;
    }

    public void setTrackerServers(String[] trackerServers) {
        this.trackerServers = trackerServers;
    }

    public int getTrackerHttpPort() {
        return trackerHttpPort;
    }

    public void setTrackerHttpPort(int trackerHttpPort) {
        this.trackerHttpPort = trackerHttpPort;
    }

    public boolean isAntiStealToken() {
        return antiStealToken;
    }

    public void setAntiStealToken(boolean antiStealToken) {
        this.antiStealToken = antiStealToken;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public int getConnectTimeout(int defaultConnectTimeout) {
        return connectTimeout <=0?defaultConnectTimeout: connectTimeout;
    }

    public int getNetworkTimeout(int defaultNetworkTimeout) {
        return networkTimeout <=0?defaultNetworkTimeout: networkTimeout;
    }

    public String getCharset(String defaultCharset) {
        return charset ==null||"".equals(charset)?defaultCharset: charset;
    }

    public int getTrackerHttpPort(int port) {
        return trackerHttpPort <=0?port: trackerHttpPort;
    }
}
