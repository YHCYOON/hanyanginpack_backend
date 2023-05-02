package com.hanyanginpack.hanyanginpack.box;

import com.hanyanginpack.hanyanginpack.DataNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/box")
@RestController
public class BoxController {

    private final BoxService boxService;

    public BoxController(BoxService boxService) {
        this.boxService = boxService;
    }

    @GetMapping
    public ResponseEntity<List<Box>> getBoxes() {
        List<Box> box = boxService.getBoxes();
        if (box.isEmpty()) {
            throw new DataNotFoundException("No data found");
        } else {
            return ResponseEntity.ok(box);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Box> getBoxById(@PathVariable Long id) {
        Box box = boxService.getBoxById(id);
        if (box == null) {
            throw new DataNotFoundException("No data found");
        } else {
            return ResponseEntity.ok(box);
        }
    }

    @PostMapping
    public ResponseEntity<Box> createBox(@RequestBody Box box) {
        try {
            Box createdBox = boxService.createBox(box);
            return ResponseEntity.ok(createdBox);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
