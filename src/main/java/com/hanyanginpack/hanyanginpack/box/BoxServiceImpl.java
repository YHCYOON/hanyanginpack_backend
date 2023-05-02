package com.hanyanginpack.hanyanginpack.box;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoxServiceImpl implements BoxService{

    private final BoxRepository boxRepository;

    public BoxServiceImpl(BoxRepository boxRepository) {
        this.boxRepository = boxRepository;
    }

    @Override
    public List<Box> getBoxes() {
        return boxRepository.findAll();
    }

    @Override
    public Box getBoxById(Long id) {
        Optional<Box> box = boxRepository.findById(id);
        return box.get();
    }

    @Override
    public Box createBox(Box box) {
        return boxRepository.save(box);
    }
}
