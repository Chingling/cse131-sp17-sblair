package scraping;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cse131.ArgsProcessor;

public class Weather {
	
	public static void main(String[] args) throws IOException {
		ArgsProcessor ap = new ArgsProcessor(args);
			
		String zip = ap.nextString("What zip code?");
		
		Document doc = Jsoup.connect("http://www.wunderground.com/cgi-bin/findweather/getForecast?query="+zip).get();
		String wholeThing = doc.toString();
		//
		// Get rid of the print of the whole thing
		//
		
		//TEMP
		String findTemp = "curTemp";
		String endTemp = "span>";
		int indexStart = wholeThing.indexOf(findTemp);
		int indexEnd = wholeThing.indexOf(endTemp, indexStart);
		String curTemp = wholeThing.substring(indexStart, indexEnd);
		
		int indexStart2 = curTemp.indexOf("wx-value");
		int indexEnd2 = curTemp.indexOf("/", indexStart2);
		String curTemp2 = curTemp.substring(indexStart2, indexEnd2);
		
		int indexStart3 = curTemp2.indexOf(">");
		int indexEnd3 = curTemp2.indexOf("<", indexStart3);
		String curTemp3 = curTemp2.substring(indexStart3+1, indexEnd3);
		
		
		//PRESSURE
		String findPres = "n>Pressure";
		String endPres = "span>";
		int indexStartPres = wholeThing.indexOf(findPres);
		int indexEndPres = wholeThing.indexOf(endPres, indexStartPres);
		String curPres = wholeThing.substring(indexStartPres, indexEndPres);
		
		int indexStartPres2 = curPres.indexOf("wx-value");
		int indexEndPres2 = curPres.indexOf("/", indexStartPres2);
		String curPres2 = curPres.substring(indexStartPres2, indexEndPres2);
		
		int indexStartPres3 = curPres2.indexOf(">");
		int indexEndPres3 = curPres2.indexOf("<", indexStartPres3);
		String curPres3 = curPres2.substring(indexStartPres3+1, indexEndPres3);
		
		
		//System.out.println(indexStart);
		//System.out.println(indexEnd);
		
		
		
		//
		// and instead do string searching and trimming 
		// to isolate the temperature reading
		// report that as your output
		//
		System.out.println("Temperature is " + curTemp3 + " F"); // FIXME
		//
		// And find one more statistic of interest and report that:
		//
		System.out.println("And Pressure is " + curPres3 + " inches");  // FIXME

	}

}
