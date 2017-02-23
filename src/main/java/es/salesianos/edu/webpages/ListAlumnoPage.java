package es.salesianos.edu.webpages;


import java.util.Collections;
import java.util.List;


import org.apache.wicket.markup.html.WebPage;

import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;

import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.wicket.markup.html.basic.Label;

import es.salesianos.edu.models.Alumno;

import es.salesianos.edu.repository.Repository;
import es.salesianos.edu.service.ServiceAlumno;


public class ListAlumnoPage extends WebPage{
	
	private static final long serialVersionUID = -1935854748907274886L;
	
	@SpringBean
	ServiceAlumno service;
	
	@Autowired
	
	Repository repository;

	private List<Alumno> listAlumno = Collections.emptyList();
	

	public ListAlumnoPage() {
		initC();
	}
	
	/*public void addFormList() {
		Form form = new Form("formListTeam", new CompoundPropertyModel(new Team())) {
			
		};
		add(form);
	}*/
	
	public void initC(){
		//addFormList();
		addViewListForm();
	}
	
	
	
	
	
	public void addViewListForm() {
		Alumno alumno = new Alumno();
		listAlumno = service.addListAlumno();
		ListView <Alumno> alumnos = new ListView<Alumno>("alumno-group", listAlumno) {
			@Override
			protected void populateItem(ListItem item) {
				Alumno alumno = (Alumno) item.getModelObject();
				item.add(new Label("name", alumno.getname()));
				item.add(new Label("bocadillo", alumno.getBocadillo()));
			}
		};
		add(alumnos);
	}
}
