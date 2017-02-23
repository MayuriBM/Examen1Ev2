package es.salesianos.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage{
	
	public HomePage() {
		BookmarkablePageLink link1 = 
			new BookmarkablePageLink("linkAlumnoForm", 
			AlumnoPage.class);
		BookmarkablePageLink link3 = 
				new BookmarkablePageLink("linkAlumnoList", 
				AlumnoPage.class);
		
		
		
		add(link1);
		add(link3);
		
	}

}
