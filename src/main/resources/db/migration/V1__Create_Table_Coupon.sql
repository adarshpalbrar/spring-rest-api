create table coupon(
       id int AUTO_INCREMENT PRIMARY KEY,
       code varchar(20) UNIQUE,
       discount decimal(8,3),
       expiry_date varchar(100)
);