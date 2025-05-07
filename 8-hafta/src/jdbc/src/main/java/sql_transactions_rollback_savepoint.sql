CREATE TABLE accounts(
                         id SERIAL PRIMARY KEY ,
                         owner VARCHAR(100),
                         balance NUMERIC
);

INSERT INTO accounts(owner, balance)
VALUES ('Ali',1000),
       ('Veli',500);



BEGIN ; -- Transaction başlatılır
UPDATE accounts SET balance = balance -200 WHERE owner='Ali';
UPDATE accounts SET balance = balance +200 WHERE owner='Veli';
COMMIT ; -- Değişiklikleri kaydeder




BEGIN ;
UPDATE accounts SET balance = balance -100 WHERE owner='Ali';
UPDATE accountz SET balance = balance +100 WHERE owner='Veli';
ROLLBACK ; -- Tüm işlemler iptal edilir


BEGIN;
INSERT INTO employees(employee_id,first_name,department_id,salary)
VALUES (9,'Ahmet',2,10000),
       (10,'Mehmet',2,15000);
COMMIT;

BEGIN;
UPDATE employees set salary = salary +1000 WHERE department_id=1;
savepoint before_hr;
UPDATE employees set salary = salary +2000 WHERE department_id=2;
ROLLBACK TO before_hr;
COMMIT;
