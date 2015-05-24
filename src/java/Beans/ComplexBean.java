/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author macbookpro
 */
public class ComplexBean {
    private float reel;
    private float img;
    
    public ComplexBean(){
        super();
    }
    
    public ComplexBean(float r,float i){
        this.reel=r;
        this.img=i;
    }

    public float getReel() {
        return reel;
    }

    public float getImg() {
        return img;
    }

    public void setReel(float reel) {
        this.reel = reel;
    }

    public void setImg(float img) {
        this.img = img;
    }
    
    
}
