package ua.kiev.koroban.feodal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCreateObjBySpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean objTestBean = appContext.getBean("testBean", TestBean.class);
        System.out.println(objTestBean.getTestBeenName());

        appContext.close();
    }

}
