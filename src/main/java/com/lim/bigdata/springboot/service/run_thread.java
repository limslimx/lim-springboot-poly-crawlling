package com.lim.bigdata.springboot.service;

public class run_thread extends Thread {

    public void run(){
        try{
            while(true){
                Thread.sleep(1000); //1초마다 sleep해라(쉬어라)
                System.out.println("스레드 동작중");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
