
CREATE TABLE IF NOT EXISTS Content (
    id INTEGER AUTO_INCREMENT,
    title varchar(255) NOT NULL,
    `desc` text,
    `status` VARCHAR(100) NOT NULL,
    contentType VARCHAR(58) NOT NULL,
    dateCreated TIMESTAMP NOT NULL,
    dateUpdated TIMESTAMP,
    url VARCHAR(255),
    primary key (id)
    );

-- INSERT INTO Content (title, `desc`, status, contentType, dateCreated, dateUpdated, url)
-- SELECT 'SpringBoot-First-Blog-post', 'springboot project', 'IDEA', 'bLOG', CURRENT_DATE, NULL, 'http://localhost/8080'
-- UNION ALL
-- SELECT 'SpringBoot-Second-Blog-post', 'springboot project 2', 'IDEA', 'updates', CURRENT_DATE, NULL, 'http://localhost/8080';
