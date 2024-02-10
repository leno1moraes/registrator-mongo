package com.registrator.backend.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public class Registrator {

    @Id
    private String id;
    private String ip;
    private String local;

    public Registrator(){

    }

    public Registrator(String ip, String local){
        super();
        this.ip = ip;
        this.local = local;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

        
}