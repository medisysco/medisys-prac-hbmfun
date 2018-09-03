package my.com.medisys.prac.hbmfun.service;

import java.util.List;

import my.com.medisys.prac.hbmfun.entity.Gender;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public interface GenderService {
    List<Gender> findAll();
    Gender getByGenderCode(String genderCode);
}
