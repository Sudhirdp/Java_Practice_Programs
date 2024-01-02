//URLConnection

import java.io.*;
import java.net.*;
import java.util.*;

class URLConnectionDemo{
	public static void main(String [] args)throws IOException{
		URL obj = new URL("https://www.godaddy.com/en-in/domains?itc=dlp_domain&tmskey=1dom_03_buydomain");

		URLConnection conn = obj.openConnection();

		System.out.println("Last Modified "+new Date(conn.getLastModified()));
	}
}

