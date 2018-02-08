package main.java.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {

  ArrayList<String>  songs = new ArrayList<String>();


  public static void main(String[] args) {
    System.out.println(System.getProperty("user.dir"));
    new ArrayListMain().go();
  }

  public void go() {
    getSongs();
    System.out.println(songs);
    Collections.sort(songs);
    System.out.println(songs);
  }

  public void getSongs() {
    try{
      File file = new File(String.format("%s/src/main/resource/songs.txt", System.getProperty("user.dir")));
      BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

      String line = null;

      while((line = bufferedReader.readLine())!= null) {
        addSong(line);
      }

    }catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void addSong(String line) {
    String[] tokens = line.split("/");
    songs.add(tokens[0]);
  }
}
