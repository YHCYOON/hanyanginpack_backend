CREATE DATABASE hanyanginpack CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

DROP TABLE IF EXISTS BOX;

CREATE TABLE BOX(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(100) DEFAULT 'default',
    image_path VARCHAR(300) NOT NULL,
    client VARCHAR(100) DEFAULT NULL,
    create_date DATETIME NOT NULL,
    description TEXT DEFAULT NULL,
    primary key (id)
);
