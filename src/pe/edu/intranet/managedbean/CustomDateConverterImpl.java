package pe.edu.intranet.managedbean;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;


@FacesConverter(value="customDateConverterImpl")
public class CustomDateConverterImpl implements Converter{
	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		Date date = (Date) arg2;
		date = new Date();
		String DATE_FORMAT = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date); // Configuramos la fecha que se recibe
		calendar.add(Calendar.DAY_OF_YEAR, 15);  // numero de días a añadir, o restar en caso de días<0
		return sdf.format(calendar.getTime()); // Devuelve el objeto Date con los nuevos días añadidos

	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date today = df.parse(arg2);
			return today;
		} catch (ParseException e) {
			FacesMessage message = new FacesMessage(
					FacesMessage.SEVERITY_ERROR, "Parser error!",
					"Cannot parse this date!");
			throw new ConverterException(message);
		}

	}
	
}
