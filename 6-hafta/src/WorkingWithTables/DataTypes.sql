Name            Range
smallint        -32768 to +32767
integer         -2147483648 to +2147483647
bigint          -9223372036854775808 to +9223372036854775807
decimal         up to 131072 digits before the decimal point; up to 16383 digits after the decimal point
numeric         up to 131072 digits before the decimal point; up to 16383 digits after the decimal point
real            6 decimal digits precision
double precision 15 decimal digits precision
smallserial     1 to 32767
serial          1 to 2147483647
bigserial       1 to 9223372036854775807




CREATE TABLE test(
real_type REAL,
double_type DOUBLE,
numeric_type NUMERIC
);

INSERT INTO test
VALUES(
1.12345678912345678912,
1.12345678912345678912,
1.12345678912345678912,
);


CREATE TABLE test2(
float4_type FLOAT4,
float8_type FLOAT8,
decimal_type DECIMAL
);

INSERT INTO test2
VALUES(
1.12345678912345678912,
1.12345678912345678912,
1.12345678912345678912,
);

SELECT (10+2); --type: integer (auto)
SELECT (10.0); --type: numeric (auto)
SELECT (10.0::INTEGER); --type: integer (manual)
SELECT (10.44444444444444::INTEGER); --type: integer (manual)
SELECT (10.44444444444444::REAL); --type: real (manual)
SELECT (10.44444444444444::DOUBLE PRECISION); --type: double precision (manual)