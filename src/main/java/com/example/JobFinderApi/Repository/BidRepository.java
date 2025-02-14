package com.example.JobFinderApi.Repository;

import com.example.JobFinderApi.Pojo.Entity.Bid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends CrudRepository<Bid,Integer> {
    Bid findById(int id);
}
