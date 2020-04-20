package com.lim.bigdata.springboot.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;


@Service
public class NaverNewsCrawlling {

    private String url;
    private Document doc;

    public String returnCrawlling() throws Exception{
        url="https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=105&oid=025&aid=0002994244";
        doc=Jsoup.connect(url).get(); //파싱된 HTML DOM객체가 doc에 저장됨

        Elements body=doc.select("div#articleBody"); //id값을 쓸거면 #을쓰고 class값을 쓸거면 .을 사용하면 됨
        String str=body.text(); // .text()가 크롤링한 요소의 글을 보기 좋게 정제해줌

        System.out.println("내용: "+str);

        return str;
    }

    public String returnCrawllingTitle() throws Exception{
        url="https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=105&oid=025&aid=0002994244";
        doc=Jsoup.connect(url).get(); //파싱된 HTML DOM객체가 doc에 저장됨

        Elements title=doc.select("h3#articleTitle");
        String str_title=title.text();

        System.out.println("제목: "+str_title);

        return str_title;
    }
}
