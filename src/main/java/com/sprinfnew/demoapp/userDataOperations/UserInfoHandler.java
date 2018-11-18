package com.sprinfnew.demoapp.userDataOperations;

import com.sprinfnew.demoapp.userDataOperations.userFortune.UserFortuneService;
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
    public String getUserFortune() {
        return userFortuneService.getUserFortune("User will receive the greatest info from haven");
    }
}
