package com.company;


public class Main {

    public static void main(String[] args) {
	try
    {User fromWho = new User("tryinjava@mail.ru", "blubbyiscool1");

	User toWho = new User("java-tryin@rambler.ru","");

	SendMessage message = new SendMessage();

        System.out.println(message.Send(fromWho, toWho));
        try { Thread.sleep(4000);
    }
    catch(InterruptedException e)
    {
        e.printStackTrace();
    }
    }
    catch (Exception e){
	    System.out.println("ooops, smthing is wrong: "+e);
    }

    }
}
