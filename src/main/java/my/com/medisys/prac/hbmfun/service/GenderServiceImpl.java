package my.com.medisys.prac.hbmfun.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.medisys.prac.hbmfun.entity.Gender;
import my.com.medisys.prac.hbmfun.repository.GenderRepository;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
@Service
public class GenderServiceImpl implements GenderService{

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(GenderServiceImpl.class);

    @Autowired
    GenderRepository repo;

    @Override
    public List<Gender> findAll(){
        return repo.findAll();
    }

    @Override
    public Gender findByGenderCode(String genderCode){
        return repo.findByGenderCode(genderCode);
    }

}
