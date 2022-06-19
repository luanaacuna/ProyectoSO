/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoso;

/**
 *
 * @author sanbr
 */
public class Recurso {
    public boolean isBlocked = false;
    
    public void Usar(Proceso process)
    {
        if (Scheduler.ejecutandose.contains(process) && !this.isBlocked)
        {
            process.isBlocked = true;
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
