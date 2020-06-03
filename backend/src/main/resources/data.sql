DROP TABLE IF EXISTS delay;



CREATE TABLE delay (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR (250) NOT NULL,
  minutes NUMERIC NOT NULL,
  delay_date DATE NOT NULL
);


-- INSERT INTO delay (name, minutes, delay_date) VALUES
-- ('kiskutya', 4, CURRENT_DATE ),
-- ('kiskutya', 5, CURRENT_DATE ),
-- ('kiskutya', 6, CURRENT_DATE ),
-- ('kiskutya', 7, CURRENT_DATE ),
-- ('kiscica', 4, CURRENT_DATE ),
-- ('kiscica', 22, CURRENT_DATE ),
-- ('kiscica', 6, CURRENT_DATE ),
-- ('kiscica', 4, CURRENT_DATE );
