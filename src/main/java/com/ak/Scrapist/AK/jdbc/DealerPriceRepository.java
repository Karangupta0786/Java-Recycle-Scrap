package com.ak.Scrapist.AK.jdbc;

import com.ak.Scrapist.AK.model.DealerPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealerPriceRepository extends JpaRepository<DealerPrice,Long> {
    List<DealerPrice> findByDealerId(Long dealerId);
}
