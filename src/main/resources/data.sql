INSERT INTO Language
  ( id, name, message )
VALUES
  (1, 'English', 'Hello World!'), 
  (2, 'Serbian' , 'Cao Svete!'), 
  (3, 'German', 'Hallo Welt!'),
  (4, 'French', 'Bonjour le monde!'),
  (5, 'Spanish', 'Hola Mundo!'), 
  (6, 'Italian' , 'Ciao mondo!'), 
  (7, 'Russian', 'Привет мир!'),
  (8, 'Portugese', 'Olá Mundo!'),
  (9, 'Swedish', 'Hej världen!'),
  (10, 'Polish', 'Witaj świecie!');
  
 INSERT INTO roles (name) VALUES ('ADMIN');
 INSERT INTO roles (name) VALUES ('USER');
 INSERT INTO users (username, password, enabled) VALUES ('admin', '$2a$10$bN7OWEvi6rTqJEYbZfDOg.FHmG.xPTDxJR1k9LzsR4O6Nt8zuIKwq', '1');
 INSERT INTO users (username, password, enabled) VALUES ('guest', '$2a$12$Sv0XLb0sNglr5mhWIms8uO25gPTzvu7IudjNQdKij3JKhc6IcNiiS', '1');
 INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
 INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);