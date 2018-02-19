ALTER table food DROP FOREIGN KEY user_id___fk;
delete from user;
INSERT INTO user VALUES (1,'Alex','Marks','alexmarks','tasty'),(2,'Mike','Marks','mikemarks','orange'),(3,'Emily','Marks','emilymarks','chocolate'), (4,'Fred','Flintstone','helloFred','chocolate');
ALTER TABLE food ADD CONSTRAINT user_id FOREIGN KEY (user_id) REFERENCES user(id);
