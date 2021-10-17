package project.wordsearchapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/wordgrid")
public class WordSearchController {

    @PostMapping
    public String createWordGrid(int girdSize, List<String> words) {
        return "";
    }
}
