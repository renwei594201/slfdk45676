package com.rw.pachong;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Dome1 {

	public static void main(String[] args) throws Exception {
		Connection connect = Jsoup.connect("https://s.taobao.com/search?q=µÄ&commend=all&ssid=s5-e&search_type=mall&sourceId=tb.index&area=c2c&spm=a1z02.1.6856637.d4910789");
		Document document = connect.get();
		System.out.println(document.toString());
		Elements select = document.select(".ctx-box J_MouseEneterLeave J_IconMoreNew");
		System.out.println(select.html());
		document.select(".price .g_price .g_price-highlight");
		for (Element element : select) {
			String attr = element.attr("href");
		}
	}
}
