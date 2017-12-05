package com.company;

import org.jutils.jprocesses.JProcesses;
import org.jutils.jprocesses.model.ProcessInfo;
import java.util.List;
import java.util.ListIterator;

public class ListOfProcess
{
    private List<ProcessInfo> processesList = JProcesses.getProcessList();

    public ListOfProcess()
    { }
    public void ShowList ()
    {
        System.out.println("PID           UID           NAME           CPU           RAM");
        for (final ProcessInfo processInfo : processesList)
        {
            System.out.println(processInfo.getPid() + "           " + processInfo.getUser()+ "           " + processInfo.getName()
                    + "           " + (processInfo.getCpuUsage()) + "           " + processInfo.getPhysicalMemory());
        }
    }


}
