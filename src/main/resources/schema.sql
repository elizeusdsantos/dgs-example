-- COMPANIES
DROP TABLE IF EXISTS companies;

CREATE TABLE companies (
  id INT auto_increment PRIMARY KEY,
  company_name VARCHAR(200),
  domain VARCHAR(200),
  year_founded INT
);
