package kr.hs.dgsw.boardback.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/board")
public class BoardController {

    @GetMapping("/list")
    public List list() {
        @Getter
        class TempBoard {
            int id;
            String author;
            String title;
            @JsonFormat(pattern = "yyyy-MM-dd H:mm:ss")
            LocalDateTime created;
            private TempBoard(int id, String author, String title, LocalDateTime created) {
                this.id = id;
                this.author = author;
                this.title = title;
                this.created = created;
            }
        }
        List<TempBoard> list = new ArrayList<>();
        list.add(new TempBoard(1, "작성자1", "제목1", LocalDateTime.now()));
        return list;
    }
}
