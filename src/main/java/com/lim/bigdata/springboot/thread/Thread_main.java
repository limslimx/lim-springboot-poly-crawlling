package com.lim.bigdata.springboot.thread;

public class Thread_main {
    public static void main(String[] args) throws Exception{
        run_thread goThread=new run_thread();
        goThread.start(); //run_thread 클래스에는 start() 메서드가 존재하지 않지만 Thread를 상속하고 run() 메서드를 만들면 그 안의 것들을 실행시킬 수 있다

        System.out.println("현재 스레드가 실행되고 있습니다");
        Thread.sleep(3000);
        goThread.interrupt(); //스레드를 종료시킴
        System.out.println("스레드 종료");
    }
}