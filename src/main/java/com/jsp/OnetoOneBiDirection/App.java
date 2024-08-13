package com.jsp.OnetoOneBiDirection;

import com.jsp.OnetoOneBiDirection.dao.PersonDao;
import com.jsp.OnetoOneBiDirection.model.Pancard;
import com.jsp.OnetoOneBiDirection.model.Person;

public class App 
{
    public static void main( String[] args )
    {
        Person person=new Person();
        Pancard pancard=new Pancard();
        PersonDao personDao=new PersonDao();
        
//        person.setName("Krishna");
//        person.setAddress("Gujurat");
//        
//        pancard.setName("Guju1232d ");
//        
//        person.setPancard(pancard);
//        personDao.savePerson(person);
        
        person.setId(1);
        person.setName("Radha");
        person.setAddress("Gujurat");
        pancard.setPanid(1);
        person.setPancard(pancard);
        personDao.updatePerson(1, person);
    }
}
