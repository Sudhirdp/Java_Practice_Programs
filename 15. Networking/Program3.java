import java.io.*;
import java.net.*;
import java.awt.*;

class OpenSite{
	public static void main(String [] args)throws IOException,URISyntaxException{
		String url = "https://www.godaddy.com/en-in/domains?itc=dlp_domain&tmskey=1dom_03_buydomain";

		URI obj = new URI(url);

		Desktop desk = Desktop.getDesktop();
		desk.browse(obj);
	}
}

		
