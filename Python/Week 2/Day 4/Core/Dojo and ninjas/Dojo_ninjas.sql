



INSERT INTO dojos (id, name) VALUES (1, 'Dojo 1');
INSERT INTO dojos (id, name) VALUES (2, 'Dojo 2');
INSERT INTO dojos (id, name) VALUES (3, 'Dojo 3');
DELETE FROM dojos WHERE id IN (1, 2, 3);
INSERT INTO dojo (id, name) VALUES (4, 'Dojo 4');
INSERT INTO dojo (id, name) VALUES (5, 'Dojo 5');
INSERT INTO dojo (id, name) VALUES (6, 'Dojo 6');
INSERT INTO ninjas (id, first_name,last_name ) VALUES (1, 'Ninja 1','ninja1' );
INSERT INTO ninjas (id, first_name,last_name ) VALUES (2, 'Ninja 2','ninja1' );
INSERT INTO ninjas (id, first_name,last_name ) VALUES (3, 'Ninja 3','ninja1' );
INSERT INTO ninjas (id, name, dojo_id) VALUES (4, 'Ninja 4', 5);
INSERT INTO ninjas (id, name, dojo_id) VALUES (5, 'Ninja 5', 5);
INSERT INTO ninjas (id, name, dojo_id) VALUES (6, 'Ninja 6', 5);
iNSERT INTO ninjas (id, name, dojo_id) VALUES (7, 'Ninja 7', 6);
INSERT INTO ninjas (id, name, dojo_id) VALUES (8, 'Ninja 8', 6);
INSERT INTO ninjas (id, name, dojo_id) VALUES (9, 'Ninja 9', 6);
SELECT * FROM ninjas WHERE id = 4;
SELECT dojo.* FROM dojos JOIN ninjas ON Dojos_dojo_id = ninjas.id WHERE ninjas.id = 9;










