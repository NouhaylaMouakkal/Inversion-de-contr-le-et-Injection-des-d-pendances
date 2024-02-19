package ext;

import ma.enset.dao.IDao;

import java.util.Date;

public class DaoImplWS implements IDao {
    @Override
    public Date getDate() {
        System.out.println(" Version Web Service : ");
        return new Date();
    }
}
