-- 코드를 입력하세요

SELECT  ANIMAL_TYPE,COUNT(ANIMAL_TYPE) COUNT
FROM ANIMAL_INS 
GROUP BY ANIMAL_TYPE
HAVING ANIMAL_TYPE = 'Dog' OR ANIMAL_TYPE = 'Cat'
ORDER BY ANIMAL_TYPE ASC;

