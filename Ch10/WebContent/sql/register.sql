CREATE TABLE board(
    num         NUMBER(5)       PRIMARY KEY,
    pass        VARCHAR2(30)    NOT NULL,
    name        VARCHAR2(30)    NOT NULL,
    email       VARCHAR2(30)    NOT NULL,
    title       VARCHAR2(50)    NOT NULL,
    content     VARCHAR2(1000)  NOT NULL,
    readcount   NUMBER(4)       DEFAULT 0,
    writedate   DATE            DEFAULT SYSDATE
);
CREATE SEQUENCE board_seq START WITH 1 INCREMENT BY 1;

INSERT INTO board(num, pass, name, email, title, content)
VALUES(board_seq.nextval, '1234', 'ryan', 'ryan@gmail.com', '게시글1', '나도 개발자다!');
COMMIT;

SELECT
    *
FROM board;
