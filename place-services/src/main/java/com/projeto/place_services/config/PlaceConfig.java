package com.projeto.place_services.config;

import com.projeto.place_services.domain.PlaceRepository;
import com.projeto.place_services.domain.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

@Configuration
@EnableR2dbcAuditing
public class PlaceConfig {

    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }
}
