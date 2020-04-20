package com.lim.bigdata.springboot.web;

import com.lim.bigdata.springboot.jsoup.NaverNewsCrawlling;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final NaverNewsCrawlling naverNewsCrawlling;

//    @GetMapping("/article")
//    public String artice() throws Exception{
//        return naverNewsCrawlling.returnCrawlling();
//    }
}
