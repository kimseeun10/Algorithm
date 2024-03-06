-- 코드를 입력하세요
SELECT B.LEV AS HOUR, NVL(A.CNT,0) AS COUNT 
FROM (SELECT TO_CHAR(DATETIME,'HH24') AS HOUR, COUNT(TO_CHAR(DATETIME, 'HH24'))  AS CNT
FROM ANIMAL_OUTS 
GROUP BY TO_CHAR(DATETIME,'HH24')) A RIGHT OUTER JOIN (SELECT 
                                                        LEVEL -1 AS LEV
                                                        FROM DUAL
                                                        CONNECT BY LEVEL <= 24)B
ON A.HOUR = B.LEV
ORDER BY LEV