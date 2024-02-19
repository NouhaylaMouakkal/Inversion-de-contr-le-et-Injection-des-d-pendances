package dao;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component("dao")
public class DaoImpl implements  IDao{
    @Override
    public Date getDate() {
        // se connecter à la BD pour récupérer la date
        System.out.println("Version Base De Données ");
        return new Date();
    }
}
