-- 코드를 입력하세요
SELECT FLAVOR
FROM(SELECT F.FLAVOR, SUM(F.TOTAL_ORDER+J.TOTAL_ORDER) AS PRICE, RANK() OVER(ORDER BY SUM(F.TOTAL_ORDER+J.TOTAL_ORDER) DESC )  AS RANK_T
        FROM FIRST_HALF F JOIN JULY J
        ON F.FLAVOR = J.FLAVOR
        WHERE F.FLAVOR = J.FLAVOR
        GROUP BY F.FLAVOR)
WHERE rank_t < 4
        
