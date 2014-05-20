package com.wdeanmedical.portal.persistence;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.wdeanmedical.portal.entity.Module;
import com.wdeanmedical.portal.entity.Activity;
import com.wdeanmedical.portal.entity.ActivityLog;

@Transactional
public class ActivityLogDAO  extends SiteDAO{
	
      private static final Logger log = Logger.getLogger(ActivityLogDAO.class);
		
      private SessionFactory sessionFactory;

      public ActivityLogDAO() {
        super();
      }

      public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
      }

      @Override
      protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
      }
      
      public void create(ActivityLog activityLog, Integer activityId, Integer moduleId) throws Exception {
       	  Session session = this.getSession();
    	  Activity activity = (Activity)this.findById(Activity.class, activityId);
    	  Module module = (Module) this.findById(Module.class, moduleId);
    	  activityLog.setActivity(activity);
    	  activityLog.setModule(module);
     	  session.save(activityLog);     	
	  }

}
