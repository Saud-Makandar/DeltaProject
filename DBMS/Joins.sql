SELECT users.name,ADDR.street
From users
INNER JOIN ADDR ON users.id=ADDR.user_id;

SELECT users.name,ADDR.street
From users
Left JOIN ADDR ON users.id=ADDR.user_id;

SELECT users.name,ADDR.street
From users
Right JOIN ADDR ON users.id=ADDR.user_id;

# users.name,ADDR.street
#From users
#Full JOIN ADDR ON users.id=ADDR.user_id;
#Full join not supported


