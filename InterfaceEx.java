interface Searchable {
    boolean search(String keyword);

}

class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public boolean search(String keyword) {
        return content.contains(keyword);
    }
}

class Webpage implements Searchable {

    //private String url;
    private String htmlContent;

    public Webpage(String url, String htmlContent) {
        //this.url = url;
        this.htmlContent = htmlContent;
    }

    public boolean search(String keyword) {
        return htmlContent.contains(keyword);
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Document doc = new Document("This is a sample doc");
        boolean documentContainsKeyword = doc.search("sample");
        System.out.println(documentContainsKeyword);

        Webpage webpage = new Webpage("https://www.javatpoint.com/java-tutorial", "This is a sample webpage");
        boolean webpageContainsKeyword = webpage.search("webpage");
        System.out.println(webpageContainsKeyword);

    }
}
