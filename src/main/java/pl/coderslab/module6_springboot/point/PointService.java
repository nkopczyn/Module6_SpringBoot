package pl.coderslab.module6_springboot.point;

import org.springframework.stereotype.Service;

@Service
public class PointService {
    private final PointRepository pointRepository;

    public PointService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    public Point getPointById(Long startId) {
        return pointRepository.findById(startId).orElse(null);
    }
}
