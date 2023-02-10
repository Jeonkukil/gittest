package shop.mtcoding.reblog.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
public class Board {
    private int id;
    private String title;
    private String content;
    private int userId;
    private Timestamp createdAt;
}
