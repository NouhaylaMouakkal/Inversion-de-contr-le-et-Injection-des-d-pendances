package Metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;
@Component
public class MetierImpl implements IMetier {

    private IDao dao ; // couplage faible
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public Date calcul() {
        return dao.getDate();
    }
//Injecter dans la  variable dao un object d'une classe qui implement l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
