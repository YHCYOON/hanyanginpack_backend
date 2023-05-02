package com.hanyanginpack.hanyanginpack.box;

import java.util.List;
import java.util.Optional;

public interface BoxService {

    List<Box> getBoxes();

    Box getBoxById(Long id);

    Box createBox(Box box);
}
