package de.vignold.vignoldmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import de.vignold.vignoldmanagement.util.LoggingInterceptor;

@EnableSwagger2
@SpringBootApplication
public class VignoldManagementApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(VignoldManagementApplication.class, args);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new LoggingInterceptor()).addPathPatterns("/**");
    }


    @Bean
    public Docket docket()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(getClass().getPackage().getName()))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(generateApiInfo());
    }


    private ApiInfo generateApiInfo()
    {
        return new ApiInfo("Vignold Server Applicant Test Service", "This service is to check the technology knowledge of a server applicant for Vignold.", "Version 1.0 - mw",
                "urn:tos", "turkdev@vignold.de", "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
    }
}
