

package shenzhen.teamway.tms9000;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan
@SpringBootApplication
@EnableTransactionManagement
/*
有这个注解就不需要在每个mapper类中添加mapper注解
 */
@MapperScan("shenzhen.teamway.tms9000.portal.mapper")
public class TMS9000Portal
{
    public static void main(String[] args) {
        SpringApplication.run(TMS9000Portal.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TMS9000Portal.class);
    }
    
}
