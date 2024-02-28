package com.spring.curso.webapp.springbootweb.models.dto;

public class GrettingDto {
    private Integer id;
    private String message;

    public GrettingDto(){}

    public GrettingDto(Integer id, String message){
        this.id = id;
        this.message = message;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
}
