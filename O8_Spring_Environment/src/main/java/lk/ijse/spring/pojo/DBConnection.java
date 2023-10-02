package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 10/2/2023 -- 7:33 PM
 **/

@Component
public class DBConnection implements InitializingBean {

    @Value("${os.name}")
    private String  osName;

    @Value("${USERNAME}")
    private String  userName;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(userName);
    }
}
