/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.LinkedList;

/**
 *
 * @author sanbr
 */
public class Recurso {
    public boolean isBlocked = false;
    public String recursoname;
    public Recurso(String recursoName)
    {
        this.recursoname = recursoName;
    }
    
    public void Usar(Proceso process)
    {
        process.isBlocked = true;
        if (Scheduler.ejecutandose.contains(process) && !this.isBlocked)
        {
            this.isBlocked = true;
            new TimerSalir(process);
        }
        else
        {
            new TimerSalir(process);
            Scheduler.AddBloqueado(process);
        }
    }
}
