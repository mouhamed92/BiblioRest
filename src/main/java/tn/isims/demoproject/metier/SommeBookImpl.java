package tn.isims.demoproject.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isims.demoproject.entities.Book;

@Service
public class SommeBookImpl implements ISomme{


    @Override
    public double sommeTotal(double prix, int nb,long id) {
        if(id==1){
            return prix*nb+123;
        }else
        return prix*nb;
    }

}
