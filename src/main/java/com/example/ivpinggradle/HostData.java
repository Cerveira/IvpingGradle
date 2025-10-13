package com.example.ivpinggradle;

@SuppressWarnings("ClassCanBeRecord")
public class HostData {
    private final String host;
    private final String ip;
    private final String location;

    public HostData(String host, String ip, String location) {
        this.host = host;
        this.ip = ip;
        this.location = location;
    }

    public String getHost() {
        return host;
    }

    public String getIp() {
        return ip;
    }

    public String getLocation() {
        return location;
    }
}
