package com.projeto.place_services.web;

import com.projeto.place_services.api.PlaceResponse;
import com.projeto.place_services.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
