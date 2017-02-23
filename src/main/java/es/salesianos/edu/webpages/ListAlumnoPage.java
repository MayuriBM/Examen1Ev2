package es.salesianos.edu.webpages;

import java.awt.Container; 
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.wicket.markup.html.basic.Label;

import es.salesianos.edu.models.Alumno;
import es.salesianos.edu.models.Team;
import es.salesianos.edu.repository.Repository;
import es.salesianos.edu.service.ServiceAlumno;
import es.salesianos.edu.service.ServiceTeam;

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
		ListView<Alumno> alumno = new ListView<Alumno>("alumno-group", listAlumno) {
			@Override
			protected void populateItem(ListItem item) {
				Alumno alumno = (Alumno) item.getModelObject();
				item.add(new Label("alumnoName", alumno.getname()));
				item.add(new Label("bocadillo", alumno.getBocadillo()));
			}
		};
		add(alumno);
	}
}
