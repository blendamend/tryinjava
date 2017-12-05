package com.company;
import java.lang.management.*;
import java.lang.*;

public class progressbar
{
    private long freeMemorySize;
    private long totalMemorySize;

    public progressbar()
    {
        freeMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).
                getFreePhysicalMemorySize() / 1048576;
        totalMemorySize = ((com.sun.management.OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean()).
                getTotalPhysicalMemorySize() / 1048576;
    }

    private float howMuch()
    {
        long memory = freeMemorySize + totalMemorySize;

        Long l = new Long(totalMemorySize);
        Long m = new Long (memory);

        float percent = l.floatValue()/m.floatValue();

        percent = percent*100;

        return percent;
    }

    private StringBuilder stringOfPrB ()
    {
        StringBuilder pb =new StringBuilder("------------");
        float percent = howMuch();
        int i=0;

        while (percent>0)
        {
            pb.setCharAt(i,'|');
            percent-=10;
            i++;
        }

        return pb;
    }

    public void showProgressbar()
    {

        StringBuilder progressb = new StringBuilder(stringOfPrB());
        float percent = howMuch();

        System.out.println ("["+progressb+"]  " + percent + "%");
    }


}
