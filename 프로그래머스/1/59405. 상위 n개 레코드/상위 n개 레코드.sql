-- 코드를 입력하세요
SELECT *
FROM(
    SELECT NAME 
    FROM ANIMAL_INS 
    ORDER BY DATETIME 
)
where ROWNUM = 1