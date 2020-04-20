package com.lim.bigdata.springboot.web;

import com.lim.bigdata.springboot.jsoup.NaverNewsCrawlling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @Autowired
    private NaverNewsCrawlling naverNewsCrawlling;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/article")
    public String article(Model model) throws Exception{
        model.addAttribute("article_title", naverNewsCrawlling.returnCrawllingTitle());
        model.addAttribute("article", naverNewsCrawlling.returnCrawlling());
        return "article";
    }
}
