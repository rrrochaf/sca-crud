package com.puc.sca.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * springdoc-openapi-ui é uma dependência que pode ser adicionada no projeto para gerar a documentação utilizando o padrão OpenAPI 3 e o Swagger
 * 1 - Configurar as dependências requeridas do plugin spring open api no pom.xml
 * 2 - Acessar a url da documentação: http://127.0.0.1:8081/crud/swagger-ui.html
 * json: http://127.0.0.1:8081/crud/v3/api-docs
 * 
 * sonarqube server
 * 1 - docker pull sonarqube
 * 2 - docker run -p 9000:9000 sonarqube
 * 3 - http://localhost:9000 
 * 4 - Logar: usuário: admin , senha: admin
 * 5 - Configurar as propriedades do sonar no pom.xml
 * <properties>
		<!-- O endereço que leva da instalação do Sonar -->
		<sonar.host.url>http://localhost:9000</sonar.host.url>
		<sonar.login>admin</sonar.login>
		<sonar.password>admin</sonar.password>
	</properties>
 * 6 - Executar mvn compile sonar:sonar
 * 7 - Opcional configurar regras do sonar no eclipse: Window > Preferences > SonarLint > Rules Configuration
 
 * sonarlint plugin
 * 1 - Adicionar o plugin do eclipse
 * 2 - clicar com o botão direito no projeto ir em SonarLint, depois clicar em analyze
 * @author Breno
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableCaching
public class ScaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaCrudApplication.class, args);
	}

}
