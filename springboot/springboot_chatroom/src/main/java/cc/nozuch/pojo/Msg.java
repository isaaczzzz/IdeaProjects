package cc.nozuch.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Msg {
    private int id;
    private String message;
    private Timestamp time;
}
