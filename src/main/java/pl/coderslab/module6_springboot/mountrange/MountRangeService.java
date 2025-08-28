package pl.coderslab.module6_springboot.mountrange;

import org.springframework.stereotype.Service;

@Service
public class MountRangeService {
    private MountRangeRepository mountRangeRepository;

    public MountRangeService(MountRangeRepository mountRangeRepository) {
        this.mountRangeRepository = mountRangeRepository;
    }

    public MountRange getMountRangeByName(String name) {
        return mountRangeRepository.findByName(name);
    }
}
