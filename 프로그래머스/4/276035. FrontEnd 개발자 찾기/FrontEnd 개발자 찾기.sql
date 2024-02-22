-- 코드를 작성해주세요
-- & => 대응되는 비트가 모두 1이면 1을 반환함. (AND 연산)

SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE SKILL_CODE & (SELECT SUM(CODE) 
                    FROM SKILLCODES  
                    WHERE CATEGORY = 'Front End'
                    GROUP BY CATEGORY)
ORDER BY 1;