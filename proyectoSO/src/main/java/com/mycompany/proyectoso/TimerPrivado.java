/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoso;

/**
 *
 * @author sanbr
 */
import java.util.Timer;
import java.util.TimerTask;

public class TimerPrivado {
    Timer timer;
    public Proceso process;
    public int seconds;
    public TimerPrivado(Proceso process) {
        timer = new Timer();
        this.seconds = Scheduler.GetTimeOut();
        this.process = process;
        timer.schedule(new StopTask(), this.seconds * 1000);
    }


    class StopTask extends TimerTask {
        @Override
        public void run() {
            Scheduler.RemoveEjecutandose(process);
            process.timeLeft = process.timeLeft - seconds;
            if (process.timeLeft > 0 && !process.isBlocked)
            {
                Scheduler.AddListo(process);
            } 
            timer.cancel();
        }
    }
}