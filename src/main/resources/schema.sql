
CREATE TABLE IF NOT EXISTS Content (
    id INTEGER AUTO_INCREMENT,
    title varchar(255) NOT NULL,
    description text,
    status VARCHAR(100) NOT NULL,
    content_type VARCHAR(58) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255),
    primary key (id)
    );
-- INSERT INTO Content (title, `desc`, status, contentType, dateCreated, dateUpdated, url)
-- SELECT 'SpringBoot-First-Blog-post', 'springboot project', 'IDEA', 'bLOG', CURRENT_DATE, NULL, 'http://localhost/8080'
-- UNION ALL
-- SELECT 'SpringBoot-Second-Blog-post', 'springboot project 2', 'IDEA', 'updates', CURRENT_DATE, NULL, 'http://localhost/8080';
