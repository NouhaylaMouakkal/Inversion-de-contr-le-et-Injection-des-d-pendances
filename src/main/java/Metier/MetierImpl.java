package Metier;

import ma.enset.dao.IDao;

import java.util.Date;
public class MetierImpl implements IMetier {
    private IDao dao ; // couplage faible
    @Override
    public Date calcul() {
        return dao.getDate();
    }
//Inecter dans la  variable dao un object d'une classe qui implement l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
