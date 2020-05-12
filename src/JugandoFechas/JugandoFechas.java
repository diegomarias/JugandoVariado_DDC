package JugandoFechas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class JugandoFechas {
    
    
    public static void main(String[] args) {
        Calendar diadeHoy = Calendar.getInstance();
        System.out.println("El día de hoy es: " + diadeHoy);
        System.out.println("El día de hoy es: " + diadeHoy.getTime());
        Calendar diaPersonalizado = new GregorianCalendar(1999, 6, 23, 23, 59);
        System.out.println("Mi día personalizado: " + diaPersonalizado.getTime());
//
//        diadeHoy.set(Calendar.MONTH, 0);
//        System.out.println("El día de hoy es: " + diadeHoy.getTime());
//
//        diadeHoy.set(2000, 8, 23, 13, 48);
//        System.out.println("El día de hoy es: " + diadeHoy.getTime());
//        diadeHoy.set(Calendar.YEAR, 2000);
//        diadeHoy.set(Calendar.MONTH, Calendar.JANUARY);
//        diadeHoy.set(Calendar.DAY_OF_MONTH, 22);
//        diadeHoy.set(Calendar.HOUR, 1);
//        diadeHoy.set(Calendar.AM_PM, Calendar.PM);
//        diadeHoy.set(Calendar.MINUTE, 23);
//        diadeHoy.set(Calendar.SECOND, 43);
//        System.out.println("El día de hoy es: " + diadeHoy.getTime());
//        
     //   diadeHoy.set(2000, Calendar.SEPTEMBER, 23, 13, 48);
        System.out.println("El día de hoy " + diadeHoy.getTime());
        
        System.out.println("Año: " + diadeHoy.get(Calendar.YEAR));
        System.out.println("Mes: " + diadeHoy.get(Calendar.MONTH));
        System.out.println("día del mes: " + diadeHoy.get(Calendar.DAY_OF_MONTH));
        System.out.println("Semana del mes: " + diadeHoy.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Día del año: " + diadeHoy.get(Calendar.DAY_OF_YEAR));
        
        
        System.out.println("===========LOCALE==========");
        Locale locale = Locale.getDefault();
        System.out.println("AM/PM: " + diadeHoy.getDisplayName(Calendar.AM_PM, Calendar.LONG, locale));
        System.out.println("Mes (String): " + diadeHoy.getDisplayName(Calendar.MONTH, Calendar.SHORT, locale));
        System.out.println("Día de la semana (String): " + diadeHoy.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale));
   
    
        System.out.println("=========SUMANDO Y RESTANDO FECHAS=========");
        
        System.out.println("Hoy es " + diadeHoy.get(Calendar.DAY_OF_MONTH) + " del mes " + diadeHoy.get(Calendar.MONTH) + " del año " + diadeHoy.get(Calendar.YEAR));
        
        diadeHoy.add(Calendar.DAY_OF_MONTH, 30);
        
        System.out.println("Dentro de 30 días será el: " + diadeHoy.get(Calendar.DAY_OF_MONTH) + " del mes " + diadeHoy.get(Calendar.MONTH) + " del año " + diadeHoy.get(Calendar.YEAR));
        
        
        
        System.out.println("=======COMPARAR FECHAS========");
        
        Calendar fechaDespues = Calendar.getInstance();
        fechaDespues.add(Calendar.MONTH, 3);
        if(diadeHoy.after(fechaDespues)){
            System.out.println("La fecha " + fechaDespues.getTime() + " es posterior a " + diadeHoy.getTime());
        }
        else {
            System.out.println(diadeHoy.before(fechaDespues));
        }
        
        System.out.println("=======TIME ZONE=======");
        Calendar diadeHoyTimeZone = Calendar.getInstance(TimeZone.getTimeZone("Canada/Central"));
        System.out.println("Hora actual en Canada: " + diadeHoyTimeZone.get(Calendar.HOUR));
        
        String [] timeZones = TimeZone.getAvailableIDs();
        
        System.out.println("Available Timezones " + Arrays.toString(timeZones));
        
        System.out.println("=======FORMATEAR FECHAS=======");
        System.out.println(diadeHoy.get(Calendar.DAY_OF_MONTH) + "/" + diadeHoy.get(Calendar.MONTH) + "/" + diadeHoy.get(Calendar.YEAR));
        
        System.out.println("=======SIMPLEDATEFORMAT=======");
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        
        //new Date()
        
        System.out.println(formateador.format(diadeHoy.getTime()));
        
        SimpleDateFormat formateador1 = new SimpleDateFormat("'Hoy es' EEEEEEEEE dd 'de' MMMMM 'de' yyyy"); 
        SimpleDateFormat formatea = new SimpleDateFormat("dd/MM/yyyy"); 
        SimpleDateFormat forma = new SimpleDateFormat("'Ingresaste' EEEEEEEEE dd 'de' MMMMM 'de' yyyy"); 
        DateFormat formatoFecha=DateFormat.getDateInstance(DateFormat.FULL); 
        
        System.out.println(formateador1.format(diadeHoy.getTime()));
        System.out.println(formatea.format(diadeHoy.getTime()));
        System.out.println(forma.format(diadeHoy.getTime()));
        
        System.out.println(formatoFecha.format(diadeHoy.getTime()));
        
        System.out.println("=======Pasar de Sting a fecha con SimpleDateFormat=======");
        
        SimpleDateFormat formateador2 = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha = "12/02/2020";
        try {
            Date fecha = formateador2.parse(strFecha);
        } catch(ParseException e){
            
        }
    }
}
