package io.javabrains.c19tracker.repository;

import io.javabrains.c19tracker.models.LocationStats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationStatsRepo extends MongoRepository<LocationStats, String> {
    public LocationStats findByCountry(String country);

}
