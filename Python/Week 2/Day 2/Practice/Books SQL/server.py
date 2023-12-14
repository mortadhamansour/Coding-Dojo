query=INSERT into users (first_name, last_name) VALUES ("Jane", "Amsden"), ("Emily", "Dixon"), ("Theodore", "Dostoevsky"), ("William", "Shapiro"), ("Lao", "Xiu");

query=INSERT into books (title, num_of_pages) VALUES ("C Sharp", 200), ("Java", 300), ("Python", 100), ("PHP", 500), ("Ruby", 150);

query=SET SQL_SAFE_UPDATES = 0;
UPDATE books SET title = "C#"
WHERE title = "C Sharp";



query=UPDATE users SET first_name = "Bill"
WHERE id = 4;



query=INSERT into favorites (user_id, book_id) 
VALUES (1, 1), (1, 2), (2, 1), (2, 2), (2, 3), (3, 1), (3, 2), (3, 3), (3, 4), (4, 1), (4, 2), (4, 3), (4, 4), (4,5);




query=SELECT users.first_name, users.last_name FROM users
JOIN favorites on users.id = user_id
JOIN books on favorites.book_id = books.id
WHERE books.id = 3;




DELETE from favorites
where book_id = 3 AND user_id = 1;


INSERT into favorites (user_id, book_id) 
VALUES (5, 2);

SELECT title from books
JOIN favorites as faves on faves.book_id = books.id
WHERE faves.user_id = 3;


SELECT first_name, last_name from users
JOIN favorites on users.id = favorites.user_id
WHERE favorites.book_id = 5;