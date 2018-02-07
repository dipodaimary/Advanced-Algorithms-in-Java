package WebCrawler;

public class App {
    public static void main(String[] args) {
        String rootUrl = "http://www.bbc.com";
        WebCrawler crawler = new WebCrawler();
        crawler.discoverWeb(rootUrl);
    }
}
