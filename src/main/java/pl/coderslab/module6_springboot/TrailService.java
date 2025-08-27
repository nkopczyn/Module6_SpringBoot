package pl.coderslab.module6_springboot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrailService {

    private final TrailRepository trailRepository;

    public TrailService(TrailRepository trailRepository) {
        this.trailRepository = trailRepository;
    }

    public List<Trail> getAllTrails() {
        return trailRepository.findAll();
    }
}
