package com.company;
import java.lang.Thread;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args)
    {

        for (;;)
        {
            progressbar b = new progressbar();
            ListOfProcess list = new ListOfProcess();

            b.showProgressbar();
            list.ShowList();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
