package com.mycompany.narutogacha;

import javax.swing.ImageIcon;
public class Cards{
ImageIcon i;
    String name;
    ImageIcon path;
    String voice;
    //Cards(){}
    Cards(String n,ImageIcon p){
    this.name=n;
    System.out.print(p);
    this.path=p;
    
}
    Cards(String n,ImageIcon p,String sound){
    this.voice=sound;
    this.name=n;
    System.out.print(p);
    this.path=p;
    
}
    public ImageIcon getImg(){
    return this.path;
    }
    public String getVoice(){
    return this.voice;}
    
   
}
