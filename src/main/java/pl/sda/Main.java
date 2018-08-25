package pl.sda;

import pl.sda.design.pattern.builder.User;
import pl.sda.design.pattern.builder.UserBuilderImpl;
import pl.sda.design.pattern.builder.UserBuilderJoshuaBloch;
import pl.sda.design.pattern.singleton.LoggerBillPughSingleton;
import pl.sda.design.pattern.singleton.LoggerEagerSingleton;
import pl.sda.design.pattern.singleton.LoggerEnumSingleton;
import pl.sda.design.pattern.singleton.LoggerThreadSafeSingleton;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        LoggerEagerSingleton
          .getInstance().writeMessage("Message Singleton Eager1");
        LoggerEagerSingleton.getInstance().writeMessage("Message Singleton Eager2");

        LoggerEnumSingleton.INSTANCE.writeMessage("Message Singleton Enum1");
        LoggerEnumSingleton.INSTANCE.writeMessage("Message Singleton Enum2");

        LoggerThreadSafeSingleton
          .getInstance().writeMessage("Message Singleton TS1");
        LoggerThreadSafeSingleton.getInstance().writeMessage("Message Singleton TS2");

        LoggerBillPughSingleton
          .getInstance().writeMessage("Message Singleton BP1");
        LoggerBillPughSingleton.getInstance().writeMessage("Message Singleton BP2");

        UserBuilderJoshuaBloch userJB = new UserBuilderJoshuaBloch.Builder("Name", "Surname").setSex('M').build();
        System.out.println(userJB);

        User user = new UserBuilderImpl()
          .setFirstName("FirtsName")
          .setLastName("Surname")
          .setSex('M')
          .build();
        System.out.println(user);
    }
}
