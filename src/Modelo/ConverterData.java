
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.jdesktop.beansbinding.Converter;

public class ConverterData extends Converter{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        //objeto para a tela
    @Override
    public Object convertForward(Object value) {
        Calendar c = (Calendar) value;
        return sdf.format(c.getTime());
    }
//tela para o objeto
    @Override
    public Object convertReverse(Object value) {
        String str = (String) value;
        Calendar c = Calendar.getInstance();
        try{
            c.setTime(sdf.parse(str));
            return c;
        } catch(Exception e){
            return null;
        }
    
    }}
