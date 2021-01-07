CREATE TABLE IF NOT EXISTS player (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name varchar (30) NOT NULL,
    age INT NOT NULL,
    team varchar (30) NOT NULL,
    position varchar (20) NOT NULL
);