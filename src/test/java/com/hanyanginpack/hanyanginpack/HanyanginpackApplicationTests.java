package com.hanyanginpack.hanyanginpack;

import com.hanyanginpack.hanyanginpack.box.Box;
import com.hanyanginpack.hanyanginpack.box.BoxService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class HanyanginpackApplicationTests {

    @Autowired
    private BoxService boxService;

    @Test
    @DisplayName("박스생성")
    void 박스생성() {
        String name = "테스트박스";
        String imagePath = "C:/project/hanyanginpack/src/main/resources/static/img/box/라이언.jpg";
        Box box = new Box(name, imagePath);
        boxService.createBox(box);
        System.out.println(ResponseEntity.ok(boxService.createBox(box)));
    }

    @Test
    @DisplayName("박스조회")
    void 박스조회() {
        System.out.println(ResponseEntity.ok(boxService.getBoxes()));
    }

}
