package aula13.salaaula.excecao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormataData {
	
	static SimpleDateFormat format = 
			new SimpleDateFormat("dd/MM/yyyy");

    public static Date convertStringToDate(String dataRecebida) 
    		throws ParseException {
        Date dataFormatada = format.parse(dataRecebida);
        return dataFormatada;
    }

    public static String convertDateToString(Date data){
        String dataString = format.format(data);
        return dataString;

    }
}
