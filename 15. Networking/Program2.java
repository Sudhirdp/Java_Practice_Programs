import java.net.*;

class URLDemo{
	public static void main(String [] args)throws MalformedURLException{
		URL obj = new URL("https://www.godaddy.com/en-in/domains?itc=dlp_domain&tmskey=1dom_03_buydomain");

		System.out.println(obj.getProtocol());
		System.out.println(obj.getPort());
		System.out.println(obj.getFile());
	}
}

