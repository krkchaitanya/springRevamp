package com.springnew.demoapp.userDataOperations;

import com.springnew.demoapp.userDataOperations.userFortune.UserFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserInfoHandler {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserFortuneService userFortuneService = (UserFortuneService) context.getBean("userFortuneService");

    private UserDO userDO;
    public UserDO getUserData() {
        UserDO user1 =
                new UserDO(
                        "mikel","kors","7834783478",
                        "mikelkors8989@yahoo.com","123 west firaclae ave"
                );
        return user1;
    }
    @Autowired
    public String getUserFortune() {
        return userFortuneService.userFortuneData("User will receive the greatest info from haven");
    }
}
