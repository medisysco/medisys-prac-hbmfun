package my.com.medisys.prac.hbmfun.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import my.com.medisys.prac.hbmfun.entity.MaritalStatus;


/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
@Repository
@Transactional(readOnly = true)
public class MaritalStatusRepositoryImpl implements MaritalStatusRepositoryCustom {

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MaritalStatusRepositoryImpl.class);

    @Autowired
    SessionFactory sessionFactory;

    /*@Override
    @SuppressWarnings("unchecked")
    public MaritalStatus findByMaritalStatusCode(String maritalStatusCode) {
        String hql = "SELECT ms FROM MaritalStatus ms WHERE ms.maritalStatusCode = :maritalStatusCode";
        Query qry = getSession().createQuery(hql);
        qry.setParameter("maritalStatusCode", maritalStatusCode);
        List<MaritalStatus> list = qry.list();
        return CollectionUtils.isEmpty(list) ? null : list.get(0);
    }*/

    @Override
    @SuppressWarnings("unchecked")
    public MaritalStatus findByMaritalStatusCode(String maritalStatusCode) {
        Query qry = getSession().getNamedQuery("MaritalStatus.findByMaritalStatusCode");
        qry.setParameter("maritalStatusCode", maritalStatusCode);
        List<MaritalStatus> list = qry.list();
        return CollectionUtils.isEmpty(list) ? null : list.get(0);
    }

    /*@Override
    public MaritalStatus findByMaritalStatusCode(String maritalStatusCode) {
        return getSession().get(MaritalStatus.class, maritalStatusCode);
    }*/

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

}
