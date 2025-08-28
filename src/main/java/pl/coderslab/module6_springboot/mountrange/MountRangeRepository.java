package pl.coderslab.module6_springboot.mountrange;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MountRangeRepository extends JpaRepository<MountRange, Long> {
    public MountRange findByName(String name);
}
