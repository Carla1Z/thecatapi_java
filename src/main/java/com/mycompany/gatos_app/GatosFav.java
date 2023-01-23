/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gatos_app;

/**
 *
 * @author Carla
 */
public class GatosFav {
    String id;
    String image_id;
    String apikey= "live_N29Hoo1gTzXlKeuHSXk2tDu6pbQkAMjsUZCNoqmWskk5oyovShMq2qoI6j8H1zbV";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public Imagex getImage() {
        return image;
    }

    public void setImage(Imagex image) {
        this.image = image;
    }
    Imagex image;
    
    
}
