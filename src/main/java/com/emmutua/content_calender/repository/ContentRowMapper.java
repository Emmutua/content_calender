package com.emmutua.content_calender.repository;

import com.emmutua.content_calender.model.Content;
import com.emmutua.content_calender.model.Status;
import com.emmutua.content_calender.model.Type;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.jdbc.core.RowMapper;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
//get meaning ful result set

public class ContentRowMapper implements RowMapper<Content> {

    @Override
    public Content mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Content(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("desc"),
//                Status.valueOf(rs.getString("status")),
//                Type.valueOf(rs.getString("contentType")),
                rs.getString("status"),
                rs.getString("contentType"),
                //rs.getTimestamp("dateCreated").toLocalDateTime(),
                rs.getObject("dateCreated", LocalDateTime.class),
                rs.getObject("dateUpdated",LocalDateTime.class),
                rs.getString("url")
        );
    }

}

