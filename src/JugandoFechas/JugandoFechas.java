package JugandoFechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

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

        diadeHoy.set(Calendar.MONTH, 0);
        System.out.println("El día de hoy es: " + diadeHoy.getTime());

        diadeHoy.set(2000, 8, 23, 13, 48);
        System.out.println("El día de hoy es: " + diadeHoy.getTime());
        diadeHoy.set(Calendar.YEAR, 2000);
        diadeHoy.set(Calendar.MONTH, Calendar.JANUARY);
        diadeHoy.set(Calendar.DAY_OF_MONTH, 22);
        diadeHoy.set(Calendar.HOUR, 1);
        diadeHoy.set(Calendar.AM_PM, Calendar.PM);
        diadeHoy.set(Calendar.MINUTE, 23);
        diadeHoy.set(Calendar.SECOND, 43);
        System.out.println("El día de hoy es: " + diadeHoy.getTime());
        
    }
}
