

package shenzhen.teamway.tms9000.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan
@SpringBootApplication
@EnableTransactionManagement
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
