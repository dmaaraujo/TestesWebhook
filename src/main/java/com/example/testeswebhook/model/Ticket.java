package com.example.testeswebhook.model;


import java.util.Map;

public class Ticket {
    private Long id;
    private String subject;
    private String type;
    private String description_text;
    private Map<String, Object> custom_fields;

    public Ticket(String subject, Long id, String type, String description_text, Map<String, Object> custom_fields) {
        this.subject = subject;
        this.id = id;
        this.type = type;
        this.description_text = description_text;
        this.custom_fields = custom_fields;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDescription_text() {
        return description_text;
    }
    public void setDescription_text(String description_text) {
        this.description_text = description_text;
    }
    public Map<String, Object> getCustom_fields() {
        return custom_fields;
    }
    public void setCustom_fields(Map<String, Object> custom_fields) {
        this.custom_fields = custom_fields;
    }
}


