/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
interface PlayPause{
    void play();
    void pause();
}

interface Download{
    void download();
    
    default void downloadStatus(){      //default used bcs code inside the interface
        System.out.println("");
        System.out.println("Downloading....");
    };
}

class Features implements PlayPause, Download{
    String Title;
    String Playlist;
    
    Features(String Title, String Playlist){
        this.Title = Title;
        this.Playlist = Playlist;
    }
    
    public void play(){
        System.out.println(Title+" is playing!!!!!");
    }
    
    public void pause(){
        System.out.println(Title+" is paused");
    }
    
   
    public void downloadStatus(){
        Download.super.downloadStatus(); //wanted to call the non-overriden method first and then the overriden one
        
        System.out.println("Download complete :D");
    }
    
    public void download(){
        System.out.println(Title+" has been downloaded in your account.");
    }
    
    public void AddToPlaylist(){
        System.out.println("");
        System.out.println(Title+" added to playlist "+Playlist);
    }
}

public class MusicApp{
    public static void main(String[] args){
        PlayPause p = new Features("Farda","jhoom");
         
        p.play();
        p.pause();
        
        Features f = new Features("Farda","jhoom");
        f.downloadStatus();
        f.download();
        f.AddToPlaylist();
    }
}
