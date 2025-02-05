CREATE TABLE CITY (
	CITY_ID INT PRIMARY KEY,
	CITY_NAME CHAR(25)
);

CREATE TABLE CUSTOMER (
	ID INT PRIMARY KEY,
    CUSTOMER_NAME VARCHAR(255),
	CITY_ID INT,
    CUSTOMER_ADDRESS VARCHAR(255),
    CONTACT_PERSON VARCHAR(255),
    EMAIL VARCHAR(128),
    PHONE VARCHAR(128),
    FOREIGN KEY (CITY_ID) REFERENCES CITY(CITY_ID)
);

CREATE TABLE PRODUCT (
    ID INT PRIMARY KEY,
    SKU VARCHAR(32),
    PRODUCT_NAME VARCHAR(128),
    PRODUCT_DESCRIPTION TEXT,
    CURRENT_PRICE DECIMAL(8,2),
    QUANTITY_IN_STOCK INT
);

CREATE TABLE INVOICE (
	ID INT PRIMARY KEY,
    INVOICE_NUMBER VARCHAR(255),
    CUSTOMER_ID INT,
    USER_ACCOUNT_ID INT,
    TOTAL_PRICE DECIMAL(8,2),
    TIME_ISSUED DATETIME DEFAULT NULL,
    TIME_DUE DATETIME DEFAULT NULL,
    TIME_PAID DATETIME DEFAULT NULL,
    TIME_CANCELLED DATETIME DEFAULT NULL,
    TIME_REFUNDED DATETIME DEFAULT NULL,
    FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(ID)
);

CREATE TABLE INVOICE_ITEM (
	ID INT PRIMARY KEY,
    INVOICE_ID INT,
    PRODUCT_ID INT,
    QUANTITY INT,
    PRICE DECIMAL(8,2),
    LINE_TOTAL_PRICE DECIMAL(8,2),
    FOREIGN KEY (INVOICE_ID) REFERENCES INVOICE(ID),
    FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT(ID)
);

INSERT INTO CITY VALUES
	(1, 'VIENNA'),
    (2, 'BERLIN'),
    (3, 'HAMBURG'),
    (4, 'LONDON');

INSERT INTO customer (id, customer_name, city_id, customer_address, contact_person, email, phone)
VALUES 
(1, 'Drogerie Wien', 1, 'Deckergasse 15A', 'Emil Steinbach', 'emil@drogeriewien.com', '094234234'),
(2, 'Cosmetics Store', 4, 'Watling Street 347', 'Jeremy Corbyn', 'jeremy@c-store.org', '093923923'),
(3, 'Kosmetikstudio', 3, 'Rothenbaumchaussee 53', 'Willy Brandt', 'willy@kosmetikstudio.com', '0941562222'),
(4, 'Neue Kosmetik', 1, 'Karlsplatz 2', NULL, 'info@neuekosmetik.com', '094109253'),
(5, 'Bio Kosmetik', 2, 'Motzstraße 23', 'Clara Zetkin', 'clara@biokosmetik.org', '093825825'),
(6, 'K-Wien', 1, 'Kärntner Straße 204', 'Maria Rauch-Kallat', 'maria@kwien.org', '093427002'),
(7, 'Natural Cosmetics', 4, 'Clerkenwell Road 14B', 'Glenda Jackson', 'glena.j@natural-cosmetics.com', '093555123'),
(8, 'Kosmetik Plus', 2, 'Unter den Linden 1', 'Angela Merkel', 'angela@k-plus.com', '094727727'),
(9, 'New Line Cosmetics', 4, 'Devonshire Street 92', 'Oliver Cromwell', 'oliver@nlc.org', '093202404');

INSERT INTO product (id, sku, product_name, product_description, current_price, quantity_in_stock) VALUES
(1, 330120, 'Game Of Thrones - URBAN DECAY', 'Game Of Thrones Eyeshadow Palette', 65, 122),
(2, 330121, 'Advanced Night Repair - ESTEE LAUDER', 'Advanced Night Repair Synchronized Recovery Complex II', 98, 51),
(3, 330122, 'Rose Deep Hydration - FRESH', 'Rose Deep Hydration Facial Toner', 45, 34),
(4, 330123, 'Pore-Perfecting Moisturizer - TATCHA', 'Pore-Perfecting Moisturizer & Cleanser Duo', 25, 393),
(5, 330124, 'Capture Youth - DIOR', 'Capture Youth Serum Collection', 95, 74),
(6, 330125, 'Slice of Glow - GLOW RECIPE', 'Slice of Glow Set', 45, 40),
(7, 330126, 'Healthy Skin - KIEHL S SINCE 1851', 'Healthy Skin Squad', 68, 154),
(8, 330127, 'Power Pair! - IT COSMETICS', 'IT is Your Skincare Power Pair! Best-Selling Moisturizer & Eye Cream Duo', 80, 0),
(9, 330128, 'Dewy Skin Mist - TATCHA', 'Limited Edition Dewy Skin Mist Mini', 20, 281),
(10, 330129, 'Silk Pillowcase - SLIP', 'Silk Pillowcase Duo + Scrunchies Kit', 170, 0);

INSERT INTO invoice (id, invoice_number, customer_id, user_account_id, total_price, time_issued, time_due, time_paid, time_cancelled, time_refunded) VALUES
(1, 'in_25181b07ba800c8d2fc967fe991807d9', 7, 4, 1436, '2019-07-20 15:05:07', '2019-07-27 15:05:07', '2019-07-25 09:24:12', NULL, NULL),
(2, '8fba0000fd456b27502bf9f81e9d52481', 9, 2, 1000, '2019-07-20 15:07:11', '2019-07-27 15:07:11', '2019-07-20 15:10:32', NULL, NULL),
(3, '3b6638118246b6bcfd3dfd9be487599', 3, 2, 360, '2019-07-20 15:06:15', '2019-07-27 15:06:15', '2019-07-31 21:22:11', NULL, NULL),
(4, 'dfe7f0a01a682196ac0120a9adbb550', 5, 2, 1675, '2019-07-20 15:06:34', '2019-07-27 15:06:34', NULL, NULL, NULL),
(5, '2a24cc2ad4440d698878a0a1a71f70fa', 6, 2, 9500, '2019-07-20 15:06:42', '2019-07-27 15:06:42', NULL, '2019-07-22 11:17:02', NULL),
(6, 'cbd304872ca6257716bcab8fc43204d7', 4, 2, 150, '2019-07-20 15:08:15', '2019-07-27 15:08:15', '2019-07-27 13:42:45', NULL, '2019-07-27 14:11:20');

INSERT INTO invoice_item (id, invoice_id, product_id, quantity, price, line_total_price) VALUES
(1, 1, 1, 20, 65, 1300),
(2, 1, 7, 2, 68, 136),
(3, 1, 5, 10, 100, 1000),
(4, 3, 4, 1, 180, 360),
(5, 4, 1, 5, 65, 325),
(6, 4, 2, 10, 95, 950),
(7, 4, 4, 1, 100, 400),
(8, 5, 1, 100, 95, 9500),
(9, 6, 4, 6, 25, 150);

