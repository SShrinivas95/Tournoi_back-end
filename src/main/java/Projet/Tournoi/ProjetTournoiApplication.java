package Projet.Tournoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class ProjetTournoiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetTournoiApplication.class, args );
	}

	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200")); // Autoriser toutes les origines (pour le développement, vous pouvez spécifier des origines spécifiques)
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin","Content-Type"
		,"Accept","Authorization","Origin , Accept","X-Requested-With"
		,"Access-Control-Request-Method","Access-Control-Request-Headers")); // Autoriser tous les en-têtes HTTP
		corsConfiguration.setAllowCredentials(true); // Autoriser l'envoi de cookies
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", corsConfiguration); // Appliquer la configuration CORS à toutes les URL

		return new CorsFilter(source);
	}
}
