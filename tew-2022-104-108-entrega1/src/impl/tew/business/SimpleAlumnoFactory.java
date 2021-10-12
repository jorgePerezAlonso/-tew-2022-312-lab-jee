package impl.tew.business;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import com.tew.business.AlumnosService;
import com.tew.presentation.BeanAlumno;
import com.tew.presentation.FactoriaAlumno;

public class SimpleAlumnoFactory implements FactoriaAlumno {
	BeanAlumno alumno;
	

	
	@Override
	public BeanAlumno createAlumno() {
		// TODO Auto-generated method stub
		System.out.println("BeanAlumnos - PostConstruct");
		//Buscamos el alumno en la sesión. Esto es un patrón factoría claramente.
		alumno = (BeanAlumno) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(new String("alumno"));//Cambiar factoria.


		//si no existe lo creamos e inicializamos
		if (alumno == null) {
			System.out.println("BeanAlumnos - No existia");
			alumno = new BeanAlumno();
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put( "alumno", alumno);
		}
		return alumno;
	}
}
	


