package org.pokemonrun.petservice.serviceimpl;

import org.pokemonrun.petservice.dao.PetDao;
import org.pokemonrun.petservice.entity.Pet;
import org.pokemonrun.petservice.service.PetModifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetModifyServiceimpl implements PetModifyService {
    @Autowired
    private PetDao petDao;

    @Override
    public boolean addPet(String username, int typeID) {
        Pet tempPet = petDao.GetOnePet(username, typeID);
        if(tempPet!=null)
        {
            return false;
        }
        else
        {
            Pet tempPet1=new Pet(username,typeID,0,1);
            petDao.save(tempPet1);
            return true;
        }
    }

    @Override
    public boolean addExp(String username, int typeID, int exp) {
        Pet tempPet = petDao.GetOnePet(username, typeID);
        if(tempPet==null)
        {
            return false;
        }
        else
        {
            int oldexp=tempPet.getExp();
            int newexp=oldexp+exp;
            tempPet.setExp(newexp);
            petDao.save(tempPet);
            return true;
        }
    }

    @Override
    public boolean addNum(String username, int typeID, int num) {
        Pet tempPet = petDao.GetOnePet(username, typeID);
        if(tempPet==null)
        {
            return false;
        }
        else
        {
            int oldnum=tempPet.getNum();
            int newnum=oldnum+num;
            tempPet.setNum(newnum);
            petDao.save(tempPet);
            return true;
        }

    }
}