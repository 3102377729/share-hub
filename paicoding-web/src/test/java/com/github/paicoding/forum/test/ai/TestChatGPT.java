package com.github.paicoding.forum.test.ai;

import com.plexpt.chatgpt.ChatGPT;
import com.plexpt.chatgpt.util.Proxys;

import java.net.Proxy;

public class TestChatGPT {
    public static void main(String[] args) {
       

        String res = chatGPT.chat("写一段七言绝句诗，题目是：火锅！");
        System.out.println(res);
    }
}
