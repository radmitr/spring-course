USE my_db;

UPDATE users SET password = '{bcrypt}$2a$10$WK4WWZHbghS1tOvnVAes4OE.NQjSWzJX8lqYNNQaelm05Mk/dtTZO'
WHERE username = 'dmitriy';

UPDATE users SET password = '{bcrypt}$2a$10$R6lDfd/EENQ/ugjCgasBReKU1vnYz4JtpzELZLk8fBqRPXYX75a1m'
WHERE username = 'elena';

UPDATE users SET password = '{bcrypt}$2a$10$1YWrEE/zAVKfz4zmbpzd0eRdOMisd/.HjrYBESmtLVdkGp7tJocxm'
WHERE username = 'ivan';
