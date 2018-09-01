package com.rw.pachong;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Dome {

	public static void main(String[] args) throws Exception {
		Connection connect = Jsoup.connect("https://s.taobao.com/search?q=µÄ&commend=all&ssid=s5-e&search_type=mall&sourceId=tb.index&area=c2c&spm=a1z02.1.6856637.d4910789");
		Document document = connect.get();
		System.out.println(document.toString());
		
	}
}
