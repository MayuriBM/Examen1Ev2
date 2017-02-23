package es.salesianos.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;

import es.salesianos.edu.models.Alumno;
import es.salesianos.edu.repository.Repository;
import es.salesianos.edu.service.ServiceAlumno;

public class AlumnoPage extends WebPage {
private static final long serialVersionUID = -1935854748907274886L;
	
	@SpringBean 
	ServiceAlumno serviceAlumno;
	
	@Autowired
	Repository repository;
	
	public AlumnoPage() {
		
		Form form = new Form("formInsertAlumno", new CompoundPropertyModel(new Alumno())) {
				
			@Override
			protected void onSubmit() {
				super.onSubmit();
				Alumno newAlumno = new Alumno();
				//casteo para que sepa que es un team. con el getModelObject accedo al valor que haya en los inputs
				newAlumno .setNameAlumno(((Alumno) getModelObject()).getNameAlumno());
				newAlumno .setBocadillo(((Alumno)getModelObject()).getBocadillo());
				serviceAlumno.insert(newAlumno);
				//addViewList();
			}
		};
		
		form.add(new Label("nameAlumnoLabel", getString("alumno.name")));
		form.add(new Label("bocadilloLabel", getString("tipo.bocadillo")));
		form.add(new RequiredTextField("nameAlumno"));
		form.add(new RequiredTextField("bocadillo"));
		
		add(form);
		
	}

}
