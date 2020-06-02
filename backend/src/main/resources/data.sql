DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL
);

CREATE TABLE lateness (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  fk_user_id INT NOT NULL,
  minutes NUMERIC NOT NULL
);


INSERT INTO users (first_name, last_name) VALUES
  ('Teszt', 'Adat'),
  ('Teszt', 'Adat2'),
  ('Teszt', 'Adat3'),
  ('Teszt', 'Adat4');